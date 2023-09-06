package com.javaTest.static_.exercise;

public class StaticExercise03 {
    //1、静态方法，只能访问静态成员。2、非静态方法，可以访问所有成员。
    // 3、在编写代码的时候，必须遵守权限访问原则。
    //


    public static void main(String[] args) {
        Person1.setTotalPerson(3);
        new Person1();//4
        Person1.printTotal();

    }
}
class  Person1{
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
        //this.total = total;  //error 静态方法里面不能使用this和super关键字
        Person1.total = total;
    }
    public static void printTotal(){
        System.out.println("total=" + total);
    }
    public Person1() {
        total++; //1
        id = total; //1

    }
}
