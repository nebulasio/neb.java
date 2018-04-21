package io.nebulas.crypto.hash;

import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.SHA3Digest;

public class Hash {


    public static byte[] Sha3256(byte[]... args) {
        SHA3Digest digest = new SHA3Digest();
        for (int i = 0; i < args.length; i++) {
            byte[] bytes = args[i];
            digest.update(bytes, 0, bytes.length);
        }
        byte[] out = new byte[256 / 8];
        digest.doFinal(out, 0);
        return out;
    }

    public static byte[] Ripemd160(byte[]... args) {
        RIPEMD160Digest digest = new RIPEMD160Digest();
        for (int i = 0; i < args.length; i++) {
            byte[] bytes = args[i];
            digest.update(bytes, 0, bytes.length);
        }
        byte[] out = new byte[20];
        digest.doFinal(out, 0);
        return out;
    }
}
