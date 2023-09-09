package com.javaTest.interface_;


//实现接口，就是实现接口定义的方法
public class Canera implements UsbInterface {
    @Override
    public void start() {
        System.out.println("我是相机，开始照相工作了。。。。。。");
    }

    @Override
    public void stop() {
        System.out.println("我是相机，停止照相工作了。。。。。。");
    }
}
