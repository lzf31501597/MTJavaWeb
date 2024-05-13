package com.itheima.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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

    //@Pointcut("execution(void com.itheima.dao.BookDao.update())")切入点
    //@Pointcut("execution(void com.itheima.dao.impl.BookDaoImpl.update())")//切入点
    //@Pointcut("execution(* com.itheima.dao.BookDao.update(*))")//切入点  no
    @Pointcut("execution(* com.*.*.*.update())")//切入点
    private void pt(){}

    @Before("pt()")
    public void method(){
        long startTime = System.currentTimeMillis();
        System.out.println("执行时间：" + startTime + "ms");
    }
}
