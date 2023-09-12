package com.javaTest.interface_.interfaceDetail;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.hi();
        cat.say();
    }
}

/**
 * 1、接口不能被实例化
 * 2、接口中所有的方法是public方法，接口中的抽象方法，可以不用abstract关键字修饰
 * 3、一个普通类的实现接口，就必须将该接口的所有方法都实现，可以使用alt+enter来解决
 * 4、抽象类的实现接口，可以不用实现接口的方法
 * */

interface ID{
    void say();
    void hi();
}
class Cat implements ID {

    @Override
    public void say() {
        System.out.println("Cat 喵喵叫。。。。。。。。");
    }

    @Override
    public void hi() {
        System.out.println("Cat hi().........");
    }
}

abstract class Tiger implements ID {

}