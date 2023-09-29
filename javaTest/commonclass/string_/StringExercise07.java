package com.javaTest.commonclass.string_;


public class StringExercise07 {
    /*
    * 1.String是一个finallei，代表不可变的字符序列
    * 2.字符串是不可变的。一个字符串对象一旦被分解，其内容是不可变的。
    * */
    public static void main(String[] args) {
        //创建了1个对象
        String s1 = "hello"+"abc";
        //1.编译器会优化,判断创建的常量池对象，是否有引用指向
        // String s1 = "hello"+"abc"; 等价于 String s1 = "helloabc";
    }
}


