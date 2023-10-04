package com.javaTest.commonclass13.exercise;

public class HomeWork03 {
    public static void main(String[] args) {
        //输出“Ping,Han.S”
        namePrint("Han Shu Ping");
        namePrint("Willian Jefferson Clinton");
    }

    public static void namePrint(String str){
        if (str == null) {
            System.out.println("输的的Str不能为空。。。。。。");
            return;
        }

        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("你输入的字符串格式不对。。。。。。");
            return;
        }

        String format = String.format("%s, %s.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
