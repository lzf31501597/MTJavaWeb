package com.itheima.aop;

/**
 * @author
 * @version 1.0
 * @date 2024/05/13 15:46
 * @Description
 */
public class MyAdvice {
    long startTime;
    long endTime;
    long totalTime;
    public void methodBefore() {
        //开始时间
        startTime = System.currentTimeMillis();
        //业务执行次数
        for (int i = 0; i < 10000; i++){

        }
    }

    public void methodAfter(long startTime) {

        //结束时间
        endTime = System.currentTimeMillis();
        //计算时间差
        totalTime = endTime - startTime;
        //输出信息
        System.out.println("执行万次消耗时间：" + totalTime + "ms");
    }
}
