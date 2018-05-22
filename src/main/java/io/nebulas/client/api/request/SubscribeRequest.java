package io.nebulas.client.api.request;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class SubscribeRequest implements Serializable {

    public static final String CHAIN_PENDING_TRANSACTION = "chain.pendingTransaction";

    public static final String CHAIN_LATEST_IRREVERSIBLE_BLOCK = "chain.latestIrreversibleBlock";

    public static final String CHAIN_TRANSACTION_RESULT = "chain.transactionResult";

    public static final String CHAIN_NEW_TAIL_BLOCK = "chain.newTailBlock";

    public static final String CHAIN_REVERT_BLOCK = "chain.revertBlock";

    private List<String> topics;

    public SubscribeRequest(String... topics){
        this.topics = Lists.newArrayList(topics);
    }

    public SubscribeRequest(List<String> topics) {
        this.topics = topics;
    }

    public List<String> getTopics() {
        return topics;
    }

    public SubscribeRequest setTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubscribeRequest{");
        sb.append("topics=").append(topics);
        sb.append('}');
        return sb.toString();
    }
}
