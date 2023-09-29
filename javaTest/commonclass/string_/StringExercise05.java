package com.javaTest.commonclass.string_;


public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "hspedu";
        Person p2 = new Person();
        p2.name = "hspedu";

        System.out.println(p1.name.equals(p2.name));//T 内容相同
        System.out.println(p1.name == p2.name);//T
        System.out.println(p1.name == "hspedu");//T

        String a = new String("abc");//指向堆中的value数组的地址值
        String b = new String("abc");//指向堆中的value数组的地址值
        System.out.println(a.equals(b)); //T
        System.out.println(a == b);  //F
    }
}

class Person{
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}