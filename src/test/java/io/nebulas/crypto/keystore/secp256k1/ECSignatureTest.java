package io.nebulas.crypto.keystore.secp256k1;

import io.nebulas.crypto.keystore.PublicKey;
import io.nebulas.crypto.keystore.Signature;
import io.nebulas.util.ByteUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ECSignatureTest {

    private Signature signature;

    private byte[] privateKey;
    private byte[] signData;
    private byte[] signedData;

    @Before
    public void Before() {
        signature = new ECSignature();
        privateKey = ByteUtils.HexToBytes("e07c7b293b2907474d7a9d431eea0138c2734b2865804dc2ebb6e8f9a40ac0e0");
        signData = ByteUtils.HexToBytes("ff0d7b40123af5813b6add3de99369cbf029a464f5b3b7bb2e1523d0862e1812");
        signedData = ByteUtils.HexToBytes("d5f47ac3c2883adfc46bc252de7550465469ab1d958adc0249653e0cb0eaca1e2aaf3e951b3585864fbd85834b34966e12acf43e31a390e045bbddaf97d199e901");
    }

    @Test
    public void sign() throws Exception {
        ECPrivateKey priv = new ECPrivateKey(privateKey);
        signature.initSign(priv);
        byte[] sign = signature.sign(signData);
        Assert.assertTrue(ByteUtils.Equal(sign, signedData));
    }

    @Test
    public void recoverPublic() throws Exception {
        ECPrivateKey priv = new ECPrivateKey(privateKey);
        PublicKey pub = signature.recoverPublic(signData, signedData);
        Assert.assertTrue(ByteUtils.Equal(priv.publickey().encode(), pub.encode()));
    }

    @Test
    public void verify() throws Exception {
        ECPrivateKey priv = new ECPrivateKey(privateKey);
        signature.initVerify(priv.publickey());
        boolean result = signature.verify(signData, signedData);
        Assert.assertTrue(result);
    }
}