package io.nebulas.client.api.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
@Data
@ToString
public class Response<T> implements Serializable {

    private String error;

    private T result;

    public Response() {
    }

    public Response(String error, T result) {
        this.error = error;
        this.result = result;
    }
}
