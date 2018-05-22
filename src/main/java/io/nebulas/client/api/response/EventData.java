package io.nebulas.client.api.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/18
 **/
@Data
@ToString
public class EventData implements Serializable {

    private String hash;

    private Integer status;

    @SerializedName("gas_used")
    private String gasUsed;

    private String error;

}
