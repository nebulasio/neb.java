package org.nebulas.util;

import com.google.common.io.BaseEncoding;

public class ByteUtils {

    /** Hex encoding used throughout the framework. Use with HEX.encode(byte[]) or HEX.decode(CharSequence). */
    private static final BaseEncoding HEX = BaseEncoding.base16().lowerCase();

    public static boolean Equal(byte[] a, byte[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] SubBytes(byte[] src, int begin, int count) {
        byte[] bs = new byte[count];
        System.arraycopy(src, begin, bs, 0, count);
        return bs;
    }

    public static byte[] ToHexBytes(String str) {
        return HEX.decode(str);
    }

    public static String ToHexString(byte[] data) {
        return HEX.encode(data);
    }
}
