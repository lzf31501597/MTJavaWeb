package com.javaTest.exception_;

import com.javaTest.polymorphic_.ObjectPoly.Cat;

import java.util.Date;

public class Exercise01{
    public static void main(String[] args) {
        String friends[]={"tom", "jack", "milan"};
        //for (int i = 0; i < 4; i++) {//ArrayIndexOutOfBoundsException
        for (int i = 0; i < 3; i++) {
            System.out.println(friends[i]);
        }

        Cat cat = new Cat();
        cat = null;//NullPointerException
        System.out.println(cat);

       /* int y;
        AAA a = new AAA();
        y = 3/a.x; //ArithmeticException
        System.out.println("program ends ok!");*/

        Object obj = new Date();
        Person person;
        person = (Person) obj;//ClassCastException
        System.out.println(person);

    }
}
class AAA{
    int x;
}

class Person{

}