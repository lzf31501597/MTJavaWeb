package com.javaTest.static_.exercise;

public class StaticExercise02 {


    public static void main(String[] args) {
        System.out.println("Number of total is " + Person.getTotalPerson());//0
        Person p1 = new Person();
        System.out.println("Number of total is " + Person.getTotalPerson());//1
        System.out.println("Number of total is " + p1.getTotalPerson());//1
    }
}
class  Person{
    private int id;
    private static int total = 0;
    public static int getTotalPerson(){
        //id++;  //error 成员属性必须是静态的，才能被静态方法调用
        return total;
    }

    public Person() {
        total++; //1
        id = total; //1
    }
}