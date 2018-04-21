package org.nebulas.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONUtils {

    public static <T> T Parse(byte[] jsonData, Class<T> type) {
        return Parse(new String(jsonData), type);
    }

    public static <T> T Parse(String jsonData, Class<T> type) {
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        T result = gson.fromJson(jsonData, type);
        return result;
    }

    public static String Stringify(Object obj) {
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String result = gson.toJson(obj);
        return result;
    }
}
