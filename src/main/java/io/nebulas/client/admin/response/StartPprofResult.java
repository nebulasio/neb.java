package io.nebulas.client.admin.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class StartPprofResult implements Serializable {

    private Boolean result;

    public Boolean getResult() {
        return result;
    }

    public StartPprofResult setResult(Boolean result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StartPprofResult{");
        sb.append("result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
