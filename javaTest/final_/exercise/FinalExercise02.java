package com.javaTest.final_.exercise;

public class FinalExercise02 {
    public static void main(String[] args) {
        Something something = new Something();
        something.addOne(5);
    }
}
class Something {
    public int addOne(final int x){//final修饰的形式变量x的值没有初始化
        //++x;//error,不能修改final x的值
        return x + 1;
    }
}