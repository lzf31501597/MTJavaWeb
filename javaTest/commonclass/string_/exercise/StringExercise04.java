package com.javaTest.commonclass.string_.exercise;

public class StringExercise04 {
    /*
    * 当调用intern方法时，如果池已经包含一个等于此String对象的字符串（a.equals(b)方法确定），
    * 则返回池中的字符串。否则，将此String对象添加到池中，并返回此String对象的引用。
    * b.intern()方法最终返回的是常量池的地址（对象）**************
    * */
    public static void main(String[] args) {
        String s1 = "hspedu"; //s1 指向常量池的“hspedu ”
        String s2 = "java"; //s2 指向常量池的“java”
        String s3 = new String("java"); //s3 指向堆中的value数组的地址值
        String s4 = "java"; //s4 指向常量池的“java”

        System.out.println(s2 == s3); //F
        System.out.println(s2 == s4); //T
        System.out.println(s2.equals(s3)); //T
        System.out.println(s1 == s2); //F
    }
}
