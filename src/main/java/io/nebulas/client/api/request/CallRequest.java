package io.nebulas.client.api.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class CallRequest implements Serializable {

    private String from;

    private String to;

    private String value;

    private Long nonce;

    private String gasPrice;

    private String gasLimit;

    private Contract contract;

    public CallRequest() {
    }

    public CallRequest(String from, String to, String value, Long nonce, String gasPrice, String gasLimit, Contract contract) {
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

    public CallRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public CallRequest setTo(String to) {
        this.to = to;
        return this;
    }

    public String getValue() {
        return value;
    }

    public CallRequest setValue(String value) {
        this.value = value;
        return this;
    }

    public Long getNonce() {
        return nonce;
    }

    public CallRequest setNonce(Long nonce) {
        this.nonce = nonce;
        return this;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public CallRequest setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
        return this;
    }

    public String getGasLimit() {
        return gasLimit;
    }

    public CallRequest setGasLimit(String gasLimit) {
        this.gasLimit = gasLimit;
        return this;
    }

    public Contract getContract() {
        return contract;
    }

    public CallRequest setContract(Contract contract) {
        this.contract = contract;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallRequest{");
        sb.append("from='").append(from).append('\'');
        sb.append(", to='").append(to).append('\'');
        sb.append(", value=").append(value);
        sb.append(", nonce=").append(nonce);
        sb.append(", gasPrice=").append(gasPrice);
        sb.append(", gasLimit=").append(gasLimit);
        sb.append(", contract=").append(contract);
        sb.append('}');
        return sb.toString();
    }
}
