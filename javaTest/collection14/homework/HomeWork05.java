package com.javaTest.collection14.homework;

import java.util.TreeSet;

public class HomeWork05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());
        treeSet.add(new Person());
        treeSet.add(new Person());
        treeSet.add(new Person());
        System.out.println(treeSet);
    }
}
class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}