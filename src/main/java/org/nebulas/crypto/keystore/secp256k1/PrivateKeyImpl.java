package org.nebulas.crypto.keystore.secp256k1;

import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.crypto.keystore.PrivateKey;
import org.nebulas.crypto.keystore.PublicKey;
import org.nebulas.crypto.util.Utils;

public class PrivateKeyImpl implements PrivateKey {

    byte[] seckey;

    public static PrivateKeyImpl GeneratePrivateKey() {
     byte[] seckey = Secp256k1.GenerateECKey();
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
        byte[] pub = Secp256k1.PublicFromPrivateKey(seckey);
        return new PublicKeyImpl(pub);
    }

    @Override
    public byte[] Sign(byte[] data) throws Exception {
        return Secp256k1.Sign(data, seckey);
    }
}
