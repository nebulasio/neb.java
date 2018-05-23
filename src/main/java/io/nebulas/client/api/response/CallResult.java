package io.nebulas.client.api.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
@Data
@ToString
public class CallResult implements Serializable {

    private String result;

    @SerializedName("execute_err")
    private String executeErr;

    @SerializedName("estimate_gas")
    private String estimateGas;

    public CallResult() {
    }

    public CallResult(String result, String executeErr, String estimateGas) {
        this.result = result;
        this.executeErr = executeErr;
        this.estimateGas = estimateGas;
    }

}
