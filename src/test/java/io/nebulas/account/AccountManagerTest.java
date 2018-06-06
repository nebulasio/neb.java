package io.nebulas.account;

import io.nebulas.core.Address;
import io.nebulas.crypto.Crypto;
import io.nebulas.crypto.hash.Hash;
import io.nebulas.crypto.keystore.PublicKey;
import io.nebulas.crypto.keystore.Signature;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AccountManagerTest {

    private AccountManager manager;
    private byte[] passphrase;

    @Before
    public void Before() throws Exception {
        manager = new AccountManager();
        passphrase = "passphrase".getBytes();
    }

    @Test
    public void newAccount() throws Exception {
        Address address = manager.newAccount(passphrase);
        boolean result = manager.contains(address);
        Assert.assertTrue(result);
    }

    @Test
    public void accounts() throws Exception {
        Address address = manager.newAccount(passphrase);
        List<Address> addresses = manager.accounts();
        Assert.assertTrue(addresses.contains(address));
    }

    @Test
    public void contains() throws Exception {
        Address address = manager.newAccount(passphrase);
        boolean result = manager.contains(address);
        Assert.assertTrue(result);
    }

    @Test
    public void update() throws Exception {
        Address address = manager.newAccount(passphrase);
        byte[] newPassphrase = "newpassphrase".getBytes();
        manager.update(address, passphrase, newPassphrase);
        byte[] out = manager.export(address, newPassphrase);
        System.out.println(new String(out));
    }

    @Test
    public void load() throws Exception {
        Address address = manager.newAccount(passphrase);
        byte[] out = manager.export(address, passphrase);
        Address got = manager.load(out, passphrase);
        Assert.assertEquals(address.string(), got.string());
        /**
         * test keyStore file Version=3
         */
        byte[] keyV3 = "{\"version\":3,\"id\":\"ccdea027-bea5-4626-b5e4-53b987091b8d\",\"address\":\"n1X1N4Jq7mhm3tK74AqE29Rdp97kdTWftzS\",\"crypto\":{\"ciphertext\":\"0535aac6d78ad8ddfa2274b05c7a6fcfdb3b9fcff91ed59b1531ec8cd3671715\",\"cipherparams\":{\"iv\":\"03e09e5994ad41df77b9c94ffa1ecd9e\"},\"cipher\":\"aes-128-ctr\",\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":32,\"salt\":\"7237d1a9e755adbf7e6b1364b6c7a1c8101043b693e671357895684aa5c3e7f1\",\"n\":4096,\"r\":8,\"p\":1},\"mac\":\"288ae2984d7d40d25f7261342ef5ec4f1b576dce3f2e324fa0483f710fb42fd3\",\"machash\":\"sha3256\"}}".getBytes();
        Address addV3 = manager.load(keyV3,"passphrase".getBytes());
        Assert.assertEquals(addV3.string() , "n1X1N4Jq7mhm3tK74AqE29Rdp97kdTWftzS");
    }

    @Test
    public void export() throws Exception {
    }

    @Test
    public void delete() throws Exception {
        Address address = manager.newAccount(passphrase);
        Assert.assertTrue(manager.contains(address));
        manager.delete(address, passphrase);
        Assert.assertFalse(manager.contains(address));
    }

    @Test
    public void signHash() throws Exception {
        Address address = manager.newAccount(passphrase);
        byte[] hash = Hash.Sha3256(address.bytes());
        byte[] sign = manager.signHash(address, hash, passphrase);

        Signature signature = Crypto.NewSignature(manager.getSignatureAlg());
        PublicKey pub = signature.recoverPublic(hash, sign);
        Address got = Address.NewAddressFromPubKey(pub.encode());
        Assert.assertEquals(address.string(), got.string());
    }
}