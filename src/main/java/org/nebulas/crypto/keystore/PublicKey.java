package org.nebulas.crypto.keystore;

public interface PublicKey extends Key {

    Algorithm Algorithm();

    byte[] Encoded() throws Exception;

    void Decode(byte[] data) throws Exception;

    void Clear();

    boolean Verify(byte[] data, byte[] signature) throws Exception;
}
