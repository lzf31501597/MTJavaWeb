package com.javaTest.collection14.list_;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /*
        添加 10 个以上的元素(比如 String "hello" )，在 2 号位插入一个元素"韩顺平教育"，
        获得第 5 个元素，删除第 6 个元素，修改第 7 个元素，在使用迭代器遍历集合，
       要求:使用 List 的实现类 ArrayList 完成。 */

        ArrayList list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i); }
        System.out.println("list=" + list);

        //在 2 号位插入一个元素"韩顺平教育"，
        list.add(2,"韩顺平教育");
        System.out.println(list);

        //获得第 5 个元素，
        System.out.println(list.get(4));

        //删除第 6 个元素，
        System.out.println(list.get(5));
        list.remove(5);
        System.out.println(list);

        //修改第 7 个元素，
        list.set(6, "66666");
        System.out.println(list);

        //在使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
