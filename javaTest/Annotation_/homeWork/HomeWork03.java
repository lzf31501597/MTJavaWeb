package com.javaTest.Annotation_.homeWork;

public class HomeWork03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}
abstract class Animal {
    public abstract void shout();
}
class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println("猫会喵喵叫。。。。。。");
    }
}
class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫。。。。。。");
    }
}