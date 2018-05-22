package io.nebulas.core;

import com.google.gson.Gson;
import io.nebulas.util.JSONUtils;

import java.math.BigInteger;

/**
 * The TransactionCallPayload is a class describing the payload data of a DEPLOY type transaction.
 * Please refer to <a href="https://github.com/nebulasio/wiki/blob/master/rpc_admin.md#sendtransaction"><tt>sendtransaction</tt></a>"
 */
public class TransactionDeployPayload implements TransactionPayload {

    /**
     * The constant SourceTypeJavaScript.
     */
    public static final String SourceTypeJavaScript = "js";
    /**
     * The constant SourceTypeTypeScript.
     */
    public static final String SourceTypeTypeScript = "ts";

    private String SourceType;
    private String Source;
    private String Args;

    /**
     * Function LoadPayload build a new TransactionCallPayload from given payload data..
     *
     * @param data the payload data
     * @return the generated TransactionDeployPayload object
     * @throws Exception if the source type is not {@value SourceTypeJavaScript} or {@value SourceTypeTypeScript},
     * or the source code is empty
     */
    public static TransactionDeployPayload LoadPayload(byte[] data) throws Exception {
        TransactionDeployPayload payload = JSONUtils.Parse(data, TransactionDeployPayload.class);
        return new TransactionDeployPayload(payload.getSourceType(), payload.getSource(), payload.getArgs());
    }

    /**
     * Constructs a new Transaction deploy payload.
     * Please refer to <a href="https://github.com/nebulasio/wiki/blob/master/rpc_admin.md#sendtransaction"><tt>sendtransaction</tt></a>"
     *
     * @param sourceType the source code type
     * @param source     the source code
     * @param args       the args of deploying contract
     * @throws Exception if the source type is not {@value SourceTypeJavaScript} or {@value SourceTypeTypeScript},
     * or the source code is empty
     */
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

    /**
     * Gets source type.
     *
     * @return the source type
     */
    public String getSourceType() {
        return SourceType;
    }

    /**
     * Sets source type.
     *
     * @param sourceType the source type
     */
    public void setSourceType(String sourceType) {
        SourceType = sourceType;
    }

    /**
     * Gets source code.
     *
     * @return the source code
     */
    public String getSource() {
        return Source;
    }

    /**
     * Sets source code.
     *
     * @param source the source code
     */
    public void setSource(String source) {
        Source = source;
    }

    /**
     * Gets args.
     *
     * @return the args
     */
    public String getArgs() {
        return Args;
    }

    /**
     * Sets args.
     *
     * @param args the args
     */
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
