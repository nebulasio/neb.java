package io.nebulas.client.admin.request;


import io.nebulas.client.api.request.Contract;
import io.nebulas.client.enums.TransactionType;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class SendTransactionRequest implements Serializable {
    /**
    * @property {String} from
    * @property {String} to
    * @property {String} value
    * @property {String} nonce
    * @property {String} gasPrice
    * @property {String} gasLimit
    * @property {TransactionType} type
    * @property {Contract} contract
    */
    private String from;

    private String to;

    private String value;

    private Long nonce;

    private String gasPrice;

    private String gasLimit;

    private TransactionType type;

    private Contract contract;

    /**
    * SendTransactionRequest constructor
    */
    public SendTransactionRequest() {
    }

    /**
    * SendTransactionRequest constructor with parameters
    */
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

    /**
    * method get the from
    */
    public String getFrom() {
        return from;
    }

    /**
    * method set the from and get the object
    */
    public SendTransactionRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
    * method get the to
    */
    public String getTo() {
        return to;
    }

    /**
    * method set the to and get the object
    */
    public SendTransactionRequest setTo(String to) {
        this.to = to;
        return this;
    }

    /**
    * method get the value
    */
    public String getValue() {
        return value;
    }

    /**
    * method set the value and get the object
    */
    public SendTransactionRequest setValue(String value) {
        this.value = value;
        return this;
    }

    /**
    * method get the nonce
    */
    public Long getNonce() {
        return nonce;
    }

    /**
    * method set the nonce and get the object
    */
    public SendTransactionRequest setNonce(Long nonce) {
        this.nonce = nonce;
        return this;
    }

    /**
    * method get the price
    */
    public String getGasPrice() {
        return gasPrice;
    }

    /**
    * method set the price and get the object
    */
    public SendTransactionRequest setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
        return this;
    }

    /**
    * method get the gasLimit
    */
    public String getGasLimit() {
        return gasLimit;
    }

    /**
    * method set the gasLimit and get the object
    */
    public SendTransactionRequest setGasLimit(String gasLimit) {
        this.gasLimit = gasLimit;
        return this;
    }

    /**
    * method get the type
    */
    public TransactionType getType() {
        return type;
    }

    /**
    * method set the type and get the object
    */
    public SendTransactionRequest setType(TransactionType type) {
        this.type = type;
        return this;
    }

    /**
    * method get the contract
    */
    public Contract getContract() {
        return contract;
    }

    /**
    * method set the contract and get the object
    */
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
