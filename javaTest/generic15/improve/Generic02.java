package com.javaTest.generic15.improve;

import java.util.ArrayList;

public class Generic02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //传统方法解决---泛型类型  E-->Interge,String,自定义Dog
        //1. 当我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是 Dog 类型 (细节后面说...)
        //2. 如果编译器发现添加的类型，不满足要求，就会报错
        //3. 在遍历的时候，可以直接取出 Dog 类型而不是 Object
        //4. public class ArrayList<E> {} E 称为泛型,那么 Dog->E
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 7));

        //假如程序员不小心，添加了Cat对象
        //arrayList.add(new Cat("小黑猫", 8));
        System.out.println("使用泛型------------");
        for (Dog dog: arrayList) {//遍历
           System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}