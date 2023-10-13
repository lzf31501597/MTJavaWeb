package com.javaTest.collection14.Set_.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSetExercise {
    private static LinkedHashSet linkedHashSet;

    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓", 1000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//OK
        linkedHashSet.add(new Car("法拉利", 10000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了
        linkedHashSet.add(new Car("保时捷", 70000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了
        System.out.println("linkedHashSet=" + linkedHashSet);
    }
}

/**
 * Car 类(属性:name,price)， 如果 name 和 price 一样， * 则认为是相同元素，就不能添加。 5min
 */
class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}