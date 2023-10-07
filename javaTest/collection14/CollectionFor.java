package com.javaTest.collection14;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    /** 二.遍历集合循环，增强for循环
     * while(iterator.hasNext()){ //hasNext()是否下一个元素值
     *      Object next =  iterator.next();// next()：1.指针下移一位，2.并返回下移一位指针指向的元素值
     *      System.out.println(next);
     * }
     * */
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("红楼梦", 100));
        collection.add(new Book("金瓶梅新", 90));
        collection.add(new Book("青年文摘 20 年", 5));
        collection.add(new Book("java 从入门到放弃~", 300));

        //1.增强for循环,遍历集合Collection
        //2.增强for循环，底层仍然是迭代器
        //3.增强for循环，（可以理解成就是简化版本的 迭代器遍历）
        //4.快捷方式 I
        for (Object book : collection) {
            System.out.println("book=" + book);
        }



//        //增强for循环,遍历数组
//        int[] nums = {1, 8, 10, 90};
//        for (int i : nums) {
//            System.out.println("i=" + i);
//        }


    }
}
