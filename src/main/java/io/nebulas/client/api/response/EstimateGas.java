package io.nebulas.client.api.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/07
 **/
@Data
@ToString
public class EstimateGas implements Serializable {

    private String gas;

    private String err;

}
