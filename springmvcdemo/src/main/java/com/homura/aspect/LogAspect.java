package com.homura.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 简单的日志切面，主要是演示五种通知的用法
 *
 * @author zouhl
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Component
@Aspect
public class LogAspect {
    private static final Logger LOGGER= LoggerFactory.getLogger(LogAspect.class);

    /**
     * 定义切入点
     */
    @Pointcut("execution (* com.homura.controller.*.*(..))")
    private void pointCutMethod() {
    }


    /**
     * 环绕通知
     *
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("环绕通知:进入方法");
        Object originalResult = joinPoint.proceed();
        LOGGER.info("环绕通知:退出方法");
        return originalResult;
    }

    /**
     * 前置通知
     */
    @Before("pointCutMethod()")
    public void doBefore() {
        LOGGER.info("前置通知");
    }

    /**
     * 最终通知
     */
    @After("pointCutMethod()")
    public void doAfter() {
        LOGGER.info("最终通知");
    }

    /**
     * 后置通知
     *
     * @param result
     */
    @AfterReturning(value = "pointCutMethod()", returning = "result")
    public void doAfterReturning(Object result) {
        LOGGER.info("后置通知,返回值：" + result);
    }

    /**
     * 异常通知
     *
     * @param e
     */
    @AfterThrowing(value = "pointCutMethod()", throwing = "e")
    public void doAfterThrowing(Exception e) {
        LOGGER.info("异常通知,异常值：" + e);
    }

}
