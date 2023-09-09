package com.javaTest.interface_.interface02;

public class Interface02 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        a.ok();
        //a.cry();
    }
}

//1.如果一个类implements 实现接口
//2.需要将该接口的所有抽象方法都实现
class A implements Interface01 {

    @Override
    public void hi() {
        System.out.println("A hi().....");
    }
}
