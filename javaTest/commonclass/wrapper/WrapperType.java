package com.javaTest.commonclass.wrapper;

public class WrapperType {
    /** int--->Integer 的装箱和拆箱
    * jdk5之后是自动装箱和拆箱
     *
    * */
    public static void main(String[] args) {
        //收到装箱
        int n1 = 100;
        Integer i = new Integer(n1);
        Integer i2 = Integer.valueOf(i);

        //手动拆箱
        int ii = i.intValue();

        //jdk5之后是自动装箱和拆箱
        //自动装箱 int ---》Integer
        int n2 = 200;
        Integer integer = n2; //底层使用的是Integer.valueOf(n2)
        //自动拆箱 Integer---》int
        int n3 = integer; //底层使用的方法仍然是intValue（）方法
    }
}
