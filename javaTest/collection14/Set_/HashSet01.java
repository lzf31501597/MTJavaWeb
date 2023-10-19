package com.javaTest.collection14.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet01 {
    /**HashSet
    * 1.HashSet 构造器走的源码
    * public HashSet() {
        map = new HashMap<>();
    }
     2. HashSet 可以存放 null ,但是只能有一个 null,即元素不能重复
    * */
    public static void main(String[] args) {
        //1. 在执行 add 方法后，会返回一个 boolean 值
        //2. 如果添加成功，返回 true, 否则返回 false
        //3. 可以通过 remove 指定删除哪个对象
        Set set = new HashSet();
        System.out.println(set.add("john"));//t
        System.out.println(set.add("lucy"));//t
        System.out.println(set.add("john"));//f
        System.out.println(set.add("jack"));//t
        System.out.println(set.add("hsp"));//t
        System.out.println(set.add("mary"));//t
        System.out.println(set.add(null));//t
        System.out.println(set.add(null));//f

        //遍历
        //方式 1: 使用迭代器
        System.out.println("=====使用迭代器====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        set.remove(null);

        //方式 2: 增强 for
        System.out.println("=====增强 for====");
        for (Object o : set) {
            System.out.println("o=" + o);
        }
    }
}
