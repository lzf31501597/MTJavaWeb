package com.javaTest.reflection23.question;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author
 * @version 1.0
 * @date 2023/11/10 17:20
 * @Description
 */
public class ReflectionCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.先获取到User类的Class对象
        Class<?> aClass = Class.forName("com.javaTest.reflection23.question.User");

        //2.通过public 无参构造器，创建实例
        Object o = aClass.newInstance();
        System.out.println(o);//com.javaTest.reflection23.question.User@3cd1a2f1

        //3.通过public 有参构造器，创建实例
        /*public User(String name) {
            this.name = name;
        }*/
        //3.1 先得到对应构造器
        Constructor<?> constructor = aClass.getConstructor(String.class);
        //3.2 创建实例，并传入参数
        Object hsp = constructor.newInstance("hsp");
        System.out.println("hsp=" + hsp);//hsp=com.javaTest.reflection23.question.User@2f0e140b

        //4.通过public 有参构造器，创建实例
        //4.1 得到private 的构造器
        Constructor<?> constructor1 = aClass.getDeclaredConstructor(int.class, String.class);
        //4.2 创建实例，并传入参数
        constructor1.setAccessible(true);//暴破，【暴力破解】，使用反射可以反问 private构造器、方法，属性，（反射面前，都是纸老虎）
        Object tom = constructor1.newInstance(20, "tom");
        System.out.println("tom=" + tom);//tom=com.javaTest.reflection23.question.User@7440e464
    }
}
class User{
    private int age = 10;
    private String name = "HSPEDU";

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}