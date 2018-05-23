package io.nebulas.client.admin.request;


import io.nebulas.client.api.request.Contract;
import io.nebulas.client.enums.TransactionType;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class SendTransactionRequest implements Serializable {

    private String from;

    private String to;

    private String value;

    private Long nonce;

    private String gasPrice;

    private String gasLimit;

    private TransactionType type;

    private Contract contract;

    public SendTransactionRequest() {
    }

    public SendTransactionRequest(String from, String to, String value, Long nonce, String gasPrice, String gasLimit, TransactionType type) {
        this.from = from;
        this.to = to;
        this.value = value;
        this.nonce = nonce;
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
        this.type = type;
    }

    public SendTransactionRequest(String from, String to, String value, Long nonce, String gasPrice, String gasLimit, TransactionType type, Contract contract) {
        this.from = from;
        this.to = to;
        this.value = value;
        this.nonce = nonce;
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
        this.type = type;
        this.contract = contract;
    }

    public String getFrom() {
        return from;
    }

    public SendTransactionRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public SendTransactionRequest setTo(String to) {
        this.to = to;
        return this;
    }

    public String getValue() {
        return value;
    }

    public SendTransactionRequest setValue(String value) {
        this.value = value;
        return this;
    }

    public Long getNonce() {
        return nonce;
    }

    public SendTransactionRequest setNonce(Long nonce) {
        this.nonce = nonce;
        return this;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public SendTransactionRequest setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
        return this;
    }

    public String getGasLimit() {
        return gasLimit;
    }

    public SendTransactionRequest setGasLimit(String gasLimit) {
        this.gasLimit = gasLimit;
        return this;
    }

    public TransactionType getType() {
        return type;
    }

    public SendTransactionRequest setType(TransactionType type) {
        this.type = type;
        return this;
    }

    public Contract getContract() {
        return contract;
    }

    public SendTransactionRequest setContract(Contract contract) {
        this.contract = contract;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SendTransactionRequest{");
        sb.append("from='").append(from).append('\'');
        sb.append(", to='").append(to).append('\'');
        sb.append(", value=").append(value);
        sb.append(", nonce=").append(nonce);
        sb.append(", gasPrice=").append(gasPrice);
        sb.append(", gasLimit=").append(gasLimit);
        sb.append(", type=").append(type);
        sb.append(", contract=").append(contract);
        sb.append('}');
        return sb.toString();
    }
}
