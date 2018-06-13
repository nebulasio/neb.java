package io.nebulas.client.http;

import com.google.common.base.Joiner;
import com.google.common.base.Throwables;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class OKHttpClient implements HttpClient {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final MediaType JSON = MediaType.parse("application/json");

    private Gson gson = new Gson();

    private OkHttpClient client = new OkHttpClient();

    private Joiner joiner = Joiner.on("&");

    /**
    * OKHttpClient constructor
    */
    public OKHttpClient() {
    }

    /**
    * OKHttpClient constructor with parameter client
    *
    * @param  client - Instance of OkHttpClient.    *
    */
    public OKHttpClient(OkHttpClient client) {
        this.client = client;
    }

    /**
    * method get result of response
    */
    @Override
    public <T> T post(String uri, TypeToken<T> typeToken) {
        return post(uri,null , typeToken);
    }

    @Override
    public <T> T get(String uri, TypeToken<T> typeToken) {
        return get(uri,null , typeToken);
    }

    @Override
    public <T> T post(String uri, Object parameter, TypeToken<T> typeToken) {
        return call("post", uri, parameter, typeToken);
    }

    public <T> T get(String uri, Object parameter, TypeToken<T> typeToken) {
        return call("get", uri, parameter, typeToken);
    }

    /**
    * method response the request
    *
    * @param method     the method for http request, should be "POST" or "GET"
    * @param uri        the url
    * @param parameter  the data
    * @param typeToken  the return data type
    *
    * @return return the result of response
    */
    public <T> T call(String method, String uri, Object parameter, TypeToken<T> typeToken) {
        try {
            Request.Builder builder = buildRequest(method, uri, parameter);
            Response response = client.newCall(builder.build()).execute();
            logger.debug("http response code : {}", response.code());
            String result = response.body().string();
            logger.debug("http result : {}", new Object[]{result});
            return gson.fromJson(result, typeToken.getType());
        } catch (Exception e) {
            throw Throwables.propagate(e);
        }
    }

    private String uriWithParameter(String uri , Object parameter){
        if (parameter != null){
            return uri + "?" + toQueryString(parameter);
        }
        return uri;
    }

    private Request.Builder buildRequest(String method, String uri, Object parameter) {
        try {
            Request.Builder builder = new Request.Builder();
            if ("post".equalsIgnoreCase(method)) {
                RequestBody body = RequestBody.create(JSON, gson.toJson(parameter));
                builder.url(uri).post(body);
            } else if ("get".equalsIgnoreCase(method)) {
                builder.url(uriWithParameter(uri , parameter)).get();
            } else {
                throw new IllegalArgumentException("un support http method !");
            }
            return builder;
        } catch (Exception e) {
            throw Throwables.propagate(e);
        }
    }

    /**
     * method get the former string of parameters in a url
     *
     * @param parameter
     * @return
     */
    private String toQueryString(Object parameter) {
        return joiner.join(gson.toJsonTree(parameter).getAsJsonObject().entrySet().parallelStream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.toList()));
    }

    @Override
    public <T> void URLConnectionPost(String uri, Object parameter, HttpClientListener listener, TypeToken<T> typeToken) {
        HttpURLConnection connection = null;
        BufferedReader br = null;
        try {
            URL url = new URL(uri);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            String postData = gson.toJson(parameter);
            connection.setRequestProperty("Content-Length", String.valueOf(postData.length()));
            connection.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(postData);
            writer.flush();
            writer.close();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + connection.getResponseCode());
            }

            br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                logger.debug("URLConnectionPost result : {}", new Object[]{inputLine});
                listener.onMessage(gson.fromJson(inputLine, typeToken.getType()));
            }
        } catch (Exception e) {
            throw Throwables.propagate(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                    br = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            connection.disconnect();
        }
    }
}
