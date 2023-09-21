package com.javaTest.exception_;

/*
* 异常处理机制：
* */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //int res = num1 / num2;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("异常抛出：" + e.getMessage());//输出异常信息
        }
//
//        Throwable throwable = new Throwable();
//        throwable.

        System.out.println("程序继续运行");
    }
}
