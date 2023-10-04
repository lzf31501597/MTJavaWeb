package com.javaTest.commonclass13.wrapper;

public class WrapperExercise03 {
    public static void main(String[] args) {
        Integer n1 = new Integer(127);
        Integer n2 = new Integer(127);
        System.out.println(n1 == n2);//F

        Integer n3 = new Integer(128);
        Integer n4 = new Integer(128);
        System.out.println(n3 == n4);//F

        Integer n6 = 127;
        Integer n5 = 127;//Integer.valueOf(127)
        System.out.println(n5 == n6);//T

        Integer n7 = 128;
        Integer n8 = 128;
        System.out.println(n7 == n8);//F

        Integer n9 = 128;
        Integer n10 = new Integer(127);
        System.out.println(n9 == n10);//F

        Integer n11 = 127;
        int n12 = 127;
        //只要有基本数据类型，判断的是值是否相等
        System.out.println(n11 == n12);//T

        Integer n13 = 128;
        int n14 = 128;
        System.out.println(n13 == n14);//T
    }
}
