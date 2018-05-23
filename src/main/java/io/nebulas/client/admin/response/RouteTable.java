package io.nebulas.client.admin.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by liuyang89 on 2018/05/10
 **/
@Data
@ToString
public class RouteTable implements Serializable {

    private String id;

    private List<String> address = new ArrayList<>();

}
