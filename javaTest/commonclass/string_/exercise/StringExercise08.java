package com.javaTest.commonclass.string_.exercise;


public class StringExercise08 {
    /*
    * 1.String是一个finallei，代表不可变的字符序列
    * 2.字符串是不可变的。一个字符串对象一旦被分解，其内容是不可变的。
    * */
    public static void main(String[] args) {
        //创建了两个对象
        String a = "hello";//创建了a对象
        String b = "abc";//创建了b对象

        //1.先创建一个 StringBuilder sb = new StringBuilder（）；
        //2.执行 sb.append("hello");
        //3.再执行 sb.append("abc");
        //4.String c = sb.toString();
        //5.最后其实是 c 指向堆中的对象（String）value【】-》 池中的“helloabc”
        String c = a + b;//创建了几个对象？？？  创建了一个对象，指向堆中的value【】
        String d = "helloabc";

        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}


