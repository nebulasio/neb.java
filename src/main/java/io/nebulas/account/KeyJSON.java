package io.nebulas.account;


import io.nebulas.crypto.cipher.CryptoJSON;

import java.util.UUID;

public class KeyJSON {
    String address;
    CryptoJSON crypto;
    String id;
    int version;

    public KeyJSON(String address, CryptoJSON crypto) {
        this.address = address;
        this.crypto = crypto;
        this.id = UUID.randomUUID().toString();
        this.version = CryptoJSON.VERSION;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CryptoJSON getCrypto() {
        return crypto;
    }

    public void setCrypto(CryptoJSON crypto) {
        this.crypto = crypto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
