package com.javaTest.abstract_;

public class Abstract01 {

}
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    //当父类的某些方法，需要声明，但是又不确定如何实现时，可以将其声明为抽象方法，那么这个类就是抽象类。
    /**
    * //思考:这里 eat 这里你实现了，其实没有什么意义
     * //即: 父类方法不确定性的问题
    //===> 考虑将该方法设计为抽象(abstract)方法
     //===> 所谓抽象方法就是没有实现的方法
    //===> 所谓没有实现就是指，没有方法体
    //===> 当一个类中存在抽象方法时，需要将该类声明为 abstract 类
     //===> 一般来说，抽象类会被继承，有其子类来实现抽象方法.
    * */
//    public void eat(){
//        System.out.println("这是一个动物的吃东西的行为，目前不知道吃什么");
//    }
    public abstract void eat();
}