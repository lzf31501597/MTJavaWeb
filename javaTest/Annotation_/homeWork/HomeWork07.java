package com.javaTest.Annotation_.homeWork;

public class HomeWork07 {
    public static void main(String[] args) {
        new Car01(-1).getAir();
        new Car01(30).getAir();
        new Car01(45).getAir();
    }
}
class Car01{
    private double temperature;

    public Car01(double temperature) {
        this.temperature = temperature;
    }

    class Air{

        public void flow(){
            if (temperature > 40) {
                System.out.println("temperature > 40, 吹冷气。。。。。");
            } else if (temperature < 0) {
                System.out.println("temperature < 0, 吹暖气。。。。。。。");
            }else {
                System.out.println("0<= temperature <= 40, 关掉空调。。。。。。");
            }
        }
    };
    public void getAir(){
        Air air = new Air();
        air.flow();
    }
}