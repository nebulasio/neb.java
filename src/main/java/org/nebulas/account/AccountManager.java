package org.nebulas.account;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.nebulas.core.Address;
import org.nebulas.crypto.Crypto;
import org.nebulas.crypto.cipher.Cipher;
import org.nebulas.crypto.cipher.CryptoJSON;
import org.nebulas.crypto.keystore.*;
import org.nebulas.util.JSONUtils;

import java.util.List;
import java.util.Map;

public class AccountManager {

    private static final String DEFAULTKEYDIR = "keydir";

    private Keystore keystore;

    private String keydir;

    private Algorithm encryptAlg;
    private Algorithm signatureAlg;

    private Map<String, Account> accountMap;

    public AccountManager() throws Exception {
        this.encryptAlg = Algorithm.SCRYPT;
        this.signatureAlg = Algorithm.SECP256K1;
        this.keydir = DEFAULTKEYDIR;

        this.keystore = new Keystore(this.encryptAlg);
        this.accountMap = Maps.newConcurrentMap();
    }

    public Keystore getKeystore() {
        return keystore;
    }

    public String getKeydir() {
        return keydir;
    }

    public Algorithm getEncryptAlg() {
        return encryptAlg;
    }

    public Algorithm getSignatureAlg() {
        return signatureAlg;
    }

    public Address newAccount(byte[] passphrase) throws Exception {
        PrivateKey privateKey = Crypto.NewPrivateKey(this.signatureAlg, null);
        return updateAccount(privateKey, passphrase);
    }

   private Address updateAccount(PrivateKey privateKey, byte[] passphrase) throws Exception {
       byte[] pub = privateKey.publickey().encode();
       Address address = Address.NewAddressFromPubKey(pub);
       this.keystore.setKey(address.string(), privateKey, passphrase);
       privateKey.clear();

       Account account = this.accountMap.get(address.string());
       if (account == null) {
           account = new Account(address);
           this.accountMap.put(address.string(), account);
       }
       return address;
   }

   public List<Address> accounts() {
        List<Address> addresses = Lists.newArrayList();
        for (Account account : this.accountMap.values()) {
            addresses.add(account.getAddress());
        }
        return addresses;
   }

    public boolean contains(Address address) {
        for ( String addr : accountMap.keySet()) {
            if (addr.equalsIgnoreCase(address.string())) {
                return true;
            }
        }
        return false;
    }

    public void update(Address address, byte[] oldPassphrase, byte[] passphrase) throws Exception {
        Key key = this.keystore.getKey(address.string(), oldPassphrase);
        updateAccount((PrivateKey) key, passphrase);
    }

    public Address load(byte[] keyData, byte[] passphrase) throws Exception {
        String keyStr = new String(keyData);
        KeyJSON keyJSON = JSONUtils.Parse(keyStr, KeyJSON.class);

        Cipher cipher = new Cipher(this.encryptAlg);
        byte[] key = cipher.decrypt(keyJSON.crypto, passphrase);
        PrivateKey privateKey = Crypto.NewPrivateKey(this.signatureAlg, key);
        return updateAccount(privateKey, passphrase);
    }

    public byte[] export(Address address, byte[] passphrase) throws Exception {
        Key key = keystore.getKey(address.string(), passphrase);
        Cipher cipher = new Cipher(this.encryptAlg);
        CryptoJSON cryptoJSON = cipher.encrypt(key.encode(), passphrase);

        KeyJSON keyJSON = new KeyJSON(address.string(), cryptoJSON);
        return JSONUtils.Stringify(keyJSON).getBytes();
    }

    public void delete(Address address, byte[] passphrase) throws Exception {
        keystore.delete(address.string(), passphrase);
        accountMap.remove(address.string());
    }

    public byte[] signHash(Address address, byte[] hash, byte[] passphrase) throws Exception {
        Key key = keystore.getKey(address.string(), passphrase);
        Signature signature = Crypto.NewSignature(this.signatureAlg);
        signature.initSign((PrivateKey) key);
        return signature.sign(hash);
    }

}
