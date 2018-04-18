package org.nebulas.crypto.util;

public class Utils {

    public static void ClearBytes(byte[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = 0;
        }
    }
}
