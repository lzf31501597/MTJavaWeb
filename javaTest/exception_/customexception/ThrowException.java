package com.javaTest.exception_.customexception;

public class ThrowException {
    /**         意义                      位置              后面跟的东西
     * throws   异常处理的一种方式           方法声明处         异常类型
     * throw    手动生成异常对象的关键字      方法体中          异常对象
     * */
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());//3
        }
        ReturnExceptionDemo.methodB();

/*      进入方法A。。。。。。。
        调用方法A的finally。。。。。
        制造异常。。。。。。
        进入方法B。。。。。。。
        调用方法B的finally。。。。。*/
    }
}
class ReturnExceptionDemo {
    static void methodA(){
        try {
            System.out.println("进入方法A。。。。。。。");//1
            throw new RuntimeException("制造异常。。。。。。");//3
        } finally {
            System.out.println("调用方法A的finally。。。。。");//2
        }
    }
    static void methodB(){
        try {
            System.out.println("进入方法B。。。。。。。");//4
            return;
        } finally {
            System.out.println("调用方法B的finally。。。。。");//5
        }
    }
}