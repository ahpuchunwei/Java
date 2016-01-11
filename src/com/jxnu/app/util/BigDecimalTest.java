package com.jxnu.app.util;

import java.math.BigDecimal;

/**
 * Created by puchunwei on 16/1/11.
 */
public class BigDecimalTest {
    public static void main(String[] args) throws Exception {
        double d = 29.0 * 0.01;
        System.out.println(d);
        System.out.println(d * 100);
        System.out.println((int) (d * 100));


        float f = (float) (29.45*0.01);
        System.out.println(f);
        System.out.println(f * 100);
        System.out.println((int) (f * 100));

        BigDecimal a = new BigDecimal("1.22");
        System.out.println("construct with a String value: " + a);
        BigDecimal b = new BigDecimal("2.22");
        a.add(b);
        System.out.println("a plus b is : " + a);


        //需要使用String初始化对象
        BigDecimal x = new BigDecimal("500000000.00");
        BigDecimal y = new BigDecimal("0.6");
        BigDecimal z = x.multiply(y);
        System.out.println(">>>>>>>>>> "+z);
        //>>>>>>>>>> 300000000.000

        BigDecimal x2 = new BigDecimal(500000001);
        BigDecimal y2 = new BigDecimal(0.6);
        BigDecimal z2 = x2.multiply(y2);
        //>>>>>>>>>> 300000000.59999998889776973154397410326055251061916351318359375
        System.out.println(">>>>>>>>>> "+z2);
    }
}
