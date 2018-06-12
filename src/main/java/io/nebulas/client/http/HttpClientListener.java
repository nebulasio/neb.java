package io.nebulas.client.http;

import io.nebulas.client.api.response.Response;

public interface HttpClientListener<T> {

    void onMessage(Response<T> msg);
}
