package com.javaTest.collection14;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    /** 一.遍历集合循环while
     * while(iterator.hasNext()){ //hasNext()是否下一个元素值
     *      Object next =  iterator.next();// next()：1.指针下移一位，2.并返回下移一位指针指向的元素值
     *      System.out.println(next);
     * }
    * */
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("红楼梦", 100));
        collection.add(new Book("金瓶梅新", 90));
        collection.add(new Book("青年文摘 20 年", 5));
        collection.add(new Book("java 从入门到放弃~", 300));

        System.out.println(collection);

        //1.先得到集合的迭代器
        Iterator iterator = collection.iterator();
        //2.循环遍历集合   快捷键：ctrl + j： itit： while 循环遍历
        System.out.println("---------------第1次遍历-----------------");
        while(iterator.hasNext()){ //hasNext()是否下一个元素值
            Object next =  iterator.next();// next()：1.指针下移一位，2.并返回下移一位指针指向的元素值
            System.out.println(next);
        }
        //3.当退出循环遍历后，这时iterator迭代器，指向最后的元素,
        //iterator.next(); 再去遍历集合的话，报异常 NoSuchElementException,没有元素异常
        //4.如果希望再次遍历，需要重置我们的迭代器
        iterator = collection.iterator();
        System.out.println("---------------第2次遍历-----------------");
        while(iterator.hasNext()){ //hasNext()是否下一个元素值
            Object next =  iterator.next();// next()：1.指针下移一位，2.并返回下移一位指针指向的元素值
            System.out.println(next);
        }

    }
}
class Book {
    private String name;
    private double privce;

    public Book(String name, double privce) {
        this.name = name;
        this.privce = privce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrivce() {
        return privce;
    }

    public void setPrivce(double privce) {
        this.privce = privce;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", privce=" + privce +
                '}';
    }
}