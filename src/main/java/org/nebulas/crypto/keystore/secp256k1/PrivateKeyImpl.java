package org.nebulas.crypto.keystore.secp256k1;

import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.crypto.keystore.PrivateKey;
import org.nebulas.crypto.keystore.PublicKey;
import org.nebulas.crypto.util.Utils;

public class PrivateKeyImpl implements PrivateKey {

    byte[] seckey;


    public static PrivateKeyImpl GeneratePrivateKey() {
     //TODO: seckKey
     byte[] seckey = new byte[]{};
     return new PrivateKeyImpl(seckey);
    }

    public PrivateKeyImpl(byte[] data) {
        this.seckey = data;
    }

    @Override
    public Algorithm Algorithm() {
        return Algorithm.SECP256K1;
    }

    @Override
    public byte[] Encoded() throws Exception {
        return this.seckey;
    }

    @Override
    public void Decode(byte[] data) throws Exception {
        this.seckey = data;
    }

    @Override
    public void Clear() {
        Utils.ClearBytes(this.seckey);
    }

    @Override
    public PublicKey PublicKey() {
        // TODO:
        return null;
    }

    @Override
    public byte[] Sign(byte[] data) throws Exception {
        // TODO:
        return new byte[0];
    }
}
