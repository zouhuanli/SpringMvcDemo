package com.homura.aopproxy.jdk;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy implements InvocationHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestProxy.class);
    /**
     * 目标对象
     */
    private Object target;

    public Object newProxyInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (!method.getName().contains("test")) {
            return method.invoke(target, args);
        }
        LOGGER.info("调用前:[{}]-[{}]", proxy, method);
        Object result = method.invoke(target, args);
        LOGGER.info("调用后:[{}]-[{}]", proxy, method);
        return result;
    }
}
