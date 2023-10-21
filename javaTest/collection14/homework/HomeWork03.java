package com.javaTest.collection14.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork03 {
    public static void main(String[] args) {
//        Employee jack = new Employee("jack", 650);
//        Employee tom = new Employee("tom", 1200);
//        Employee smith = new Employee("smith", 2900);

        Map map = new HashMap();
        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 2900);
        System.out.println(map);

        map.put("jack",2600);
        System.out.println(map);

        Set set = map.keySet();
        for (Object emp:set) {
            map.put (emp, (Integer)map.get(emp) +100);
            System.out.println(emp + "-" + map.get(emp));
        }
        for (Object emp:set) {
            System.out.println("name=" + emp);
        }
        for (Object emp:set) {
            System.out.println(emp + "-" + map.get(emp));
        }

        Set set1 = map.entrySet();
        for (Object emp1:set1) {
            System.out.println(emp1);
        }

    }
}
class Employee {
    private String name;
    private int price;

    public Employee(String name, int price) {
        this.name = name;
        this.price = price;
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
