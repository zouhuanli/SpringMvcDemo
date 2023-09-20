package com.homura.intercept;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器1
 *
 * @author zouhl
 */
public class MyInterceptA implements HandlerInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyInterceptA.class);

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
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        LOGGER.info("MyInterceptA preHandle");
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
                           @Nullable ModelAndView modelAndView) throws Exception {
        LOGGER.info("MyInterceptA postHandle");
    }

    /**
     * 最终处理，我自己翻译的
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
                                @Nullable Exception ex) throws Exception {
        LOGGER.info("MyInterceptA afterCompletion");
    }
}
