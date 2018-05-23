package io.nebulas.client.api.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/05
 **/
@Data
@ToString
public class Block implements Serializable {

    private String hash;

    @SerializedName(value = "parent_hash")
    private String parentHash;

    private Long height;

    private Long nonce;

    @SerializedName(value = "coinbase")
    private String coinbase;

    private Long timestamp;

    @SerializedName("chain_id")
    private Long chainId;

    @SerializedName("state_root")
    private String stateRoot;

    @SerializedName("txs_root")
    private String txsRoot;

    @SerializedName("events_root")
    private String eventsRoot;

    @SerializedName("consensus_root")
    private ConsensusRoot consensusRoot;

    private String miner;

    @SerializedName("is_finality")
    private boolean isFinality;

    private List<TransactionReceipt> transactions = new ArrayList<>();

}
