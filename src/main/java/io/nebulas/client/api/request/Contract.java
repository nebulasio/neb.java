package io.nebulas.client.api.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class Contract implements Serializable {

    private String source;

    private String sourceType;

    private String function;

    private String args;

    public Contract() {
    }

    public Contract(String source, String sourceType, String function, String args) {
        this.source = source;
        this.sourceType = sourceType;
        this.function = function;
        this.args = args;
    }

    public String getSource() {
        return source;
    }

    public Contract setSource(String source) {
        this.source = source;
        return this;
    }

    public String getSourceType() {
        return sourceType;
    }

    public Contract setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public String getFunction() {
        return function;
    }

    public Contract setFunction(String function) {
        this.function = function;
        return this;
    }

    public String getArgs() {
        return args;
    }

    public Contract setArgs(String args) {
        this.args = args;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contract{");
        sb.append("source='").append(source).append('\'');
        sb.append(", sourceType='").append(sourceType).append('\'');
        sb.append(", function='").append(function).append('\'');
        sb.append(", args='").append(args).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
