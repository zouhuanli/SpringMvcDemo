package com.homura.aopproxy.cglib;

import org.slf4j.Logger;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TestProxy implements MethodInterceptor {
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(TestProxy.class);
    /**
     * 目标对象
     */
    private Object target;

    public Object newProxyInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        // 设置父类为实例类
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    /**
     * All generated proxied methods call this method instead of the original method.
     * The original method may either be invoked by normal reflection using the Method object,
     * or by using the MethodProxy (faster).
     *
     * @param obj    "this", the enhanced object
     * @param method intercepted Method
     * @param args   argument array; primitive types are wrapped
     * @param proxy  used to invoke super (non-intercepted method); may be called
     *               as many times as needed
     * @return any value compatible with the signature of the proxied method. Method returning void will ignore this value.
     * @throws Throwable any exception may be thrown; if so, super method will not be invoked
     * @see MethodProxy
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if (!method.getName().contains("test")) {
            return proxy.invokeSuper(obj, args);
        }
        LOGGER.info("调用前:[{}]-[{}]", obj, method);
        Object result = proxy.invokeSuper(obj, args);
        LOGGER.info("调用后:[{}]-[{}]", obj, method);
        return result;
    }


}
