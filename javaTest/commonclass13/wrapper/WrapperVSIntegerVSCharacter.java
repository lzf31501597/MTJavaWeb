package com.javaTest.commonclass13.wrapper;

public class WrapperVSIntegerVSCharacter {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);//返回最大值
        System.out.println(Integer.MIN_VALUE);//返回最小值

        System.out.println(Character.isDigit('x'));//判断是不是数字
        System.out.println(Character.isLetter('x'));//判断是不是字母
        System.out.println(Character.isUpperCase('x'));//判断是不是大写
        System.out.println(Character.isLowerCase('x'));//判断是不是小写

        System.out.println(Character.isWhitespace('x'));//判断是不是空格
        System.out.println(Character.toUpperCase('x'));//转成小写
        System.out.println(Character.toLowerCase('x'));//转成大写

    }
}
