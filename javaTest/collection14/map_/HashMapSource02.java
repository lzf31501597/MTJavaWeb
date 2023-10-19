package com.javaTest.collection14.map_;

import java.util.HashMap;

public class HashMapSource02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 12; i++) {
            hashMap.put(new A(i), "hello"+i);
        }

        System.out.println("hashMap=" + hashMap);
    }
}
class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num;
    }

    @Override
    public int hashCode() {
        //return Objects.hash(num);
        return 100;
    }
}