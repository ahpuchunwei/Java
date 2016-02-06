package com.jxnu.app.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by puchunwei on 16/1/16.
 */
public enum  TestEnumType {

    Test("test");

    private String value;

    private TestEnumType(String value) {
        this.value = value;
    }

    public  String getValue() {
        return this.value;
    }

    private static Map<String, TestEnumType> map = new HashMap<String, TestEnumType>();

    static {
        for (TestEnumType engineType : TestEnumType.values()) {
            map.put(engineType.getValue(), engineType);
        }
    }

    public static TestEnumType getTestEnumType(String testEnumType) {
        return map.get(testEnumType);
    }

}
