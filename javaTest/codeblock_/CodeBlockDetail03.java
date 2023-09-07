package com.javaTest.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        B03 b03 = new B03();
//        A03 的普通代码快。。。。。。
//        A03() 构造器被调用。。。。。。。
//        B03 的普通代码快。。。。。。。
//        A03() 构造器被调用。。。。。。。
    }
}
//构造器的最前面：其实隐含了super()和调用普通代码，静态相关的代码，属性初始化再累加载时，就执行完毕。
//------》因此是优先于构造器和普通代码块的。
class A03{
    {
        System.out.println("A03 的普通代码快。。。。。。。");//0
    }
    public A03() {//构造器
        //隐藏执行要求：
        //1、super（）是默认隐藏的
        //2、调用本类普通代码快
        System.out.println("A03() 构造器被调用。。。。。。。");//1
    }
}

class B03  extends A03{
    {
        System.out.println("B03 的普通代码快。。。。。。。");//2
    }
    public B03() {//构造器
        //隐藏执行要求：
        //1、super（）是默认隐藏的
        //2、调用本类普通代码快
        super();
        System.out.println("A03() 构造器被调用。。。。。。。");//3
    }
}