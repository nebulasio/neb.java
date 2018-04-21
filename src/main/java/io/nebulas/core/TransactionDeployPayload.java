package io.nebulas.core;

import com.google.gson.Gson;
import io.nebulas.util.JSONUtils;

import java.math.BigInteger;

public class TransactionDeployPayload implements TransactionPayload {

    public static final String SourceTypeJavaScript = "js";
    public static final String SourceTypeTypeScript = "ts";

    private String SourceType;
    private String Source;
    private String Args;

    public static TransactionDeployPayload LoadPayload(byte[] data) throws Exception {
        TransactionDeployPayload payload = JSONUtils.Parse(data, TransactionDeployPayload.class);
        return new TransactionDeployPayload(payload.getSourceType(), payload.getSource(), payload.getArgs());
    }

    public TransactionDeployPayload(String sourceType, String source, String args) throws Exception {
        checkArgs(sourceType, source, args);

        SourceType = sourceType;
        Source = source;
        Args = args;
    }

    private void checkArgs(String sourceType, String source, String args) throws Exception {
        if (source == null || source.length() == 0) {
            throw new Exception("invalid source of deploy payload");
        }
        if (!SourceTypeJavaScript.equalsIgnoreCase(sourceType) && !SourceTypeTypeScript.equalsIgnoreCase(sourceType)) {
            throw new Exception("invalid source type of deploy payload");
        }

        if (args != null && args.length() > 0 ) {
            Gson gson = new Gson();
            gson.fromJson(args, String[].class);
        }
    }

    public String getSourceType() {
        return SourceType;
    }

    public void setSourceType(String sourceType) {
        SourceType = sourceType;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getArgs() {
        return Args;
    }

    public void setArgs(String args) {
        Args = args;
    }

    @Override
    public byte[] toBytes() throws Exception {
        return JSONUtils.Stringify(this).getBytes();
    }

    @Override
    public BigInteger gasCount() {
        return new BigInteger("60");
    }
}
