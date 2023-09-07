package com.javaTest.codeblock_.exercise;

public class CodeBlockExercise02 {
}
class Sample{
    public Sample(String s) {
        System.out.println(s);//2 //5
    }

    public Sample() {
        System.out.println("Sample() 默认构造函数呗调用");
    }
}
class TestSample{
    Sample sample1 = new Sample("sample1 成员初始化");//4
    static Sample sample = new Sample("静态成员 sample初始化");//1
    static{
        System.out.println("static 代码块被执行");//3
        if (sample == null) {
            System.out.println("sample is null");
        }
    }

    public TestSample() {
        System.out.println("TestSample() 默认构造函数呗调用");//6
    }

    public static void main(String[] args) {
        TestSample testSample = new TestSample();//无参构造器
//        静态成员 sample初始化
//        static 代码块被执行
//        sample1 成员初始化
//        TestSample() 默认构造函数呗调用
    }

}