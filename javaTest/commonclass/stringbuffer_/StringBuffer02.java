package com.javaTest.commonclass.stringbuffer_;

public class StringBuffer02 {
    public static void main(String[] args) {

        //1.构造一个没有字符的字符串缓冲区，初始容量为16个字符 char[]。
        StringBuffer stringBuffer = new StringBuffer();

        //2.构造一个没有字符的字符串缓冲区和指定的初始容量。 char[]
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3.构造一个初始化为(指定字符串)内容的字符串缓冲区。。
        // char[]的大小就是str。length() +16
        StringBuffer hello = new StringBuffer("hello");

    }
}
