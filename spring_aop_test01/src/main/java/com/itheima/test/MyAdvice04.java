package com.itheima.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author
 * @version 1.0
 * @date 2024/03/22 16:38
 * @Description
 */

//增强类，内部提供增强方法
public class MyAdvice04 {

    public void before(){
        System.out.println("前置的增强。。。。。。");
    }
    public void after(){
        System.out.println("后置的增强。。。。。。");
    }

}
