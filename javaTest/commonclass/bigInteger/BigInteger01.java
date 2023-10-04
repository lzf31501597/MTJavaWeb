package com.javaTest.commonclass.bigInteger;

import java.math.BigInteger;

public class BigInteger01 {
    public static void main(String[] args) {
//        long l = 232432432443536457687697898098090;
//        System.out.println("l=" + l);
        BigInteger bigInteger = new BigInteger("232432432443536457687697898098090");
        BigInteger bigInteger2 = new BigInteger("23243243244353645768769789809809899999999999990");
        System.out.println("bigInteger=" + bigInteger);

        //1. 在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行 + - * /
        //2. 可以创建一个 要操作的 BigInteger 然后进行相应操作
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println("add=" + add);//+

        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println("subtract=" + subtract);//-

        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println("multiply=" + multiply);//*

        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println("divide=" + divide);// /



    }
}
