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
 * 7、如果成员内部类的成员和外部类的成员重名，会遵守就近原则。
 *       可以通过：外部类名。this。属性 ，来访问外部类的成员。
 * */
public class MemberInnerClass01 {
    public static void main(String[] args) {
        //其他外部类访问内部类的三种方式：
        // 方式1 先创建一个外部类对象outer011，通过outer011去调用内部类Inner011对象
        // outer02.new Inner011()；相当于把new Inner011()当作外部类Outer011的成员
        Outer011 outer011 = new Outer011();
        Outer011.Inner011 inner011 = outer011.new Inner011();
        inner011.say();
        //方式2
        Outer011.Inner011 inner012 = new Outer011().new Inner011();
        inner012.say();
        //方式3 在外部类中，编写一个方法，可以返回Inner011对象
        Outer011.Inner011 inner011Instance = new Outer011().getInner01Instance();
        inner011Instance.say();
    }
}

class Outer011 {
    private int n1 = 100;
    public String name = "zhangsan";
    public void hi() {
        //1、可以直接访问外部类的所有成员，包含私有的
        System.out.println("Outer01 hi()。。。。");
    }
    //成员内部类：是定在外部类的成员位置。并且没有static修饰符。

    class Inner011 {//成员内部类
        //public double sal = 99.8;
        private double sal = 99.8;
        private int n1 = 66;
        public void say() {
            //1、可以直接访问外部类的所有成员，包含私有的
            //7、如果成员内部类的成员和外部类的成员重名，会遵守就近原则。
            //      可以通过：外部类名。this。属性 ，来访问外部类的成员。
            System.out.println("Outer01的 n1=" + n1 + " ,Outer01的 name=" + name + " ,Outer011.this.n1=" + Outer011.this.n1);
            hi();
        }
    }
    //返回一个内部类Inner011
    public Inner011 getInner01Instance(){
        return new Inner011();
    }

    private void show() {//调用成员内部类
        //创建成员内部类的对象，然后使用相关的方法
        Inner011 inner011 = new Inner011();
        inner011.say();
        System.out.println(inner011.sal);
    }
}