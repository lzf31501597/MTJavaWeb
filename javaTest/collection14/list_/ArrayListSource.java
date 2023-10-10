package com.javaTest.collection14.list_;

import java.util.ArrayList;

public class ArrayListSource {
    @SuppressWarnings("all")
    /*1--无参扩容机制
    * 1.ArrayList 中维护了一个Object类型的数组 elementData
    *   transient Object[] elementData
    * 2.当创建ArrayList对象时，如果使用的是无参构造器，则初始 elementData容量为0；
    *   第一次添加元素，则扩容elementData为10；
    *   如需要再次扩容，则扩容elementData为1.5倍。
    * 3.如果使用指定大小的构造器，则初始elementData容量为指定大小；
    *   如果需要扩容，则直接扩容elementData的1.5倍。
    *
    * 2--有参扩容机制
    * 第一次添加元素，则扩容elementData为1.5倍。
    * */
    public static void main(String[] args) {
        //ArrayList arrayList = new ArrayList();
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(null);

        for (Object  obj : arrayList) {
            System.out.println(obj);
        }
    }
}
