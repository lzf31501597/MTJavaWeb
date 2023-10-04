package com.javaTest.commonclass13.exercise;

public class HomeWork05 {
    public static void main(String[] args) {
        String s1 = "hsprdu";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);//f  两个对象的value【】值不相等
        System.out.println(a.equals(b));//f 两个对象的value【】值不相等
        System.out.println(a.name == b.name);//t

        String s4 = new String("hsprdu");
        String s5 = "hsprdu";
        System.out.println(s4 == s5);//f s4指向堆里的value【】值，s5指向常量"hsprdu"
        System.out.println(s1 == s4);//f s4指向堆里的value【】值，s1指向常量"hsprdu"

        String t1 = "hello" + s1;
        String t2 = "hellohsprdu";
        System.out.println(t1.intern() == t2);//t t1.intern()指向常量池中的hellohsprdu，没有则创建。

    }
}
class Animal {
    String name ;
    public Animal(String name) {
        this.name = name;
    }
}