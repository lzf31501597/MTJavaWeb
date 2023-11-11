package com.javaTest.reflection23;

/**
 * @author
 * @version 1.0
 * @date 2023/11/10 13:46
 * @Description
 */
public class Car {
    public String brand = "保时捷";
    public int price = 5000000;
    public String color = "白色";

    public Car() {
    }

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
