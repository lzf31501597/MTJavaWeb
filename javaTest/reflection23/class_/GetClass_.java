package com.javaTest.reflection23.class_;

import com.javaTest.reflection23.Car;

/**
 * @author
 * @version 1.0
 * @date 2023/11/10 14:42
 * @Description 得到Class对象的各种方式
 */
public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {

        //1. Class.forName
        String classAllPath = "com.javaTest.reflection23.Car"; //通过读取配置文件获取
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);//class com.javaTest.reflection23.Car

        //2. 类名.class , 应用场景: 用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);//class com.javaTest.reflection23.Car

        //3. 对象.getClass(), 应用场景，有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);//class com.javaTest.reflection23.Car

        //4. 通过类加载器【4 种】来获取到类的 Class 对象
        //(1)先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();

        //(2)通过类加载器得到 Class 对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);//class com.javaTest.reflection23.Car

        //cls1 , cls2 , cls3 , cls4 其实是同一个对象
        System.out.println(cls1.hashCode());//1020371697
        System.out.println(cls2.hashCode());//1020371697
        System.out.println(cls3.hashCode());//1020371697
        System.out.println(cls4.hashCode());//1020371697

        //5. 基本数据(int, char,boolean,float,double,byte,long,short) 按如下方式得到 Class 类对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);//int
        System.out.println(characterClass);//char
        System.out.println(booleanClass);//boolean

        //6. 基本数据类型对应的包装类，可以通过 .TYPE 得到 Class 类对象
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE; //其它包装类 BOOLEAN, DOUBLE, LONG,BYTE 等待
        System.out.println(type1); //int
        System.out.println(integerClass.hashCode());//789451787
        System.out.println(type1.hashCode());//789451787
    }
}
