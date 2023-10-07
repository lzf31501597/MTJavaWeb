package com.javaTest.collection14.list_;

import java.util.ArrayList;

public class ArrayListDetail {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //ArrayList 是线程不安全的，源码没有 synchronized
        /*public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }*/
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        System.out.println(arrayList);


    }
}
