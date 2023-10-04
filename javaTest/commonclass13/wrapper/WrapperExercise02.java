package com.javaTest.commonclass13.wrapper;

public class WrapperExercise02 {
    public static void main(String[] args) {
        method();
    }

    /** 1.IntegerCache.low(-128)  IntegerCache.high(127)就直接从数组返回
     * 2.如果不在-128~~127，就直接new Integer（i）
    * public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }*/
    public static void method(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println("i =" + i);
        System.out.println("j =" + j);
        System.out.println(i == j);//false

        Integer m = 1; //Integer.valueOf(1)
        Integer n = 1; //Integer.valueOf(1)
        System.out.println("m =" + m);
        System.out.println("n =" + n);
        System.out.println(m == n);//true

        Integer x = 128; //超过了范围，重新创建对象
        Integer y = 128;
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println(x == y);//false
    }
}
