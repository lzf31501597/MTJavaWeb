package com.javaTest.exception_.customexception.exercise;

public class Homework02 {
    public static void main(String[] args) {
        //可能发生参数不够异常
        if(args[4].equals("john")){//NullPointerException
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }
        Object o = args[2];//String---Object向上转型
        Integer i = (Integer) o; //字符串不能强制转换成整形
    }
}
