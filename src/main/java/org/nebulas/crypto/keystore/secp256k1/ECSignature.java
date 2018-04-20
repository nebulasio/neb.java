package org.nebulas.crypto.keystore.secp256k1;

import org.nebulas.crypto.keystore.*;

public class ECSignature implements Signature {

    PrivateKey privateKey;

    PublicKey pubKey;

    @Override
    public Algorithm algorithm() {
        return Algorithm.SECP256K1;
    }

    @Override
    public void initSign(PrivateKey key) throws Exception {
        this.privateKey = key;
    }

    @Override
    public byte[] sign(byte[] data) throws Exception {
        return Secp256k1.Sign(data, privateKey.encode());
    }

    @Override
    public PublicKey recoverPublic(byte[] data, byte[] signature) throws Exception {
        byte[] pub = Secp256k1.RecoverPubBytesFromSignature(data, signature);
        this.pubKey = new ECPublicKey(pub);
        return this.pubKey;
    }

    @Override
    public void initVerify(PublicKey pubkey) throws Exception {
        this.pubKey = pubkey;
    }

    @Override
    public boolean verify(byte[] data, byte[] signature) throws Exception {
        return this.pubKey.verify(data, signature);
    }
}
