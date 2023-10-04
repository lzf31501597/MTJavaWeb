package com.javaTest.commonclass13.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类（Integer）--》String
        Integer i = 100;//自动装箱
        //方式1
        String str1 = i + "";
        System.out.println("str1="+str1);
        //方式2
        String str2 = i.toString();
        System.out.println("str2="+str2);
        //方式3
        String str3 = String.valueOf(i);
        System.out.println("str3="+str3);

        //String --> 包装类（Integer）
        String str4 = "11111";
        Integer i2 = Integer.parseInt(str4);//自动封箱
        System.out.println("i2="+i2);
        Integer i3 = new Integer(str4);//构造器
        System.out.println("i3="+i3);
    }
}
