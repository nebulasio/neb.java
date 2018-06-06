package io.nebulas.account;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.nebulas.core.Address;
import io.nebulas.core.Transaction;
import io.nebulas.crypto.Crypto;
import io.nebulas.crypto.cipher.Cipher;
import io.nebulas.crypto.cipher.CryptoJSON;
import io.nebulas.crypto.keystore.*;
import io.nebulas.util.JSONUtils;

import java.util.List;
import java.util.Map;

/**
 * The Account manager class.
 * <p>Account manager handles account related tasks. Such as
 * <ul>
 *     <li>build a new account with password</li>
 *     <li>manages multi accounts, together with their private key and password</li>
 *     <li>load account form KeyJson data(from file)</li>
 *     <li>export KeyJson data for a account</li>
 *     <li>sign transactions with public key of the sender account</li>
 *     <li>sign hash data with a given account and it's password</li>
 * </ul>
 * <p>There are two crypt algorithm used here:
 * <ul>
 *     <li>SCRYPT: used to encrypt private key to generate KeyJson data</li>
 *     <li>SECP256K1: it's a ECDSA on curve Secp256k1, used to generate public key and sign/verify transactions</li>
 * </ul>
 * <br>
 * <p>We were planning to develop a java Nebulas node, that's why we designed this AccountManager rather use Account directly.
 * And account wallet file should automatically saved to the keyPath directory, but it is not implemented now.
 * Please remember to export the KeyJson data and save it by you-self when generate a new account with {@link #newAccount(byte[] passphrase)}.
 *
 */
public class AccountManager {

    private static final String DEFAULTKEYDIR = "keydir";

    private Keystore keystore;

    private String keydir;

    private Algorithm encryptAlg;
    private Algorithm signatureAlg;

    private Map<String, Account> accountMap;

    /**
     * Constructs a new Account manager.
     *
     * @throws Exception
     */
    public AccountManager() throws Exception {
        this.encryptAlg = Algorithm.SCRYPT;
        this.signatureAlg = Algorithm.SECP256K1;
        this.keydir = DEFAULTKEYDIR;

        this.keystore = new Keystore(this.encryptAlg);
        this.accountMap = Maps.newConcurrentMap();
    }

    /**
     * Get keystore.
     *
     * @return the keystore
     */
    public Keystore getKeystore() {
        return keystore;
    }

    /**
     * Gets key directory of this AccountManager. Key Directory is the local directory where key file is stored.
     *
     * @return the keydir
     */
    public String getKeydir() {
        return keydir;
    }

    /**
     * Get encrypt algorithm. Encrypt algorithm is used to encrypt
     *
     * @return the encrypt algorithm
     */
    public Algorithm getEncryptAlg() {
        return encryptAlg;
    }

    /**
     * Gets signature algorithm.
     *
     * @return the signature algorithm
     */
    public Algorithm getSignatureAlg() {
        return signatureAlg;
    }

    /**
     * Generate a new account with given password and add it into the AccountManager.
     * The password is used to crypt your private key when generating the KeyJson data,
     * please DO NOT forget your password!
     * <p><b>Please note that don't forget to {@link #export(Address, byte[])} this new account
     * and save it to a file. Or you will lose this account forever after a restart! </b>
     *
     * @param passphrase the passphrase for the
     * @return the address
     * @throws Exception the exception
     */
    public Address newAccount(byte[] passphrase) throws Exception {
        PrivateKey privateKey = Crypto.NewPrivateKey(this.signatureAlg, null);
        return updateAccount(privateKey, passphrase);
    }

    /**
     * Add a new account to AccountManager.
     *
     * @param privateKey the private key of new account
     * @param passphrase the password of account
     * @return the address of this account that has just been updated
     * @throws Exception
     */
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

    /**
     * Get a list of accounts in this AccountManager.
     *
     * @return the list of accounts
     */
   public List<Address> accounts() {
        List<Address> addresses = Lists.newArrayList();
        for (Account account : this.accountMap.values()) {
            addresses.add(account.getAddress());
        }
        return addresses;
   }

