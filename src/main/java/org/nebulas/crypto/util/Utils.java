package org.nebulas.crypto.util;

import java.security.SecureRandom;

public class Utils {

    private static final SecureRandom secureRandom = new SecureRandom();

    public static void ClearBytes(byte[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = 0;
        }
    }

    public static SecureRandom SecureRandom() {
        return secureRandom;
    }

    public static byte[] RandomBytes(int length) {
        byte[] bytes = new byte[length];
        secureRandom.nextBytes(bytes);
        return bytes;
    }
}
