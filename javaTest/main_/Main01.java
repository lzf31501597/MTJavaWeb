package com.javaTest.main_;

public class Main01 {
    //静态属性、变量
    private static String name = "HSPedu";
    //非静态变量、属性
    private int n1 = 10000;
    //静态方法
    public static void hi() {
        System.out.println("Main01 hi()");
    }
    //非静态方法
    public void cry() {
        System.out.println("Main01 cry()");
    }

    public static void main(String[] args) {
        //可以直接使用name
        //1、静态方法main，可以访问本类的非静态成员
        System.out.println("name=" + name);
        hi();

        //2、静态方法main，不可以访问本类的非静态成员
        //System.out.println("n1=" + n1);//error
        //cry();

        //3、静态方法main，要访问本类的非静态成员，需要先创建对象，再调用
        Main01 main01 = new Main01();
        System.out.println("main01.n1=" + main01.n1);
        main01.cry();
    }
}
