package com.javaTest.exception_.customexception;

public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        if (age >= 18 && age <= 120) {
            throw new AgeException("年龄必须在18~~120之间！！！！");
        }
        System.out.println("请输入年龄的正确的范围！！！");
    }
}
//自定义异常
//1、一般情况下，我们自定义异常是继承RuntimeException。
//2、即把自定义异常做成，运行异常，好处是：我们可以使用默认的处理机制。
//3、即比较方便
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
/**         意义                      位置              后面跟的东西
 * throws   异常处理的一种方式           方法声明处         异常类型
 * throw    手动生成异常对象的关键字      方法体中          异常对象
* */