package com.jxnu.app.util;

import java.lang.reflect.Method;

/**
 * Created by puchunwei on 16/1/16.
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("java.util.ArrayList");//寻找一个叫做java.util.ArrayList的类

        Object instance = c.newInstance();//直接创建这个类的实例

        Method isEmptyMethod = c.getDeclaredMethod("isEmpty");//去这个类中找一个叫isEmpty的方法

        boolean isEmpty = (Boolean) isEmptyMethod.invoke(instance);//调用该方法

        System.out.println(instance.toString());
        System.out.println(isEmpty);
    }
}
