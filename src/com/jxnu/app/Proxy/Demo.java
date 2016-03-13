package com.jxnu.app.Proxy;

public class Demo {

    public static void main(String[] args) {
        HelloProxyImpl proxy = new HelloProxyImpl();

        IHello helloProxy = (IHello) proxy.bind(new HelloImpl());
        helloProxy.hello("Spring");
    }
}
