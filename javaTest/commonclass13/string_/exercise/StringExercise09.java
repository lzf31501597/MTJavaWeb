package com.javaTest.commonclass13.string_.exercise;

public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "hspedu"; //s1指向池中的"hspedu"
        String s2 = "java"; //s2指向池中的"java"
        String s5 = "hspedujava"; //s5指向池中的"hspedujava"
        String s6 = (s1 + s2).intern(); //s6指向池中的"hspedujava"
        System.out.println(s5 == s6); //T
        System.out.println(s5.equals(s6)); //T
    }
}
