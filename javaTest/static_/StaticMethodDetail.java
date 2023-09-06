package com.javaTest.static_;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();//Ok

        //非静态方法，普通方法,不能通过类名调用。
        // 必须先创建实例对象，通过实例对象再调用非静态方法
        //D.say(); //报错
        D d = new D();
        d.say();

    }
}

class D {
    private int n1 = 100;
    private static int n2 = 200;
    public static void hi(){//静态方法
        //System.out.println("this.n1" + this.n1);
        //类方法中：不允许使用和对象有关的关键字
        //例如：this和super：普通方法（成员方法）可以
        System.out.println("静态方法hi()");

    }
    public void say(){ //非静态方法，普通方法
        System.out.println("非静态方法，普通方法say()");
    }

    //类方法(静态方法)中：只能访问：静态变量或静态方法
    //口诀：静态方法只能访问静态成员******************
    //静态方法--只能访问静态的成员，非静态的方法；也可以访问静态成员和非静态成员（必须遵守访问权限）
    public static void  hello(){
        System.out.println("n2" + n2);
        System.out.println("D.n2" + D.n2);
        //System.out.println(this.n2); 不能使用
        hi();//ok
        //say(); //error
    }

    //普通成员方法，既可以访问非静态（普通）成员，也可以访问静态成员


    //小结：非静态方法--可以访问静态成员和非静态成员
    public void ok(){
        //非静态（普通）成员
        System.out.println("n1=" + n1);
        say();

        //静态成员
        System.out.println("n2=" + n2);
        hello();
    }


}