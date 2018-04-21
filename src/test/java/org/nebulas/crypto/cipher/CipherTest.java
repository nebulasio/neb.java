package org.nebulas.crypto.cipher;

import org.junit.Assert;
import org.junit.Test;
import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.util.ByteUtils;
import org.nebulas.util.JSONUtils;

public class CipherTest {

    private String PASSPHRASE = "passphrase";
    // address: e07c7b293b2907474d7a9d431eea0138c2734b2865804dc2ebb6e8f9a40ac0e0
    private byte[] privateKey = ByteUtils.HexToBytes("e07c7b293b2907474d7a9d431eea0138c2734b2865804dc2ebb6e8f9a40ac0e0");
    private String crypto = "{\"cipher\":\"aes-128-ctr\",\"ciphertext\":\"bea1c02c9b290524e371da1d27f879ece0b85fe3975f69a7118bbbc9211dbc06\",\"cipherparams\":{\"iv\":\"4fdb9a9fc1c5dd8b6512dbedfdd08fd3\"},\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":32,\"n\":4096,\"p\":1,\"r\":8,\"salt\":\"4d3ac8dcf01a25c097590f15f00b8999f3836e99a9957606f96b98de1f8ec838\"},\"mac\":\"6504d33980ee905fef4e04f083e23b1631606d59046cbbd3d4140f84276328d3\",\"machash\":\"sha3256\"}";


    @Test
    public void encrypt() {
        try {
            Cipher cipher = new Cipher(Algorithm.SCRYPT);
            CryptoJSON cryptoJSON = cipher.encrypt(privateKey, PASSPHRASE.getBytes());
            byte[] key = cipher.decrypt(cryptoJSON, PASSPHRASE.getBytes());
            Assert.assertTrue(ByteUtils.Equal(key, privateKey));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Test
    public void decrypt() {
        try {
            Cipher cipher = new Cipher(Algorithm.SCRYPT);
            CryptoJSON cryptoJSON = JSONUtils.Parse(crypto, CryptoJSON.class);
            byte[] key = cipher.decrypt(cryptoJSON, PASSPHRASE.getBytes());
            Assert.assertTrue(ByteUtils.Equal(key, privateKey));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}