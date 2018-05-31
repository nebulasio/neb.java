package io.nebulas.client.enums;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public enum AddressType {

    
    NORMAL_ADDRESS(87) , CONTRACT_ADDRESS(88);

    private Integer value;

    /**
    * AddressType constructor
    *
    * @parameter {Integer} value
    *
    */
    AddressType(Integer value) {
        this.value = value;
    }

    /**
    * method get the value
    */
    public Integer getValue() {
        return value;
    }

    /**
    * method set the value and get the object
    */
    public AddressType setValue(Integer value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressType{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
