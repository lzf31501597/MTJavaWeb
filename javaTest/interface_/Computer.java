package com.javaTest.interface_;

public class Computer {
    //1、UsbInterface usbInterface 形参是接口类型UsbInterface
    //2、看到接收实现了usbInterface接口的类的对象实例
    public void working(UsbInterface usbInterface){
        //通过接口，来调用方法
        usbInterface.start();
        usbInterface.stop();
    }

}
