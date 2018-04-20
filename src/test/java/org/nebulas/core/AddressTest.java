package org.nebulas.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.nebulas.util.ByteUtils;

public class AddressTest {

    private byte[] pub;
    private String addr;

    @Before
    public void Before() {
        pub = ByteUtils.FromHex("04be110ae3154924b93881cba7ea9cfcb6d4866d2becac5ccb79bab5d7e22309796ed60effbe6990320e7d8a0cc19e6e8b235aa17fe467c4c6ae7f469dcbf65609");
        addr = "n1TjT3XYnHSSAkESFvGXeoN9bdjY8o6tyCm";
    }

    @Test
    public void string() throws Exception {
        Address address = Address.NewAddressFromPubKey(pub);
        Assert.assertEquals(address.string(), addr);
    }

    @Test
    public void type() throws Exception {
        Address address = Address.NewAddressFromPubKey(pub);
        Assert.assertEquals(address.type(), Address.AddressType.ACCOUNT);
    }

    @Test
    public void newAddressFromPubKey() throws Exception {
        Address address = Address.NewAddressFromPubKey(pub);
        Assert.assertEquals(address.string(), addr);
    }

    @Test
    public void parseFromString() throws Exception {
        Address address = Address.ParseFromString(addr);
        Address address1 = Address.NewAddressFromPubKey(pub);
        Assert.assertEquals(address.string(), address1.string());
    }

    @Test
    public void parseFromBytes() {
    }
}