package com.javaTest.reflection23.classload;

/**
 * @author
 * @version 1.0
 * @date 2023/11/10 15:26
 * @Description
 */
public class ClassLoad03 {
    public static void main(String[] args) {
        /*
        * 1.加载B类，并生成 B的class对象
        * 2.链接 num = 0；
        * 3.初始化阶段
        *   依次自动手机类的所有静态变量的赋值动作和静态代码块中的语句
        * clinit（）{
        *   System.out.println("B 静态代码块被执行");
            num = 300;
            num = 100;
         * }
         *  合并： num = 100;
         *
         * 4.B() 构造器被执行
        * */

        //B b = new B();//B 静态代码块被执行 ,B() 构造器被执行, 100
        //如果直接使用类的静态属性，也会导致累的加载
        //System.out.println(B.num);// B 静态代码块被执行 ,100

        //类加载的时候，是有同步机制控制*********
        /* protected Class<?> loadClass(String name, boolean resolve)
        throws ClassNotFoundException
        {
            //正是这个同步机制，才能保证某个类在内存中，只有一份class对象*******
            synchronized (getClassLoadingLock(name)) {
        */
        B b = new B();
    }
}
class B{
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }
    static int num = 100;

    public B() {
        System.out.println("B() 构造器被执行");
    }
}