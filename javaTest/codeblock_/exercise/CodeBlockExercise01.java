package com.javaTest.codeblock_.exercise;

public class CodeBlockExercise01 {

}

class Person {
    public static int total;//
    static {
        total = 100;
        System.out.println("in static block!");
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("total1 = " + Person.total);
        System.out.println("total2 = " + Person.total);
//        in static block!
//        total1 = 100
//        total2 = 100
    }
}