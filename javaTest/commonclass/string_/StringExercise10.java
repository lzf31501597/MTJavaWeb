package com.javaTest.commonclass.string_;

public class StringExercise10 {
    public static void main(String[] args) {
        StringExercise10 se = new StringExercise10();
        se.change(se.str, se.ch);
        System.out.println(se.str + "and"); //hspand
        System.out.println(se.ch); //hava
    }

    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};
    public void change(String str, char ch[]){
        str = "java";
        ch[0] = 'h';
    }
}
