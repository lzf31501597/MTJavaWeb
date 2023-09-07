package com.javaTest.codeblock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        B04 b04 = new B04();
//        A04 getVal() 方法被调用。。。。。。。。
//        A04的 static 代码块2。。。。。。。
//        B04 getVal3() 方法被调用。。。。。。。。
//        B04的 static 代码块4。。。。。。。
//
//        A04 getVal2() 方法被调用。。。。。。。。//子类重写了
//        A04的 普通 代码块1。。。。。。。
//
//        A04() 的构造器
//
//        B04 getVal4() 方法被调用。。。。。。。。
//        B04的 普通 代码块3。。。。。。。
//        B04() 的构造器

        new C04();
//        200
//        C04 static m2()
//        100
//        200
//        C04 static m2()
//        C04 m1()
    }
}
//创建一个子类对象时（继承关系），静态代码块，静态属性初始化，普通代码块、普通属性初始化，构造方法的调用顺序：
//1、父类的静态代码块和静态属性（优先级一样，按定义的先后顺序执行）
//2、子类的静态代码块和静态属性（优先级一样，按定义的先后顺序执行）
//3、父类的普通代码块和普通属性（优先级一样，按定义的先后顺序执行）
//4、父类的构造方法
//5、子类的普通代码块和普通属性（优先级一样，按定义的先后顺序执行）
//6、子类的构造方法


//静态代码块只能直接调用静态成员（静态属性和静态方法），
//普通代码块可以调用任意成员
//总结：学习===比较麻烦  工作比较轻松
class C04 {
    private int n1 = 100;
    private static int n2 = 200;
    private void m1(){
        System.out.println("C04 m1()");
    }
    private static void m2(){
        System.out.println("C04 static m2()");
    }
    static {
        //静态代码块，只能调用静态成员属性
        //System.out.println(n1);//error
        System.out.println(n2);//ok
        //m1();//error
        m2();
    }
    {//普通代码块可以调用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m2();
        m1();
    }
}
class A04{
    private static int n1 = getVal();//1
    private int n2 = getVal2();//4
    {
        System.out.println("A04的 普通 代码块1。。。。。。。");//6
    }
    static{
        System.out.println("A04的 static 代码块2。。。。。。。");//3
    }

    public A04() {
        super();
        System.out.println("A04() 的构造器");//7
    }
    public static int getVal(){
        System.out.println("A04 getVal() 方法被调用。。。。。。。。");//2
        return 10;
    }
    public int getVal2(){
        System.out.println("A04 getVal2() 方法被调用。。。。。。。。");//5
        return 30;
    }
}
class B04 extends A04 {
    private static int n3 = getVal3();//1
    private int n4 = getVal4();//4
    {
        System.out.println("B04的 普通 代码块3。。。。。。。");//6
    }
    static{
        System.out.println("B04的 static 代码块4。。。。。。。");//3
    }

    public B04() {
        super();
        System.out.println("B04() 的构造器");//7
    }
    public static int getVal3(){
        System.out.println("B04 getVal3() 方法被调用。。。。。。。。");//2
        return 10;
    }
    public int getVal4(){
        System.out.println("B04 getVal4() 方法被调用。。。。。。。。");//5
        return 30;
    }
}