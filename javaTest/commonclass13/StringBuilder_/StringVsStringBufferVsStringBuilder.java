package com.javaTest.commonclass13.StringBuilder_;

public class StringVsStringBufferVsStringBuilder {
    /**
    *   StringBuffer 的执行时间:71
        StringBuilder 的执行时间:365
        String 的执行时间:16502
     1.如果字符串存在大量的修改操作，一般使用 StringBuilder 和 StringBuffer
     2.如果字符串存在大量的修改操作，并在单线程的情况下，使用 StringBuilder
     3.如果字符串存在大量的修改操作，并在多线程的情况下，使用 StringBuffer
     4.如果字符串存在少量的修改操作，被多个对象引用，使用 String，比如配置信息等
    *
    * */
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;

        StringBuffer buffer = new StringBuffer("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuffer 拼接 20000 次
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 的执行时间:" + (endTime - startTime));

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuilder 拼接 20000 次
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 的执行时间:" + (endTime - startTime));

        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//String 拼接 20000
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 的执行时间:" + (endTime - startTime));
    }
}
