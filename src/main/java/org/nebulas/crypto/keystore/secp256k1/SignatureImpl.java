package org.nebulas.crypto.keystore.secp256k1;

import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.crypto.keystore.Key;
import org.nebulas.crypto.keystore.PrivateKey;
import org.nebulas.crypto.keystore.Signature;

public class SignatureImpl implements Signature {

    PrivateKey privateKey;

    Key pubKey;

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
        return new byte[0];
    }

    @Override
    public Key RecoverPublic(byte[] data, byte[] signature) throws Exception {
        return null;
    }

    @Override
    public void InitVerify(Key pubkey) throws Exception {
        this.pubKey = pubkey;
    }

    @Override
    public boolean Verify(byte[] data, byte[] signature) throws Exception {
        return false;
    }
}
