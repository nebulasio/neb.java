package org.nebulas.crypto.cipher;

import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.util.JSONUtils;

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

    public CryptoJSON Encrypt(byte[] data, byte[] passphrase) throws Exception {
        return this.encrypt.Encrypt(data, passphrase);
    }

    public byte[] Decrypt(byte[] data, byte[] passphrase) throws Exception {
        CryptoJSON cryptoJSON = JSONUtils.Parse(new String(data), CryptoJSON.class);
        return this.encrypt.Decrypt(cryptoJSON, passphrase);
    }

    public byte[] Decrypt(CryptoJSON cryptoJSON, byte[] passphrase) throws Exception {
        return this.encrypt.Decrypt(cryptoJSON, passphrase);
    }
}
