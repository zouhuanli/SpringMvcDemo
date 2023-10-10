package com.homura.aopproxy.jdk;

import org.slf4j.Logger;

public class TestServiceImpl implements TestService {
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public void test() {
        LOGGER.info("test");
    }
}
