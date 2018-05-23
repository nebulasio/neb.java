package io.nebulas.client.admin.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class SendTransactionResult implements Serializable {

    private String txhash;

    private String contractAddress;

    public String getTxhash() {
        return txhash;
    }

    public SendTransactionResult setTxhash(String txhash) {
        this.txhash = txhash;
        return this;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public SendTransactionResult setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SendTransactionResult{");
        sb.append("txhash='").append(txhash).append('\'');
        sb.append(", contractAddress='").append(contractAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
