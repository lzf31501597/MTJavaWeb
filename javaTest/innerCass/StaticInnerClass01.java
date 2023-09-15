package com.javaTest.innerCass;

/**
* 静态内部类：静态内部类是定义在外部类的成员位置，并且有static修饰符
 * 1、可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员。
 * 2、可以添加任意访问修饰符（public，protected，默认，private），因为它的地位就是一个成员。
 * 3、作用域：同其他成员，为整个类体
 * 4、静态内部类----直接访问----外部类（所有静态成员）
 * 5、外部类---创建对象，再访问----静态内部类
 * 6、外部其他类---访问---静态内部类
 * 7、如果静态内部类的成员和外部类的成员重名，静态内部类访问外部类成员时，会遵守就近原则。
 *  *  如果想访问外部类成员时，可以通过：外部类名。成员 ，来访问外部类的成员。
* */
/*
* 静态内部类的小结：
* 1、内部类有四种：局部内部类、匿名内部类、成员内部类、静态内部类
* 2、重点还是掌握匿名内部类的使用语法：
*     new 类/接口（参数列表）{
*       //....
*       };
* 3、成员内部类，静态内部类：是放在外部类的成员位置，本质就是一个成员。
* 4.其他细节就看笔记
* */
public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer012 outer012 = new Outer012();
        outer012.show();

        //6、外部其他类---通过类名直接访问---静态内部类（前提要满足访问权限）
        //方式一
        Outer012.Inner012 inner012 = new Outer012.Inner012();
        System.out.println("new Outer012.Inner012().....方式一。。。。。。。。。");
        inner012.say();
        //方式二
        Outer012.Inner012 inner013 = Outer012.getInner012();
        System.out.println("Outer012.getInner012().....方式二。。。。。。。");
        inner013.say();
    }
}
class Outer012 {//外部类
    private int n1 = 100;
    private static String name = "zhangsan";
    private static void cry() {
        System.out.println("Outer012 static cry()");
    }
    //静态内部类是定义在外部类的成员位置，并且有static修饰符
    //1、可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员。
    //2、可以添加任意访问修饰符（public，protected，默认，private），因为它的地位就是一个成员。
    //3、作用域：同其他成员，为整个类体
    //private
    static class Inner012 {//静态内部类
        private int n1 = 800;
        private static String name = "王五";
        public void say() {
            //4、静态内部类----直接访问----外部类（所有静态成员）
            System.out.println("Inner012.name="+name + " , Outer012.name=" + Outer012.name);
            cry();
            //不能直接访问外部类的非静态成员
            //System.out.println(n1);
            Outer012 outer012 = new Outer012();
            System.out.println("Inner012.n1=" + n1 + " ,outer012.n1="+outer012.n1);
        }
    }

    public static Inner012 getInner012(){
        return new Inner012();
    }
    public void show() {//调用成员内部类
        //5、外部类---创建对象，再访问----静态内部类
        Inner012 inner012 = new Inner012();
        inner012.say();
    }
}