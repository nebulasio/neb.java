package io.nebulas.client.api.response;


import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Create by liuyang89 on 2018/05/05
 **/
@Data
@ToString
public class AccountState implements Serializable {

    private BigDecimal balance;

    private Long nonce;

    private Integer type;
}
