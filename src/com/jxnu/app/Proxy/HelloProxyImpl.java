package com.jxnu.app.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloProxyImpl implements InvocationHandler {
    private Object delegate;

    public Object bind(Object delegate) {
        this.delegate = delegate;
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = null;

        try {
            print("before call" + method);

            result = method.invoke(delegate, args);

            print("after call" + method);
        } catch (Exception e) {
            print(e.toString());
        }

        return result;
    }

    private void print(String message) {
        System.out.println(message);
    }
}
