package com.jxnu.app.util;

/**
 * Created by puchunwei on 16/1/11.
 */
public class StringSub {
    public static void main(String[] args) throws Exception {
        String testString = "HHHHFFFF";
        testString = testString.substring(4, 6); // 取swiftCode的第5.6位
        System.out.print(testString);


    }
}
