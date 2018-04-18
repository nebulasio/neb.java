package org.nebulas.crypto.cipher;

import org.nebulas.crypto.keystore.Algorithm;

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

    public byte[] Encrypt(byte[] data, byte[] passphrase) throws Exception {
        return this.encrypt.Encrypt(data, passphrase);
    }

    public byte[] Decrypt(byte[] data, byte[] passphrase) throws Exception {
        return this.encrypt.Decrypt(data, passphrase);
    }
}
