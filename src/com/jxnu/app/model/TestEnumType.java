package com.jxnu.app.model;

/**
 * Created by puchunwei on 16/1/16.
 */
public enum  TestEnumType {

    Test("test");

    private String value;

    private TestEnumType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
