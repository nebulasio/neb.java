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
public class RawTransaction implements Serializable {

    private String txHash;

    @SerializedName("contract_address")
    private String contractAddress;

}
