package org.nebulas.crypto.util;

import java.security.SecureRandom;

public class Utils {

    public static void ClearBytes(byte[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = 0;
        }
    }

    public static byte[] RandomBytes(int length) {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[length];
        random.nextBytes(bytes);
        return bytes;
    }
}
