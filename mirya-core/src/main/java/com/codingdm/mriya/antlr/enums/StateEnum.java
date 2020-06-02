package com.codingdm.mriya.antlr.enums;

/**
 * @author wudongming1
 * @email dongming1.wu@genscript.com
 * @create 2019-08-09 13:24
 **/
public enum StateEnum {
    ENABLE("Y"),
    DISABLE("N");

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    StateEnum(String value) {
        this.value = value;
    }

}
