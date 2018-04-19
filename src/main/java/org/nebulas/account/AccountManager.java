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

    Keystore keystore;

    String keydir;

    Algorithm encryptAlg;
    Algorithm signatureAlg;

    Map<String, Account> accountMap;

    public AccountManager() throws Exception {
        this.encryptAlg = Algorithm.SCRYPT;
        this.signatureAlg = Algorithm.SECP256K1;
        this.keydir = DEFAULTKEYDIR;

        this.keystore = new Keystore(this.encryptAlg);
        this.accountMap = Maps.newConcurrentMap();
    }

    public Address NewAccount(byte[] passphrase) throws Exception {
        PrivateKey privateKey = Crypto.NewPrivateKey(this.signatureAlg, null);
        return updateAccount(privateKey, passphrase);
    }

   private Address updateAccount(PrivateKey privateKey, byte[] passphrase) throws Exception {
       byte[] pub = privateKey.PublicKey().Encoded();
       Address address = Address.NewAddressFromPubKey(pub);
       this.keystore.SetKey(address.String(), privateKey, passphrase);
       privateKey.Clear();

       Account account = this.accountMap.get(address.String());
       if (account == null) {
           account = new Account(address);
           this.accountMap.put(address.String(), account);
       }
       return address;
   }

   public List<Address> Accounts() {
        List<Address> addresses = Lists.newArrayList();
        for (Account account : this.accountMap.values()) {
            addresses.add(account.getAddress());
        }
        return addresses;
   }

    public boolean Contains(Address address) {
        for ( String addr : accountMap.keySet()) {
            if (addr == address.String()) {
                return true;
            }
        }
        return false;
    }

    public void Update(Address address, byte[] oldPassphrase, byte[] passphrase) throws Exception {
        Key key = this.keystore.GetKey(address.String(), oldPassphrase);
        updateAccount((PrivateKey) key, passphrase);
    }

    public Address Load(byte[] keyData, byte[] passphrase) throws Exception {
        String keyStr = new String(keyData);
        KeyJSON keyJSON = JSONUtils.Parse(keyStr, KeyJSON.class);

        Cipher cipher = new Cipher(this.encryptAlg);
        byte[] key = cipher.Decrypt(keyJSON.crypto, passphrase);
        PrivateKey privateKey = Crypto.NewPrivateKey(this.signatureAlg, key);
        return updateAccount(privateKey, passphrase);
    }

    public byte[] Export(Address address, byte[] passphrase) throws Exception {
        Key key = keystore.GetKey(address.String(), passphrase);
        Cipher cipher = new Cipher(this.encryptAlg);
        CryptoJSON cryptoJSON = cipher.Encrypt(key.Encoded(), passphrase);

        KeyJSON keyJSON = new KeyJSON(address.String(), cryptoJSON);
        return JSONUtils.Stringify(keyJSON).getBytes();
    }

    public void Delete(Address address, byte[] passphrase) throws Exception {
        keystore.Delete(address.String(), passphrase);
    }

    public byte[] SignHash(Address address, byte[] hash, byte[] passphrase) throws Exception {
        Key key = keystore.GetKey(address.String(), passphrase);
        Signature signature = Crypto.NewSignature(this.signatureAlg);
        signature.InitSign((PrivateKey) key);
        return signature.Sign(hash);
    }

}
