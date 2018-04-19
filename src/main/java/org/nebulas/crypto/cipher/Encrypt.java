package org.nebulas.crypto.cipher;

public interface Encrypt {

    CryptoJSON Encrypt(byte[] data, byte[] passphrase) throws Exception;

    byte[] Decrypt(CryptoJSON data, byte[] passphrase) throws Exception;
}
