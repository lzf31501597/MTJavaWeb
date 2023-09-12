package com.javaTest.interface_.interface03;

public class DB2 implements DBInterface{
    @Override
    public void connect() {
        System.out.println("DB2 已连接。。。。。。。。");
    }

    @Override
    public void close() {
        System.out.println("DB2 已关闭连接。。。。。。。。");
    }
}
