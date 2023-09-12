package com.javaTest.interface_.PolyParametor;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();

        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态绑定
            //需要将类型向下转型
            if (usbs[i] instanceof Phone) {//判断他的类型是Phone
                ((Phone) usbs[i]).call();
            }
        }
    }
}

interface Usb{
    void work();
}
class Phone implements Usb{
    public void call(){
        System.out.println("手机可以打电话了。。。。。。。。");
    }
    @Override
    public void work() {
        System.out.println("手机工作中。。。。。。。。");
    }
}
class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中。。。。。。。。");
    }
}