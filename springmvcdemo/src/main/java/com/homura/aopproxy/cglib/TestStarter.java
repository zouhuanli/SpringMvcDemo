package com.homura.aopproxy.cglib;

public class TestStarter {
    public static void main(String[] args) {
        TestProxy testProxy = new TestProxy();
        TestService testService = (TestService) testProxy.newProxyInstance(new TestServiceImpl());
        testService.test();
    }
}
