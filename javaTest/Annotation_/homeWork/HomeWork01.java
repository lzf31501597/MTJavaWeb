package com.javaTest.Annotation_.homeWork;

public class HomeWork01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(100);
        System.out.println("car:" + car); //9 red
        System.out.println("car1:" + car1); //100 white
       /* car:9.0	red
        car1:100.0	red*/
    }
}
class Car{
    double price = 10;
    static String color = "white";//静态属性只加载了一次，第一次被前面对象改成了red，后面电泳这个参数就是red

    @Override
    public String toString() {
        return price + "\t" + color;
    }

    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }
}