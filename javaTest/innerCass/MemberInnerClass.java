package com.javaTest.innerCass;
/**
 * 成员内部类：说明--成员内部类：是定在外部类的成员位置。并且没有static修饰符。
 * 1、可以直接访问外部类的所有成员，包含私有的
 * 2、可以添加任意访问修饰符（public，protected，默认，private），因为它的地位就是一个成员
 * 3、作用域和外部类的其他成员一样，为整个类体。
 *      比如前面案例，在外部类的成员方法中，创建成员内部类对象，再调用方法
 * 4、成员内部类---直接访问---外部类成员（比如属性）
 * 5、外部类----创建对象，再访问-----成员内部类
 * 6、外部其他类----访问----成员内部类
* */
public class MemberInnerClass {
    public static void main(String[] args) {
        //其他外部类访问内部类，方式1
        Outer01 outer01 = new Outer01();
        outer01.hi();
        outer01.f1();
    }
}

class Outer01 {
    private int n1 = 100;
    public String name = "zhangsan";
    public void hi() {
        //1、可以直接访问外部类的所有成员，包含私有的
        System.out.println("Outer01 hi()。。。。");
    }
    //成员内部类：是定在外部类的成员位置。并且没有static修饰符。
    public class Inner01 {//成员内部类
        //public double sal = 99.8;
        private double sal = 99.8;
        public void say() {
            //1、可以直接访问外部类的所有成员，包含私有的
            System.out.println("Outer01的 n1=" + n1 + " ,Outer01的 name=" + name);
        }
    }
    public void f1() {//调用成员内部类
        //创建成员内部类的对象，然后使用相关的方法
        Inner01 inner01 = new Inner01();
        inner01.say();
        System.out.println(inner01.sal);
    }
}