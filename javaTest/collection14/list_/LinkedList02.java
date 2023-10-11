package com.javaTest.collection14.list_;

import java.util.LinkedList;

public class LinkedList02 {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 2; i++) {
            linkedList.add(i);
        }
        linkedList.add(100);
        linkedList.add(200);

        for (Object o : linkedList) {
            System.out.println(o);
        }
        System.out.println("-----");

        linkedList.remove(0);
        //linkedList.remove(); //默认删除第一个元素值
        for (Object o : linkedList) {
            System.out.println(o);
        }
        System.out.println("-----");
        linkedList.set(0, "hspedu");

        for (Object o : linkedList) {
            System.out.println(o);
        }
        System.out.println("-----");

        Object object = linkedList.get(0);
        System.out.println("object="+ object);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

    }
}
