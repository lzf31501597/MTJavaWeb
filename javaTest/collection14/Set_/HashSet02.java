package com.javaTest.collection14.Set_;



import java.util.HashSet;
import java.util.Set;

public class HashSet02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //1.在执行add方法后，会返回一个boolean值
        //2.如果添加成功，返回true，否则返回false
        //3.可以通过 remove 制定删除哪个对象
        Set set = new HashSet();
        System.out.println(set.add("john"));//t
        System.out.println(set.add("lucy"));//t
        System.out.println(set.add("john"));//f
        System.out.println(set.add("jack"));//t
        System.out.println(set.add("hsp"));//t
        System.out.println(set.add("mary"));//t

        System.out.println("set=" + set);

        set.remove("john");
        set = new HashSet();
        System.out.println("set=" + set);
        set.add("lucy");
        set.add("lucy");//添加不成功
        set.add(new Dog("tom"));//添加了一个dog对象
        set.add(new Dog("tom"));//添加了一个dog对象
        System.out.println("set=" + set);

        set.add(new String("hsp"));//Ok
        set.add(new String("hsp"));//添加不进去
        System.out.println("set=" + set);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}