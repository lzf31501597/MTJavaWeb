package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * @date 2024/05/13 18:05
 * @Description
 */

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")//匹配业务层的所有方法
    private void servicePt(){

    }

    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Signature signature = proceedingJoinPoint.getSignature();

        String methodName = signature.getName();
        String className = signature.getDeclaringTypeName();
        //System.out.println(signature.getDeclaringType());
        //System.out.println(signature.getModifiers());
        //System.out.println(signature.getClass());

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++) {
            proceedingJoinPoint.proceed();
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("业务层接口万次执行时间：" + className + "." + methodName+"-->" + totalTime + "ms");
    }
}
