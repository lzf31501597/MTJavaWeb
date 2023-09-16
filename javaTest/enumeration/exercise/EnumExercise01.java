package com.javaTest.enumeration.exercise;

public class EnumExercise01 {
    public static void main(String[] args) {
        Gender02 boy = Gender02.BOY;//BOY
        Gender02 boy1 = Gender02.BOY;//BOY
        System.out.println(boy);//BOY  本质就是默认调用Gender02的父类Enum的toString（）方法
        System.out.println(boy == boy1);//true
    }
}

enum Gender {
    BOY,GIRL; //无参构造器创建
    private Gender(String name){}
    private Gender(){}//无参构造器是默认的
}
/*
* 1.上面的语法OK
* 2.有一个枚举类 gender
* 3.有两个枚举对象BOY，GIRL，使用的无参构造器创建
* 4.一旦写了带参的构造器，就必须写上午餐的构造器
* */

enum Gender02 {
    BOY,GIRL;
}