    /**
     * To check if the AccountManager contains a given address.
     *
     * @param address the address to be checked
     * @return the boolean result.
     */
    public boolean contains(Address address) {
        for ( String addr : accountMap.keySet()) {
            if (addr.equalsIgnoreCase(address.string())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Change a new password for an account address.
     *
     * @param address       the account address
     * @param oldPassphrase the old passphrase
     * @param passphrase    the new passphrase
     * @throws Exception the exception
     */
    public void update(Address address, byte[] oldPassphrase, byte[] passphrase) throws Exception {
        Key key = this.keystore.getKey(address.string(), oldPassphrase);
        updateAccount((PrivateKey) key, passphrase);
    }

    /**
     * Load an account from the KeyJson data and account passphrase.
     * By loading an account, the private key will be decrypted from KeyJson file,
     * and then add this account into AccountManager.
     *
     * @param keyData    the KeyJson data
     * @param passphrase the passphrase for decrypting this KeyJson
     * @return the address address
     * @throws Exception the exception
     */
    public Address load(byte[] keyData, byte[] passphrase) throws Exception {
        String keyStr = new String(keyData);
        KeyJSON keyJSON = JSONUtils.Parse(keyStr, KeyJSON.class);
        keyJSON.crypto.setVersion(keyJSON.version);

        Cipher cipher = new Cipher(this.encryptAlg);
        byte[] key = cipher.decrypt(keyJSON.crypto, passphrase);
        PrivateKey privateKey = Crypto.NewPrivateKey(this.signatureAlg, key);
        return updateAccount(privateKey, passphrase);
    }

    /**
     * Export account's keyJson data, the data is a byte array.
     * You should save this data into a JSON file.
     * @see KeyJSON
     * @param address    the account address
     * @param passphrase the passphrase of account address
     * @return the byte [ ]
     * @throws Exception the exception
     */
    public byte[] export(Address address, byte[] passphrase) throws Exception {
        Key key = keystore.getKey(address.string(), passphrase);
        Cipher cipher = new Cipher(this.encryptAlg);
        CryptoJSON cryptoJSON = cipher.encrypt(key.encode(), passphrase);

        KeyJSON keyJSON = new KeyJSON(address.string(), cryptoJSON);
        return JSONUtils.Stringify(keyJSON).getBytes();
    }

    /**
     * Delete an account in AccountManager.
     *
     * @param address    the account address to be deleted
     * @param passphrase the passphrase of this account
     * @throws Exception the exception
     */
    public void delete(Address address, byte[] passphrase) throws Exception {
        keystore.delete(address.string(), passphrase);
        accountMap.remove(address.string());
    }

    /**
     * Sign the hash data.
     * The signature algorithm used here is ECDSA on curve Secp256k1.
     * The hash data should be a array of 32 bytes, and here it's the SHA3256 hash value of some data.    //todo
     *
     * @param address    the account address
     * @param hash       the hash data to be signed
     * @param passphrase the passphrase
     * @return the signed data
     * @throws Exception if the hash data is not 32 bytes //todo
     */
    public byte[] signHash(Address address, byte[] hash, byte[] passphrase) throws Exception {
        Key key = keystore.getKey(address.string(), passphrase);
        Signature signature = Crypto.NewSignature(this.signatureAlg);
        signature.initSign((PrivateKey) key);
        return signature.sign(hash);
    }

    /**
     * Sign the transaction.
     * Calculate the SHA3256 hash of the given transaction first, and then sign the hash data with ECDSA (Secp256k1).
     *
     * @param transaction the transaction tobe signed
     * @param passphrase  the passphrase of the transaction sender account
     * @throws Exception the exception
     */
    public void signTransaction(Transaction transaction, byte[] passphrase) throws Exception {
        Key key = keystore.getKey(transaction.getFrom().string(), passphrase);
        Signature signature = Crypto.NewSignature(this.signatureAlg);
        signature.initSign((PrivateKey) key);
        transaction.sign(signature);
        key.clear();
    }

}
