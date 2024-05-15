package com.itheima.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author
 * @version 1.0
 * @date 2024/05/13 14:57
 * @Description
 */

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.itheima.dao.AccountDao.findName(..))")//切入点
    private void pt(){}

    //@Before("pt()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice.....");
    }

    //@After("pt()")
    public void after(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice.....");
    }

    //@Around("pt()")
    public Object around(ProceedingJoinPoint pjp){
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 888;
        Object obj = null;
        try {
            obj = pjp.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return obj;

    }

    @AfterReturning(value = "pt()", returning = "obj")
    public void afterReturning(JoinPoint joinPoint, Object obj){
        System.out.println("AfterReturning advice....." + obj);
    }

    @AfterThrowing(value = "pt()", throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("AfterThrowing advice....." + t);
    }

}
