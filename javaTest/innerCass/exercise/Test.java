package com.javaTest.innerCass.exercise;

public class Test {//外部类
    public static void main(String[] args) {
        Test test = new Test();
        Inner inner = test.new Inner();
        System.out.println(inner.a);//5

    }

    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);//5
    }
    class Inner {//成员内部类
        public int a = 5;
    }
}
