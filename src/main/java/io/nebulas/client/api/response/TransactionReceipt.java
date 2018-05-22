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
public class TransactionReceipt implements Serializable {

    private String hash;

    @SerializedName("chainId")
    private Integer chainId;

    private String from;

    private String to;

    private String value;

    private Long nonce;

    private Long timestamp;

    private String type;

    private String data;

    @SerializedName("gas_price")
    private String gasPrice;

    @SerializedName("gas_limit")
    private String gasLimit;

    @SerializedName("contract_address")
    private String contractAddress;

    private int status;

    @SerializedName("gas_used")
    private String gasUsed;

    @SerializedName("execute_error")
    private String executeError;

    @SerializedName("execute_result")
    private String executeResult;

}
