package com.javaTest.smallChangeSys.homeWork.homeWork11;

public class Person {
    public void run(){
        System.out.println("person run()");
    }
    public void eat(){
        System.out.println("person eat()");
    }
}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("student run()");
    }

//    @Override
//    public void eat() {
//        System.out.println("student eat()");
//    }

    public void study(){
        System.out.println("student study()");
    }
}
