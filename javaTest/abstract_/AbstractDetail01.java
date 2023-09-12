package com.javaTest.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //1、抽象类，不能被实例化
        //A a = new A();
    }
}
//2、抽象类不一定要包含abstract方法，也就是说，抽象类可以没有abstarct方法，还可以有实现方法。
abstract class A {
    public void hi(){
        System.out.println("hi()");
    }
}
//3、一旦类包含了abstract方法，则这个类就必须声明位abstract类
abstract class B {
    public abstract void hi();
}
//4、abstract 只能修饰类和方法，不能修饰属性和其他的
class C {
    //public abstract int n1 = 1;
}
//