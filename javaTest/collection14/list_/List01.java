package com.javaTest.collection14.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //1. List 集合类中元素有序(即添加顺序和取出顺序一致)、且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println("list=" + list);

        //2. List 集合中的每个元素都有其对应的顺序索引，即支持索引 // 索引是从 0 开始的
        System.out.println(list.get(3));//hsp

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("while():" + iterator.next());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("for():" + list.get(i));
        }
        //3.List 容器中的元素都对应一个整数型的序号，记载其在容器中的位置，可以根据序号存取容器中的元素。

    }
}
