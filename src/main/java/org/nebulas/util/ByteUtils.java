package org.nebulas.util;

import com.google.common.io.BaseEncoding;
import org.spongycastle.util.encoders.Base64;

import java.math.BigInteger;

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

    public static byte[] FromHex(String str) {
        return HEX.decode(str);
    }

    public static String ToHex(byte[] data) {
        return HEX.encode(data);
    }

    public static byte[] FromBase64(String data) {
        return Base64.decode(data);
    }

    public static String ToBase64(byte[] data) {
        return Base64.toBase64String(data);
    }

    /**
     * Omitting sign indication byte.
     * <br><br>
     * Instead of {@link org.spongycastle.util.BigIntegers#asUnsignedByteArray(BigInteger)}
     * <br>we use this custom method to avoid an empty array in case of BigInteger.ZERO
     *
     * @param value - any big integer number. A <code>null</code>-value will return <code>null</code>
     * @return A byte array without a leading zero byte if present in the signed encoding.
     *      BigInteger.ZERO will return an array with length 1 and byte-value 0.
     */
    public static byte[] BigIntegerToBytes(BigInteger value) {
        if (value == null)
            return null;

        byte[] data = value.toByteArray();

        if (data.length != 1 && data[0] == 0) {
            byte[] tmp = new byte[data.length - 1];
            System.arraycopy(data, 1, tmp, 0, tmp.length);
            data = tmp;
        }
        return data;
    }

    /**
     * The regular {@link java.math.BigInteger#toByteArray()} method isn't quite what we often need:
     * it appends a leading zero to indicate that the number is positive and may need padding.
     *
     * @param b the integer to format into a byte array
     * @param numBytes the desired size of the resulting byte array
     * @return numBytes byte long array.
     */
    public static byte[] BigIntegerToBytes(BigInteger b, int numBytes) {
        if (b == null)
            return null;
        byte[] bytes = new byte[numBytes];
        byte[] biBytes = b.toByteArray();
        int start = (biBytes.length == numBytes + 1) ? 1 : 0;
        int length = Math.min(biBytes.length, numBytes);
        System.arraycopy(biBytes, start, bytes, numBytes - length, length);
        return bytes;
    }

    /**
     * @param arrays - arrays to Append
     * @return - merged array
     */
    public static byte[] Append(byte[]... arrays)
    {
        int count = 0;
        for (byte[] array: arrays)
        {
            count += array.length;
        }

        // Create new array and copy all array contents
        byte[] mergedArray = new byte[count];
        int start = 0;
        for (byte[] array: arrays) {
            System.arraycopy(array, 0, mergedArray, start, array.length);
            start += array.length;
        }
        return mergedArray;
    }

    public static byte[] ToFixedSizeBytes(byte[] src, int length) throws Exception {
        if (src.length > length) {
            throw new Exception("out of src byte length");
        }
        byte[] res = new byte[length];
        System.arraycopy(src,0,res,res.length-src.length,src.length);
        return res;
    }

    public static byte[] IntToBytes(int num) {
        // big-endian
        byte[] result = new byte[4];
        result[0] = (byte)((num >>> 24) & 0xff);
        result[1] = (byte)((num >>> 16)& 0xff );
        result[2] = (byte)((num >>> 8) & 0xff );
        result[3] = (byte)((num >>> 0) & 0xff );
        return result;
    }

    public static int BytesToInt(byte[] bytes) {
        // big-endian
        int result = 0;
        if(bytes.length == 4){
            int a = (bytes[0] & 0xff) << 24;
            int b = (bytes[1] & 0xff) << 16;
            int c = (bytes[2] & 0xff) << 8;
            int d = (bytes[3] & 0xff);
            result = a | b | c | d;
        }
        return result;

    }

    public static byte[] LongToBytes(long num) {
        // big-endian
        byte[] result = new byte[8];
        result[0] = (byte)((num >>> 56) & 0xff);
        result[1] = (byte)((num >>> 48) & 0xff);
        result[2] = (byte)((num >>> 40) & 0xff);
        result[3] = (byte)((num >>> 32) & 0xff);
        result[4] = (byte)((num >>> 24) & 0xff);
        result[5] = (byte)((num >>> 16)& 0xff );
        result[6] = (byte)((num >>> 8) & 0xff );
        result[7] = (byte)((num >>> 0) & 0xff );
        return result;

    }

    public static long BytesToLong(byte[] bytes) {
        // big-endian
        long result = 0;
        if(bytes.length == 8){
            int a = (bytes[0] & 0xff) << 56;
            int b = (bytes[1] & 0xff) << 48;
            int c = (bytes[2] & 0xff) << 40;
            int d = (bytes[3] & 0xff) << 32;
            int e = (bytes[4] & 0xff) << 24;
            int f = (bytes[5] & 0xff) << 16;
            int g = (bytes[6] & 0xff) << 8;
            int h = (bytes[7] & 0xff);
            result = a | b | c | d | e | f | g | h;
        }
        return result;
    }

    public static boolean IsNullOrEmpty(byte[] bytes) {
        return bytes == null || bytes.length == 0;
    }

}
