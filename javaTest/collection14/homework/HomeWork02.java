package com.javaTest.collection14.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeWork02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        Car car1 = new Car("本田", 1500000);
        Car car2 = new Car("丰田", 1800000);
        Car car3 = new Car("比亚迪", 2000000);
        Car car4 = new Car("奥迪", 2500000);
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        arrayList.add(car4);
        System.out.println(arrayList);


        //1.add
        Car car5 = new Car("保时捷", 3500000);
        arrayList.add(car5);
        System.out.println("1.add=" + arrayList);

        //2.remove
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (((Car) arrayList.get(i)).getName() == "比亚迪") {
//                arrayList.remove(arrayList.get(i));
//            }
//        }
        arrayList.remove(car2);
        System.out.println("2.remove=" + arrayList);

        //3.contains***********
        boolean b = arrayList.contains(car4);
        System.out.println("3.contains=" + b);


        //4.size
        System.out.println("4.size=" + arrayList.size());

        //5.isEmpty()
        System.out.println("5.isEmpty()=" + arrayList.isEmpty());

        //6.clear
        arrayList.clear();
        System.out.println("6.clear()=" + arrayList);

        //7.addAll
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(new Car("本田1", 1500000));
        arrayList1.add(new Car("丰田1", 1800000));
        arrayList1.add(new Car("比亚迪1", 2000000));
        arrayList1.add(new Car("奥迪1", 2500000));
        boolean b1 = arrayList.addAll(arrayList1);
        System.out.println("7.addAll=" + b1);

        //8.containsAll
        System.out.println("8.containsAll=" + arrayList.containsAll(arrayList1));

        //9.removeAll
        System.out.println("9.removeAll=" + arrayList.removeAll(arrayList1));

        //10.for增强ss
        for (Object cars: arrayList1) {
            Car car11 = (Car) cars;
            System.out.println("10.for增强=" + car1);
        }

    }
}
class Car{
    private String name;
    private int price;



    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
