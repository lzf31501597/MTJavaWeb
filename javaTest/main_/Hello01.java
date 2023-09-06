package com.javaTest.main_;

public class Hello01 {
    public static void main(String[] args) {
        //args是如何接收传入的参数--相当于在命令运行脚本的时候，运行脚本后的参数。（sh hello。sh  $1 $2 $3...）
        //遍历显示
        for (int i = 0; i < args.length; i++) {
            System.out.println("第"+i+"个参数" + args[i]);
        }
    }
}
