package io.nebulas.crypto.keystore;

import com.google.common.collect.Lists;
import io.nebulas.crypto.keystore.secp256k1.ECPrivateKey;
import io.nebulas.util.ByteUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class KeystoreTest {

    private Keystore keystore;
    private byte[] passphrase;
    private PrivateKey key;

    @Before
    public void Before() throws Exception {
        passphrase = "passphrase".getBytes();
        keystore = new Keystore(Algorithm.SCRYPT);
        key = ECPrivateKey.GeneratePrivateKey();
        keystore.setKey(ByteUtils.HexToString(key.encode()), key, passphrase);
    }

    @Test
    public void keys() throws Exception {
        List<String> keys = keystore.keys();
        List<String> originKeys = Lists.newArrayList();
        originKeys.add(ByteUtils.HexToString(key.encode()));
        Assert.assertTrue(originKeys.equals(keys));
    }

    @Test
    public void contains() throws Exception {
        boolean result = keystore.contains(ByteUtils.HexToString(key.encode()));
        Assert.assertTrue(result);
    }

    @Test
    public void setKey() throws Exception {
        PrivateKey key = ECPrivateKey.GeneratePrivateKey();
        keystore.setKey(ByteUtils.HexToString(key.encode()), key, passphrase);
        boolean result = keystore.contains(ByteUtils.HexToString(key.encode()));
        Assert.assertTrue(result);
        Key got = keystore.getKey(ByteUtils.HexToString(key.encode()), passphrase);
        Assert.assertTrue(ByteUtils.Equal(key.encode(), got.encode()));
    }

    @Test
    public void delete() throws Exception {
        PrivateKey key = ECPrivateKey.GeneratePrivateKey();
        keystore.setKey(ByteUtils.HexToString(key.encode()), key, passphrase);
        boolean result = keystore.contains(ByteUtils.HexToString(key.encode()));
        Assert.assertTrue(result);
        keystore.delete(ByteUtils.HexToString(key.encode()), passphrase);
        result = keystore.contains(ByteUtils.HexToString(key.encode()));
        Assert.assertFalse(result);
    }
}