package com.homura.intercept;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器3
 *
 * @author zouhl
 */
public class MyInterceptC implements HandlerInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyInterceptC.class);

    /**
     * 前置处理
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @param handler  chosen handler to execute, for type and/or instance evaluation
     * @return 是否执行后续的拦截器和handle方法
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

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
    /**
     * 后置处理
     *
     * @param request      current HTTP request
     * @param response     current HTTP response
     * @param handler      the handler (or {@link HandlerMethod}) that started asynchronous
     *                     execution, for type and/or instance examination
     * @param modelAndView the {@code ModelAndView} that the handler returned
     *                     (can also be {@code null})
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) {
        LOGGER.info("MyInterceptC postHandle");
    }
    /**
     * 最终处理
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @param handler  the handler (or {@link HandlerMethod}) that started asynchronous
     *                 execution, for type and/or instance examination
     * @param ex       any exception thrown on handler execution, if any; this does not
     *                 include exceptions that have been handled through an exception resolver
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) {
        LOGGER.info("MyInterceptC afterCompletion");
    }
}
