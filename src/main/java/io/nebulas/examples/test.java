package io.nebulas.examples;


import com.google.gson.reflect.TypeToken;
import io.nebulas.client.NebulasClient;
import io.nebulas.client.api.request.*;
import io.nebulas.client.api.response.*;
import io.nebulas.client.http.HttpClient;
import io.nebulas.client.http.OKHttpClient;
import okhttp3.OkHttpClient;
import com.google.common.base.Joiner;
import com.google.common.base.Throwables;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;

public class test {

    public static void main(String args[]) throws Exception {
        String json = "{\"result\":{\"txhash\":\"575ee37eda10b2d6e1512b5b58d69d9835be12bc973efffe37db4b004facfa7b\",\"contract_address\":\"\"}}";
        //Object jsonObj =  gson.fromJson(result, typeToken.getType())
        Object jsonObj = call(json, new TypeToken<io.nebulas.client.api.response.Response<RawTransaction>>(){});
        System.out.println(jsonObj);
    }

    public static  <T> T call(String json, TypeToken<T> typeToken) {
        try {
            Gson gson = new Gson();
            return gson.fromJson(json, typeToken.getType());
        } catch (Exception e) {
            throw Throwables.propagate(e);
        }
    }
}

