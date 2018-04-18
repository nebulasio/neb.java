package org.nebulas.crypto.cipher;

public interface Encrypt {

    byte[] Encrypt(byte[] data, byte[] passphrase) throws Exception;

    byte[] Decrypt(byte[] data, byte[] passphrase) throws Exception;
}
