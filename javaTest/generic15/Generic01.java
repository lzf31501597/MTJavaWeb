package com.javaTest.generic15;

import java.util.ArrayList;

public class Generic01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //传统方法
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 7));

        //假如程序员不小心，添加了Cat对象
        //arrayList.add(new Cat("小黑猫", 8));
        for (Object obj: arrayList) {//遍历
            Dog dog = (Dog) obj;
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