package io.nebulas.crypto.keystore.secp256k1;

import io.nebulas.crypto.hash.Hash;
import io.nebulas.util.ByteUtils;
import org.junit.Assert;
import org.junit.Test;

public class Secp256k1Test {

    private static int count = 10;

    private byte[] privateKey = ByteUtils.HexToBytes("e07c7b293b2907474d7a9d431eea0138c2734b2865804dc2ebb6e8f9a40ac0e0");
    private byte[] publicKey = ByteUtils.HexToBytes("04be110ae3154924b93881cba7ea9cfcb6d4866d2becac5ccb79bab5d7e22309796ed60effbe6990320e7d8a0cc19e6e8b235aa17fe467c4c6ae7f469dcbf65609");

    @Test
    public void generateECKey() throws Exception {
        for (int i = 0; i < count; i ++) {
            byte[] key = Secp256k1.GenerateECKey();
            Assert.assertEquals(32, key.length);
            System.out.println(ByteUtils.HexToString(key));
            byte[] pub = Secp256k1.PublicFromPrivateKey(key);
            byte[] hash = Hash.Sha3256(key);
            byte[] sign = Secp256k1.Sign(hash, key);
            byte[] recoverPub = Secp256k1.RecoverPubBytesFromSignature(hash, sign);
            Assert.assertTrue(ByteUtils.Equal(recoverPub, pub));
            boolean verify = Secp256k1.Verify(hash, sign, pub);
            Assert.assertTrue(verify);
        }
    }

    @Test
    public void publicFromPrivateKey() {
        byte[] pub = Secp256k1.PublicFromPrivateKey(privateKey);
        Assert.assertTrue(ByteUtils.Equal(pub, publicKey));
    }

    @Test
    public void recoverPubBytesFromSignature() {
        byte[] hash = Hash.Sha3256(privateKey);
        byte[] sign = Secp256k1.Sign(hash, privateKey);
        byte[] recoverPub = Secp256k1.RecoverPubBytesFromSignature(hash, sign);
        Assert.assertTrue(ByteUtils.Equal(recoverPub, publicKey));
    }

    @Test
    public void verify() {
        byte[] hash = Hash.Sha3256(privateKey);
        byte[] sign = Secp256k1.Sign(hash, privateKey);
        boolean verify = Secp256k1.Verify(hash, sign, publicKey);
        Assert.assertTrue(verify);
    }
}