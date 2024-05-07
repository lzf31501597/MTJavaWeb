package com.itheima.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author
 * @version 1.0
 * @date 2024/03/22 16:38
 * @Description
 */

//增强类，内部提供增强方法
public class MyAdvice06 implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕前。。。。。。");
        Object result = invocation.getMethod().invoke(invocation.getThis(), invocation.getArguments());
        System.out.println("环绕后。。。。。。");
        return result;
    }
}
