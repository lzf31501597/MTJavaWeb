package com.javaTest.static_;

public class StatciDetail {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("b.n1=" + b.n1);
        //System.out.println("B.n1=" + B.n1);

        System.out.println("B.n2=" + B.n2);

        //静态变量是随着类加载的时候，就创建了，因此我们没有创建对象实例
        //也可以通过：类名。类变量名来访问
        //类变量的生命周期：随着类对象加载而开始，随着类消亡而销毁。，
        System.out.println("C.address=" + C.address);

    }
}
class B {
    public int n1 = 100;
    public static int n2 = 200;
}

class C {
    public static String address = "beijing";
}