package org.nebulas.crypto.keystore;

public interface PrivateKey extends Key {

    Algorithm Algorithm();

    byte[] Encoded() throws Exception;

    void Decode(byte[] data) throws Exception;

    void Clear();

    PublicKey PublicKey();

    byte[] Sign(byte[] data) throws Exception;
}
