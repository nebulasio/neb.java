package io.nebulas.client.admin.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class NebConfig implements Serializable {

    private String config;

    public String getConfig() {
        return config;
    }

    public NebConfig setConfig(String config) {
        this.config = config;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NebConfig{");
        sb.append("config='").append(config).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
