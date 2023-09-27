package com.javaTest.exception_.customexception.exercise;

public class Homework03 {
    public static void main(String[] args) {
        try {
            func();
            System.out.println("AA");
        } catch (Exception e) {
            System.out.println("CC");
        }
        System.out.println("DD");
    }
    public static void func(){
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("BB");
        }
    }
}
