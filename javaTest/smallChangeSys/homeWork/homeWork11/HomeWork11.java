package com.javaTest.smallChangeSys.homeWork.homeWork11;

public class HomeWork11 {
    public static void main(String[] args) {
        //向上转型 父类的引用指向子类对象
        Person person = new Student();
        System.out.println("Person================");
        person.eat();
        person.run();

        //向下转型：把指向子类的对象的父类引用，转成指向子类对象的子类引用
        Student student = (Student)person;
        System.out.println("Student==================");
        student.eat();
        student.run();
        student.study();
//        Person================
//        person eat()
//        student run()
//        Student==================
//        person eat()
//        student run()
//        student study()
    }
}
