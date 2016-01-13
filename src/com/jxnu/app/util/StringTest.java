package com.jxnu.app.util;

/**
 * Created by puchunwei on 16/1/13.
 */
public class StringTest {
    public static void main(String[] args) throws Exception {
        String str = "hahah";
        Thread.sleep(1000);
        byte[] strBytes = str.getBytes();
        System.out.print(strBytes);
    }
}
