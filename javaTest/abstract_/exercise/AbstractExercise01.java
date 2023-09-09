package com.javaTest.abstract_.exercise;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 1, 3000);
        jack.setBonnus(5000);
        jack.work();
        System.out.println(jack.toString());
        System.out.println("--------------------------");

        CommonEmployee tom = new CommonEmployee("tom", 2, 4000);
        tom.work();
        System.out.println(tom.toString());
    }
}
//抽象方法不能使用private，final，和static修饰，因为这些关键字都是和重写相违背的。
//abstract final class A{}  //error ,final不能继承
//abstract public static void test2(); //error ,static关键字和方法重写无关
//abstract private void test3(); //error ,private关键字和不能重写

