package com.javaTest.interface_.interface03;

public class MySql implements DBInterface{
    @Override
    public void connect() {
        System.out.println("MySql 已连接。。。。。。。。");
    }

    @Override
    public void close() {
        System.out.println("MySql 已关闭连接。。。。。。。。");
    }
}
