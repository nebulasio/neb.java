package io.nebulas.client.http;

import com.google.gson.reflect.TypeToken;

/**
 * Create by liuyang89 on 2018/04/27
 **/
public interface HttpClient {

    <T> T post(String uri, TypeToken<T> typeToken);

    <T> T get(String uri, TypeToken<T> typeToken);

    <T> T post(String uri, Object parameters, TypeToken<T> typeToken);

    <T> T get(String uri, Object parameter, TypeToken<T> typeToken);

}
