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

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getParentHash() {
        return parentHash;
    }

    public void setParentHash(String parentHash) {
        this.parentHash = parentHash;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getNonce() {
        return nonce;
    }

    public void setNonce(Long nonce) {
        this.nonce = nonce;
    }

    public String getCoinbase() {
        return coinbase;
    }

    public void setCoinbase(String coinbase) {
        this.coinbase = coinbase;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getChainId() {
        return chainId;
    }

    public void setChainId(Long chainId) {
        this.chainId = chainId;
    }

    public String getStateRoot() {
        return stateRoot;
    }

    public void setStateRoot(String stateRoot) {
        this.stateRoot = stateRoot;
    }

    public String getTxsRoot() {
        return txsRoot;
    }

    public void setTxsRoot(String txsRoot) {
        this.txsRoot = txsRoot;
    }

    public String getEventsRoot() {
        return eventsRoot;
    }

    public void setEventsRoot(String eventsRoot) {
        this.eventsRoot = eventsRoot;
    }

    public ConsensusRoot getConsensusRoot() {
        return consensusRoot;
    }

    public void setConsensusRoot(ConsensusRoot consensusRoot) {
        this.consensusRoot = consensusRoot;
    }

    public String getMiner() {
        return miner;
    }

    public void setMiner(String miner) {
        this.miner = miner;
    }

    public boolean isFinality() {
        return isFinality;
    }

    public void setFinality(boolean finality) {
        isFinality = finality;
    }

    public List<TransactionReceipt> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionReceipt> transactions) {
        this.transactions = transactions;
    }
}
