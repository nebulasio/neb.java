package org.nebulas.crypto.keystore;

public interface Signature {
    Algorithm algorithm();

    void initSign(PrivateKey key) throws Exception;

    byte[] sign(byte[] data) throws Exception;

    PublicKey recoverPublic(byte[] data, byte[] signature) throws Exception;

    void initVerify(PublicKey pubkey) throws Exception;

    boolean verify(byte[] data, byte[] signature) throws Exception;

}
