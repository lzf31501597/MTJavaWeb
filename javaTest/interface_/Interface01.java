package com.javaTest.interface_;

public class Interface01 {
    public static void main(String[] args) {
        //创建手机和相机对象
        Canera canera = new Canera();
        Phone phone = new Phone();
        //创建电脑对象e
        Computer computer = new Computer();
        computer.working(phone);

        computer.working(canera);

    }
}
