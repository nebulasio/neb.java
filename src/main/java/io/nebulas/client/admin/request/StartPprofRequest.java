package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class StartPprofRequest implements Serializable {

    private String listen;

    public String getListen() {
        return listen;
    }

    public StartPprofRequest setListen(String listen) {
        this.listen = listen;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StartPprofRequest{");
        sb.append("listen='").append(listen).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
