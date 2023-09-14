package com.javaTest.innerCass;

/**
 * 匿名内部类：
 * 1、本质是一个类；2、内部类；3、该类没有名字；4、同时还是一个对象
 * 说明：匿名内部类：是定义在外部类的局部位置，比如方法中，并且没有类名：
 *      1）、匿名内部类的基本语法
 *          new 类或借口（参数列表）{类体};
 *      2）、匿名内部类的语法比较奇特，请大家注意，因为匿名内部类既是一个类的定义，
 *          同时它本社也是一个对象，因此从语法上看，它既有定义类的特征；也有创建对象的特征；
 *          对前面代码分析可以看出这个特点，因此可以调用匿名内部类方法。
 *      3)、可以直接访问外部类的所有成员，包含私有的
 *      4）、不能添加访问修饰符，因为他的地位就是一个局部变量
 *      5）.作用域：仅仅在定义它的方法或代码块中
 *      6）、匿名内部类：直接访问外部类成员
 *      7）、外部其他类：不能访问匿名内部类（因为匿名内部类地位是一个局部变量）
 *      8）、如果外部类和匿名内部类的成员重名时，匿名内部类访问的话：默认遵循就近原则。
 *          如果想访问外部类的成员，则可以是使用（外部类名。this。成员）去访问。
 *
 *
 * */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println("main  Outer05.this.hashcode " + outer05);
    }
}

class Outer05 {
    private int n1 = 99;
    public void f1(){
        //创建一个基于类的匿名内部类
        //4.不能添加访问修饰符，因为他的地位就是一个局部变量
        //5.作用域：仅仅在定义它的方法或代码块中
        Person person = new Person(){
            @Override
            public void hi(){
                //3.可以直接访问外部类的所有成员，包含私有的
                System.out.println("匿名内部类重写了 hi()。。。。n1=" + n1);
                System.out.println("匿名内部类重写了 hi()。。。。外部类的n1=" + Outer05.this.n1);
                //Outer05.this 就是调用 f1的对象
                System.out.println("Outer05.this. hashcode " + Outer05.this);
            }
        };
        person.hi(); //动态绑定，运行类型是 Outer05$1

        //也可以直接调用,匿名内部类本身也是返回对象
        //class 匿名内部类 extends Person{}
        new Person(){
            @Override
            public void hi(){
                System.out.println("匿名内部类重写了 hi(),hhhhhh。。。。");
            }
            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");

    }
}
class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person ok(String str):" + str );
    }
}