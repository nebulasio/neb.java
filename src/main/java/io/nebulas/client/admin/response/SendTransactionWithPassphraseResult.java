package io.nebulas.client.admin.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/18
 **/
@Data
@ToString
public class SendTransactionWithPassphraseResult implements Serializable {

    @SerializedName("hash")
    private String txHash;

    @SerializedName("contract_address")
    private String contractAddress;
    
}
