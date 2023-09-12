package com.javaTest.interface_.interface03;

public class Oracle implements DBInterface{
    @Override
    public void connect() {
        System.out.println("Oracle 已连接。。。。。。。。");
    }

    @Override
    public void close() {
        System.out.println("Oracle 已关闭连接。。。。。。。。");
    }
}
