package org.nebulas.crypto.keystore;

public interface Signature {
    Algorithm Algorithm();

    void InitSign(PrivateKey key) throws Exception;

    byte[] Sign(byte[] data) throws Exception;

    Key RecoverPublic(byte[] data, byte[] signature) throws Exception;

    void InitVerify(Key pubkey) throws Exception;

    boolean Verify(byte[] data, byte[] signature) throws Exception;

}
