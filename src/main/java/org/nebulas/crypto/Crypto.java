package org.nebulas.crypto;

import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.crypto.keystore.PrivateKey;
import org.nebulas.crypto.keystore.Signature;
import org.nebulas.crypto.keystore.secp256k1.PrivateKeyImpl;
import org.nebulas.crypto.keystore.secp256k1.SignatureImpl;

public class Crypto {

    public static PrivateKey NewPrivateKey(Algorithm algorithm, byte[] data) throws Exception{
        PrivateKey privateKey;
        switch (algorithm) {
            case SECP256K1:
            {
                if (data.length != 0) {
                    privateKey = new PrivateKeyImpl(data);
                } else {
                    privateKey = PrivateKeyImpl.GeneratePrivateKey();
                }
                break;
            }
            default:
                throw new Exception("invalid algorithm");
        }
        return privateKey;
    }

    public static Signature NewSignature(Algorithm algorithm) throws Exception {
        Signature signature;
        switch (algorithm) {
            case SECP256K1:
            {
                signature = new SignatureImpl();
                break;
            }
            default:
                throw new Exception("invalid algorithm");
        }
        return signature;
    }
}
