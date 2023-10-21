package com.javaTest.generic15.junit_;


import org.junit.jupiter.api.Test;

public class Junit_ {
    public static void main(String[] args) {
        //传统方式
        new Junit_().m1();
        new Junit_().m2();
    }

    @Test
    public void m1(){
        System.out.println("m1() 被调用。。。。。。");
    }

    @Test
    public void m2(){
        System.out.println("m2() 被调用。。。。。。");
    }

    @Test
    public void m3(){
        System.out.println("m3() 被调用。。。。。。");
    }
}
