package com.javaTest.innerCass;


/**
* 匿名内部类：
 * 1、本质是一个类；2、内部类；3、该类没有名字；4、同时还是一个对象
 * 说明：匿名内部类：是定义在外部类的局部位置，比如方法中，并且没有类名：
 *      1）、匿名内部类的基本语法
 *          new 类或借口（参数列表）{类体};
* */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 100;//属性
    public void method(){//方法
        //基于接口的匿名内部类
        //1.需求：想使用A01接口，并创建对象
        //2.传统方式：是写一个类。实现接口，并创建对象
        //3.Tiger/Dog类（只使用一次，后面不再使用）
        //4.可以使用匿名内部类（来简化开发）
        //5.tiger的编译类型：A01
        //6.tiger的运行类型：就是匿名内部类 Outer04$1
        /*底层分配的类名：Outer04$1
        * class  Outer04$1 implements A01{
        *   @Override
            public void cry() {
                System.out.println("老虎吼叫。。。。。。。");
            }
        };
        * */
        //7.jdk底层在创建匿名内部类Outer04$1，立即马上就创建了Outer04$1实例，并且把地址返回给了tiger
        //8.匿名类只是用一次，就不能再使用
        A01 tiger = new A01() {
            @Override
            public void cry() {
                System.out.println("老虎吼叫。。。。。。。");
            }
        };
        System.out.println("tiger的运行类型:" + tiger.getClass());//Outer04$1
        tiger.cry();
        tiger.cry();
        tiger.cry();

//        A01 tiger = new Tiger();
//        tiger.cry();
//        A01 dog = new Dog();
//        dog.cry();
        //1.simith的编译类型：Father01
        //2.simith的运行类型：就是匿名内部类 Outer04$2
        //3.底层会创建匿名内部类
        /*
        * class Outer04$2 extends Father01 {
        *   @Override
            public void test(){
                System.out.println("匿名内部类重写了  Father01 test()................");
            }}
        *
        * */
        //4.同时也直接返回了，匿名内部类的的对象Outer04$2
        //5.注意Father01("simith") 参数列表会传递给构造器。
        Father01 simith = new Father01("simith") {
            @Override
            public void test(){
                System.out.println("匿名内部类重写了  Father01 test()................");
            }
        };
        simith.test();
        System.out.println("simith的运行类型:" + simith.getClass());//Outer04$2


        //给予抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头。。。。。。");
            }
        };
        animal.eat();


//        new A01(){
//            @Override
//            public void cry(){
//
//            }
//        };
//        new Father01("zs"){
//
//        };
    }
}
interface A01{
    public void cry();

}
//class Tiger implements A01{
//
//    @Override
//    public void cry() {
//        System.out.println("Tiger  cry()  老虎吼叫。。。。。。。");
//    }
//}
//class Dog implements A01{
//
//    @Override
//    public void cry() {
//        System.out.println("Dog  cry()  小狗汪汪叫。。。。。。。");
//    }
//}
class Father01{
    public Father01(String name) {
        super();
        System.out.println("Father01 Father01(String name):" + name);
    }
    public void test(){
        //System.out.println("Father01 test()");
    }
}

abstract class Animal { //抽象类
    abstract void eat();
}