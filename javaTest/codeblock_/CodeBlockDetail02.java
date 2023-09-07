package com.javaTest.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A01 a01 = new A01();
//        getVal() 方法被调用。。。。。。。。
//        A01的 static 代码块。。。。。。。
//        getVal2() 方法被调用。。。。。。。。
//        A01的 普通 代码块。。。。。。。
//        A01() 的构造器

        A a1 = new A();
//        A的 static 代码块。。。。。。。
//        getVal() 方法被调用。。。。。。。。
//        A的 普通 代码块。。。。。。。
//        getVal2() 方法被调用。。。。。。。。
//        A() 的构造器
    }
}
class A {
    //创建一个对象时，这个类的调用顺序是:
    //1、调用静态代码块和静态属性初始化：（注意：静态代码块和静态属性初始化的调用优先级一样，
    //      如果有多个静态代码块和多个静态变量初始化，则按定义的先后顺序调用）
    //2、调用普通代码块和普通属性初始化：（注意：普通代码块和普通属性初始化的调用优先级一样，
    //      如果有多个静态代码块和多个静态变量初始化，则按定义的先后顺序调用）
    //3、调用构造方法


    {
        System.out.println("A的 普通 代码块。。。。。。。");//4
    }
    private int n2 = getVal2();//5

    static{
        System.out.println("A的 static 代码块。。。。。。。");//1
    }
    private static int n1 = getVal();//2
    public A() {
        super();
        System.out.println("A() 的构造器");//7
    }
    public static int getVal(){
        System.out.println("getVal() 方法被调用。。。。。。。。");//3
        return 10;
    }
    public int getVal2(){
        System.out.println("getVal2() 方法被调用。。。。。。。。");//6
        return 30;
    }
}
class A01 {
    //创建一个对象时，这个类的调用顺序是:
    //1、调用静态代码块和静态属性初始化：（注意：静态代码块和静态属性初始化的调用优先级一样，
    //      如果有多个静态代码块和多个静态变量初始化，则按定义的先后顺序调用）
    //2、调用普通代码块和普通属性初始化：（注意：普通代码块和普通属性初始化的调用优先级一样，
    //      如果有多个静态代码块和多个静态变量初始化，则按定义的先后顺序调用）
    //3、调用构造方法


    private static int n1 = getVal();//1
    private int n2 = getVal2();//4
    {
        System.out.println("A01的 普通 代码块。。。。。。。");//6
    }
    static{
        System.out.println("A01的 static 代码块。。。。。。。");//3
    }

    public A01() {
        super();
        System.out.println("A01() 的构造器");//7
    }
    public static int getVal(){
        System.out.println("getVal() 方法被调用。。。。。。。。");//2
        return 10;
    }
    public int getVal2(){
        System.out.println("getVal2() 方法被调用。。。。。。。。");//5
        return 30;
    }
}