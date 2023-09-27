package com.javaTest.commonclass.wrapper;

public class WrapperExercise01 {
    public static void main(String[] args) {

        Double d = 100d;//ok,自动装箱Double。valueOf（100d）
        Float f = 1.5f;//ok,自动装箱Floalt。valueOf（1。5d）

        Object obj1 = true ? new Integer(1) : new Double(2.0);//三元运算符
        System.out.println(obj1);//1.0

        Object obj2;
        if (true) {
            obj2 = new Integer(1);
        }else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);//1
    }
}
