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
public class Accounts implements Serializable {

    private List<String> addresses = new ArrayList<>();

}
