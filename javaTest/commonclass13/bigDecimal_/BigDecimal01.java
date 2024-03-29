package com.javaTest.commonclass13.bigDecimal_;

import java.math.BigDecimal;

public class BigDecimal01 {
    public static void main(String[] args) {
        //当我们需要保存一个精度很高的数时，double 不够用
        //可以是 BigDecimal
        double d = 1999.11111111111999999999999977788d;
        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("1999.11111111111999999999999977788");
        BigDecimal bigDecimal2 = new BigDecimal("5");
        System.out.println("bigDecimal=" + bigDecimal);

        System.out.println("bigDecimal.add(bigDecimal2)="+bigDecimal.add(bigDecimal2));
        System.out.println("bigDecimal.subtract(bigDecimal2)="+bigDecimal.subtract(bigDecimal2));
        System.out.println("bigDecimal.multiply(bigDecimal2)="+bigDecimal.multiply(bigDecimal2));
        System.out.println("bigDecimal.divide(bigDecimal2)="+bigDecimal.divide(bigDecimal2));
        //System.out.println(bigDecimal.divide(bigDecimal2));
        // 可能抛出异常 ArithmeticException
        // 在调用 divide 方法时，指定精度即可. BigDecimal.ROUND_CEILING
        // 如果有无限循环小数，就会保留 分子 的精度
        System.out.println("bigDecimal.divide(bigDecimal2)="+bigDecimal.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
    }
}
