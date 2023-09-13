package com.javaTest.interface_.PolyParametor;

public class InterfacePolyAPass {
    public static void main(String[] args) {
        //接口类型的变量，可以指向，实现了改接口的类对象实例
        IG ig = new Teacher();
        //Teacher类没有继承和实现IH类，所以报错
        //如果IG继承了IH接口，且Teacher类实现了IG接口。
        // 那么，实际上相当于Teacher也实现了IH接口。
        //这就是所谓的：接口多态传递现象
        IH ih = new Teacher();
    }
}
interface IH {
    void hi();
}
interface IG extends IH{}

class Teacher implements IG {

    @Override
    public void hi() {
        System.out.println("Teacher hi()");
    }
}