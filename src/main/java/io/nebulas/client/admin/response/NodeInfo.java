package io.nebulas.client.admin.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/10
 **/
@Data
@ToString
public class NodeInfo implements Serializable {

    private String id;

    @SerializedName("chain_id")
    private Long chainId;

    @SerializedName("coninbase")
    private String coinbase;

    @SerializedName("peer_count")
    private Long peerCount;

    @SerializedName(value = "synchronized")
    private boolean syn;

    @SerializedName("bucket_size")
    private Integer bucketSize;

    @SerializedName("protocol_version")
    private String protocolVersion;

    @SerializedName("route_table")
    private List<RouteTable> routeTable = new ArrayList<>();

}
