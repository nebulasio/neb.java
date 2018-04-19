package org.nebulas.util;

import com.google.gson.Gson;

public class JSONUtils {

    public static <T> T Parse(byte[] jsonData, Class<T> type) {
        return Parse(new String(jsonData), type);
    }

    public static <T> T Parse(String jsonData, Class<T> type) {
        Gson gson = new Gson();
        T result = gson.fromJson(jsonData, type);
        return result;
    }

    public static String Stringify(Object obj) {
        Gson gson = new Gson();
        String result = gson.toJson(obj);
        return result;
    }
}
