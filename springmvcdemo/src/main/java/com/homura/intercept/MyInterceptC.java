package com.homura.intercept;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptC implements HandlerInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyInterceptC.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        LOGGER.info("MyInterceptC preHandle");
        /**
         * return false导致HandlerAdapter.handle不执行，controller的方法不执行，从interceptIndex开始倒序执行afterCompletion方法
         * 2023-09-20 20:56:26,469|INFO |       MyInterceptA.java:18  |http-nio-8080-exec-4|MyInterceptA preHandle
         * 2023-09-20 20:56:26,469|INFO |       MyInterceptB.java:18  |http-nio-8080-exec-4|MyInterceptB preHandle
         * 2023-09-20 20:56:26,469|INFO |       MyInterceptC.java:18  |http-nio-8080-exec-4|MyInterceptC preHandle
         * 2023-09-20 20:56:26,469|INFO |       MyInterceptB.java:31  |http-nio-8080-exec-4|MyInterceptB afterCompletion
         * 2023-09-20 20:56:26,469|INFO |       MyInterceptA.java:31  |http-nio-8080-exec-4|MyInterceptA afterCompletion*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {
        LOGGER.info("MyInterceptC postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) throws Exception {
        LOGGER.info("MyInterceptC afterCompletion");
    }
}
