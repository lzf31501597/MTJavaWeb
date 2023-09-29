package com.javaTest.commonclass.string_;


public class StringExercise06 {
    /*
    * 1.String是一个finallei，代表不可变的字符序列
    * 2.字符串是不可变的。一个字符串对象一旦被分解，其内容是不可变的。
    * */
    public static void main(String[] args) {
        //创建了两个对象
        String s1 = "hello"; //创建s1对象指向常量池“”hello
        s1 = "haha";//先找是不是有haha，有就直接指向haha；没有就直接创建haha，再指向haha
        System.out.println(s1);  //F
    }
}


