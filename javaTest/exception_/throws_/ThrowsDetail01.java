package com.javaTest.exception_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail01 {
    public static void main(String[] args) {
        f2();
    }

    //1.对于编译异常，程序中必须处理，比如 try-catch 或者 throws
    //2.对于运行时异常，程序中如果没有处理，默认就是 throws 的方式处理

    public static void f2() throws ArithmeticException{
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;

    }

    public static void f1() throws FileNotFoundException {
        //1、因为f3()方法抛出的是一个编译异常
        //2、即这时，就要去f1（），必须处理这个编译异常
        //3、在f1（）中，要么try-catch-finally，或者继续throws这个变异常
        f3();//抛出异常
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("./aa.txt");
    }
    public static void f4(){
        //1、在f4()中调用方法f5（）是OK
        //2、原因是方法f5()抛出的是运行异常
        //3、而Java中，并不要求程序员显示处理运行异常，因为有默认处理机制。
        f5();
    }
    public static void f5() throws ArithmeticException{

    }
}
class Father { //父类
    public void method() throws RuntimeException { }
}
class Son extends Father {//子类
    //3. 子类重写父类的方法时，对抛出异常的规定:子类重写的方法，
    //      所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型
    //4. 在 throws 过程中，如果有方法 try-catch , 就相当于处理异常，就可以不必 throws @Override
    public void method() throws ArithmeticException {
    }
}