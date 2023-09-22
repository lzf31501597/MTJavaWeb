package com.javaTest.exception_.trycatch_;

public class TryCatchDetail03 {
    public static void main(String[] args) {
        /*
            可以进行 try-finally 配合使用, 这种用法相当于没有捕获异常，
            因此程序会直接崩掉/退出。应用场景，就是执行一段代码，
            不管是否发生异常， 都必须执行某个业务逻辑
        */
        try{
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);//没有处理异常，JVM 直接将直接抛出来，
                    // ArithmeticException: / by zero， 执行finall之后，直接退出程序。
        }finally {
            System.out.println("执行了 finally..");
        }
        System.out.println("程序继续执行..");
    }
}
