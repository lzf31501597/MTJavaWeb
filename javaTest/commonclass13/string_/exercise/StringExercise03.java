package com.javaTest.commonclass13.string_.exercise;

public class StringExercise03 {
    /*
    * 当调用intern方法时，如果池已经包含一个等于此String对象的字符串（a.equals(b)方法确定），
    * 则返回池中的字符串。否则，将此String对象添加到池中，并返回此String对象的引用。
    * b.intern()方法最终返回的是常量池的地址（对象）**************
    * */
    public static void main(String[] args) {
        String a = "hsp"; //a 指向常量池的“hsp”
        String b = new String("hsp"); //b 指向堆中的数组对象
        System.out.println(a.equals(b)); //T 两个对象的值相等
        System.out.println(a == b);  //F 两个对象指向地址是否相等
        System.out.println(a == b.intern()); //T
        System.out.println(b == b.intern()); //F

    }
}
