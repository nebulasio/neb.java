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
public class ConsensusRoot implements Serializable {

    private Long timestamp;

    private String proposer;

    @SerializedName("dynasty_root")
    private String dynastyRoot;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    public String getDynastyRoot() {
        return dynastyRoot;
    }

    public void setDynastyRoot(String dynastyRoot) {
        this.dynastyRoot = dynastyRoot;
    }
}
