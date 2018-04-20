package org.nebulas.crypto.keystore;

public interface PublicKey extends Key {

    Algorithm algorithm();

    byte[] encode() throws Exception;

    void decode(byte[] data) throws Exception;

    void clear();

    boolean verify(byte[] data, byte[] signature) throws Exception;
}
