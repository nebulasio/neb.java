package io.nebulas.client.api.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class EstimateGasRequest implements Serializable {

    private String from;

    private String to;

    private String value;

    private Long nonce;

    @SerializedName("gas_price")
    private String gasPrice;

    @SerializedName("gas_limit")
    private String gasLimit;

    private String contract;

    private byte[] binary;

    public EstimateGasRequest() {
    }

    public EstimateGasRequest(String from, String to, String value, Long nonce, String gasPrice, String gasLimit) {
        this.from = from;
        this.to = to;
        this.value = value;
        this.nonce = nonce;
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
    }

    public EstimateGasRequest(String from, String to, String value, Long nonce, String gasPrice, String gasLimit, String contract) {
        this.from = from;
        this.to = to;
        this.value = value;
        this.nonce = nonce;
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
        this.contract = contract;
    }

    public String getFrom() {
        return from;
    }

    public EstimateGasRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public EstimateGasRequest setTo(String to) {
        this.to = to;
        return this;
    }

    public String getValue() {
        return value;
    }

    public EstimateGasRequest setValue(String value) {
        this.value = value;
        return this;
    }

    public Long getNonce() {
        return nonce;
    }

    public EstimateGasRequest setNonce(Long nonce) {
        this.nonce = nonce;
        return this;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public EstimateGasRequest setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
        return this;
    }

    public String getGasLimit() {
        return gasLimit;
    }

    public EstimateGasRequest setGasLimit(String gasLimit) {
        this.gasLimit = gasLimit;
        return this;
    }

    public String getContract() {
        return contract;
    }

    public EstimateGasRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }

    public byte[] getBinary() {
        return binary;
    }

    public EstimateGasRequest setBinary(byte[] binary) {
        this.binary = binary;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EstimateGasRequest{");
        sb.append("from='").append(from).append('\'');
        sb.append(", to='").append(to).append('\'');
        sb.append(", value=").append(value);
        sb.append(", nonce=").append(nonce);
        sb.append(", gasPrice=").append(gasPrice);
        sb.append(", gasLimit=").append(gasLimit);
        sb.append(", contract='").append(contract).append('\'');
        sb.append(", binary=").append(Arrays.toString(binary));
        sb.append('}');
        return sb.toString();
    }
}
