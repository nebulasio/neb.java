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
public class NebState implements Serializable {

    @SerializedName("chain_id")
    private Integer chainId;

    private String tail;

    private String lib;

    private Long height;

    @SerializedName("protocol_version")
    private String protocolVersion;

    @SerializedName(value = "synchronized")
    private boolean syn;

    private String version;

}
