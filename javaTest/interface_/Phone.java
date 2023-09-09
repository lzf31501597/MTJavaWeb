package com.javaTest.interface_;

public class Phone implements UsbInterface {
    @Override
    public void start() {
        System.out.println("我是手机，开始工作了。。。。。。");
    }

    @Override
    public void stop() {
        System.out.println("我是手机，停止工作了。。。。。。");
    }
}
//class Computer {
//    public void working(Usb usb){
//        use.start();
//        use.stop();
//    }
//}