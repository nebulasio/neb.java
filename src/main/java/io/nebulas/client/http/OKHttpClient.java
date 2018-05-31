package io.nebulas.client.http;

import com.google.common.base.Joiner;
import com.google.common.base.Throwables;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    * @param {OkHttpClient} client - Instance of OkHttpClient.
    *
    * @example
    * var httpClient = new OKHttpClient(new OkHttpClient());
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
    * @param {String} method 
    * @param {String} uri
    * @param {Object} parameter
    * @param {TypeToken<T>} typeToken
    *
    * @return return the result of response
    */
    public <T> T call(String method, String uri, Object parameter, TypeToken<T> typeToken) {
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
            Response response = client.newCall(builder.build()).execute();
            logger.debug("http response code : {}", response.code());
            String result = response.body().string();
            logger.debug("http result : {}", new Object[]{result});
            return gson.fromJson(result, typeToken.getType());
        } catch (Exception e) {
            throw Throwables.propagate(e);
        }
    }
    
    /**
    * method get the string of url with parameter
    *
    * @param {String} uri
    * @param {Object} parameter
    *
    * @example
    * var url = uriWithParameter(uri,parameter);
    * 
    * @return [String]
    */
    private String uriWithParameter(String uri , Object parameter){
        if (parameter != null){
            return uri + "?" + toQueryString(parameter);
        }
        return uri;
    }

    /**
    * method get the former string of parameters in a url  
    *
    * @param {Object} parameter
    *
    * @example
    * var parameters = toQueryString(parameter);
    * 
    * @return [String]
    */
    private String toQueryString(Object parameter) {
        return joiner.join(gson.toJsonTree(parameter).getAsJsonObject().entrySet().parallelStream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.toList()));
    }

}
