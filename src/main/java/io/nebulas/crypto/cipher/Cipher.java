package io.nebulas.crypto.cipher;

import io.nebulas.crypto.keystore.Algorithm;
import io.nebulas.util.JSONUtils;

public class Cipher {

    private Encrypt encrypt;

    public Cipher(Algorithm algorithm) throws Exception {
        switch (algorithm) {
            case SCRYPT:
                this.encrypt = new Scrypt();
                break;
            default:
                throw new Exception("unknown algorithm");
        }
    }

    public CryptoJSON encrypt(byte[] data, byte[] passphrase) throws Exception {
        return this.encrypt.encrypt(data, passphrase);
    }

    public byte[] decrypt(byte[] data, byte[] passphrase) throws Exception {
        CryptoJSON cryptoJSON = JSONUtils.Parse(new String(data), CryptoJSON.class);
        return this.encrypt.decrypt(cryptoJSON, passphrase);
    }

    public byte[] decrypt(CryptoJSON cryptoJSON, byte[] passphrase) throws Exception {
        return this.encrypt.decrypt(cryptoJSON, passphrase);
    }
}
