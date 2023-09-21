package com.javaTest.exception_;

public class NumberFormatException_ {
    public static void main(String[] args) {
//        String name = "1234";
//        int num = Integer.parseInt(name);//没错
//        System.out.println(name);

        String name1 = "韩顺平教育";
        int num1 = Integer.parseInt(name1);//报错NumberFormatException
        System.out.println(name1);
    }
}
