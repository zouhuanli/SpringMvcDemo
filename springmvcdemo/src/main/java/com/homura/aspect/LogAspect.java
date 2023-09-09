package com.homura.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution (* com.homura.service.*.*(..))")
    private void pointCutMethod() {
    }


    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("----------");
        System.out.println("环绕通知:进入方法");
        Object originalResult = joinPoint.proceed();
        System.out.println("环绕通知:退出方法");
        return originalResult;
    }

    @Before("pointCutMethod()")
    public void doBefore() {
        System.out.println("前置通知");
    }

    @After("pointCutMethod()")
    public void doAfter() {
        System.out.println("后者通知");
    }

    @AfterReturning(value = "pointCutMethod()", returning = "result")
    public void doAfterReturning(Object result) {
        System.out.println("后置通知,返回值：" + result);
    }

    @AfterThrowing(value = "pointCutMethod()", throwing = "e")
    public void doAfterThrowing(Exception e) {
        System.out.println("异常通知,异常值：" + e);
    }

}
