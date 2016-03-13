package com.jxnu.app.Proxy;

public class HelloImpl implements IHello {

    @Override
    public void hello(String name) {
        System.out.println("Hello, " + name);
    }
}
