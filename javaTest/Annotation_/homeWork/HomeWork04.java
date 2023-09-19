package com.javaTest.Annotation_.homeWork;

public class HomeWork04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double x, double y) {
                return x + y;
            }
        }, 8, 10);///18.0
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double x, double y) {
                return x * y;
            }
        },8 ,9);
    }
}
interface ICalculate{
    public double work(double x, double y);
}
class Cellphone {
    public void testWork(ICalculate ic, double x, double y){
        double result = ic.work(x, y);
        System.out.println("计算的结果=" + result);
    }

}