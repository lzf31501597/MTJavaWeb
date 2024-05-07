package com.itheima.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author
 * @version 1.0
 * @date 2024/03/22 16:38
 * @Description
 */

//增强类，内部提供增强方法
public class MyAdvice {

    /*public void beforeAdvice(){
        System.out.println("前置的增强。。。。。。");
    }*/
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("当前目标对象是："+joinPoint.getTarget());
        System.out.println("表达式："+joinPoint.getStaticPart());
        System.out.println("前置的增强。。。。。。");
    }
    public void afterAdvice(){
        System.out.println("最终的后置的增强。。。。。。");
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前的增强");
        Object res = proceedingJoinPoint.proceed(); //执行目标方法
        System.out.println("环绕后的增强");
        return res;
    }

    public void afterReturningAdvice(){
        System.out.println("后置的增强。。。。。。  ");
    }
    public void afterThrowingAdvice(){
        System.out.println("异常抛出通知。。。。报异常才执行  ");
    }
}
