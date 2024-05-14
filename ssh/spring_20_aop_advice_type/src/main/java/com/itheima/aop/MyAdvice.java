package com.itheima.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * @date 2024/05/13 14:57
 * @Description
 */

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.itheima.dao.BookDao.update())")//切入点
    //@Pointcut("execution(void com.itheima.dao.impl.BookDaoImpl.update())")//切入点
    //@Pointcut("execution(* com.itheima.dao.BookDao.update(*))")//切入点  no
    //@Pointcut("execution(* com.*.*.*.update())")//切入点
    //@Pointcut("execution(* *..update())")//切入点
    //@Pointcut("execution(* *..u*(..))")//切入点
    //@Pointcut("execution(* *..*e(..))")//切入点
    //@Pointcut("execution(void com..*())")//切入点
    //@Pointcut("execution(* com.itheima.*.*Service.find*(..))")//切入点
    //@Pointcut("execution(* com.itheima.*.*Service.save(..))")//切入点

    private void pt(){}
    @Pointcut("execution(int com.itheima.dao.BookDao.select())")//切入点
    private void pt2(){}


    //@Before("pt()")
    public void before(){
        System.out.println("before advice.....");
    }
    //@After("pt2()")
    public void after(){
        System.out.println("after advice.....");
    }
    //@Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice.....");
        pjp.proceed();
        System.out.println("after advice.....");

    }
    //@Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice.....");
        Integer obj = (Integer) pjp.proceed();
        System.out.println("after advice.....");
        return obj;
    }

    //@AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("AfterReturning advice.....");
    }
    @AfterThrowing("pt2()")
    public void afterThrowing(){
        System.out.println("AfterThrowing advice.....");
    }

}
