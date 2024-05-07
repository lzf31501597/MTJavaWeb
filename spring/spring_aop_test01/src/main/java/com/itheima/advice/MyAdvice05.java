package com.itheima.advice;

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
public class MyAdvice05 implements MethodBeforeAdvice, AfterReturningAdvice {


    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置的增强。。。通知。。。。。。");
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置的增强。。。通知。。。。。。");
    }
}
