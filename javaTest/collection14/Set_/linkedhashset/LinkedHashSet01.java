package com.javaTest.collection14.Set_.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

@SuppressWarnings("all")
public class LinkedHashSet01 {

    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new String("AA"));
        linkedHashSet.add(456);
        linkedHashSet.add(456);
        linkedHashSet.add(new Customer("刘", 1001));
        linkedHashSet.add(123);
        linkedHashSet.add("hsp");

        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }
        System.out.println(linkedHashSet);
    }
}

class Customer{
    private String name;
    private int houseNum;

    public Customer(String name, int houseNum) {
        this.name = name;
        this.houseNum = houseNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", houseNum=" + houseNum +
                '}';
    }
}
