package org.nebulas.crypto.keystore.secp256k1;

import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.crypto.keystore.PublicKey;
import org.nebulas.crypto.util.Utils;

public class PublicKeyImpl implements PublicKey {
    byte[] pubKey;

    public PublicKeyImpl(byte[] pub) {
        this.pubKey = pub;
    }

    @Override
    public Algorithm Algorithm() {
        return Algorithm.SECP256K1;
    }

    @Override
    public byte[] Encoded() throws Exception {
        return this.pubKey;
    }

    @Override
    public void Decode(byte[] data) throws Exception {
        this.pubKey = data;
    }

    @Override
    public void Clear() {
        Utils.ClearBytes(this.pubKey);
    }

    @Override
    public boolean Verify(byte[] data, byte[] signature) throws Exception {
        // TODO:
        return false;
    }
}
