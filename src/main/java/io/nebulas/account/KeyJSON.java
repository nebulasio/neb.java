package io.nebulas.account;


import io.nebulas.crypto.cipher.CryptoJSON;

import java.util.UUID;

/**
 * The KeyJson is the information for account wallet file.
 * It contains the account address string, the crypt private key (by SCRYPT), the UUID, and the KeyJson version number.
 */
public class KeyJSON {
    /**
     * The Address.
     */
    String address;
    /**
     * The Crypto data, which is the private key crypt by SCRYPT algorithm.
     */
    CryptoJSON crypto;
    /**
     * The UUID of this KeyJson.
     */
    String id;
    /**
     * The KeyJson Version number.
     */
    int version;

    /**
     * Constructs a new KeyJson.
     *
     * @param address the address
     * @param crypto  the crypto
     */
    public KeyJSON(String address, CryptoJSON crypto) {
        this.address = address;
        this.crypto = crypto;
        this.id = UUID.randomUUID().toString();
        this.version = CryptoJSON.VERSION;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets crypto.
     *
     * @return the crypto
     */
    public CryptoJSON getCrypto() {
        return crypto;
    }

    /**
     * Sets crypto.
     *
     * @param crypto the crypto
     */
    public void setCrypto(CryptoJSON crypto) {
        this.crypto = crypto;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets version.
     *
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(int version) {
        this.version = version;
    }
}
