package com.javaTest.commonclass.string_;

public class StringUML {
    public static void main(String[] args) {
        String str = new String("");
        for (int i = 0; i < 80000; i++) {
            str += "hello";
            System.out.println("str=" + str);
        }

        System.out.println("str=" + str);
    }
}
