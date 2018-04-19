package org.nebulas.crypto.keystore.secp256k1;

import org.nebulas.crypto.keystore.*;

public class SignatureImpl implements Signature {

    PrivateKey privateKey;

    PublicKey pubKey;

    @Override
    public Algorithm Algorithm() {
        return Algorithm.SECP256K1;
    }

    @Override
    public void InitSign(PrivateKey key) throws Exception {
        this.privateKey = key;
    }

    @Override
    public byte[] Sign(byte[] data) throws Exception {
        return Secp256k1.Sign(data, privateKey.Encoded());
    }

    @Override
    public PublicKey RecoverPublic(byte[] data, byte[] signature) throws Exception {
        byte[] pub = Secp256k1.RecoverPubBytesFromSignature(data, signature);
        return new PublicKeyImpl(pub);
    }

    @Override
    public void InitVerify(PublicKey pubkey) throws Exception {
        this.pubKey = pubkey;
    }

    @Override
    public boolean Verify(byte[] data, byte[] signature) throws Exception {
        return this.pubKey.Verify(data, signature);
    }
}
