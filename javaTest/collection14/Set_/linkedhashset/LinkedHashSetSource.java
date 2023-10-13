package com.javaTest.collection14.Set_.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

@SuppressWarnings("all")
public class LinkedHashSetSource {
    /**
    * 1.LinkedHashSet 加入顺序和取出元素、数据顺序一样
     * 2.LinkedHashSet 底层维护的是一个LinkedHashMap（是HashMap的子类）
     * 3.LinkedHashSet 底层结构（数组table + 双向链表）
     * 4.添加第一次时，直接将 数组table扩容到16，存放的节点类型是 LinkedHashMap$Entry
     * 5.数组是 HashMap$Node[] 存放的元素、数据是 LinkedHashMap$Entry
     * //Entry 继承关系是在内部类完成
     * static class Entry<K,V> extends HashMap.Node<K,V> {
     *         Entry<K,V> before, after;
     *         Entry(int hash, K key, V value, Node<K,V> next) {
     *             super(hash, key, value, next);
     *         }
     * }
    * */

    public static void main(String[] args) {
        //LinkedHashMap
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
