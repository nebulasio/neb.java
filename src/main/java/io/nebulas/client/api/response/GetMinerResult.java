package io.nebulas.client.api.response;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/07
 **/
@Data
@ToString
public class GetMinerResult implements Serializable {

    private List<String> miners = Lists.newArrayList();

}
