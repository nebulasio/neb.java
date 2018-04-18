package org.nebulas.crypto.keystore;

public interface Key {

    Algorithm Algorithm();

    byte[] Encoded() throws Exception;

    void Decode(byte[] data) throws Exception;

    void Clear();

}
