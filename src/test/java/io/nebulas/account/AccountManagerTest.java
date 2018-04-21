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