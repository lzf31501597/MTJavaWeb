package com.javaTest.reflection23.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/11/09 15:39
 * @Description 反射问题的引入
 */
public class Reflection01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //根据配置文件 re.properties 指定信息，创建Cat对象并调用方法hi
        //传统方法 new 对象--》调用方法
        /*Cat cat = new Cat();
        cat.hi(); ==》 cat.cry(); //要修改源码
        Cat cat = new Cat("tom");
        cat.cry();*/

        //反射方法
        //1.通过 Properties 类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/reflection23/re.properties"));
        String classfullpath = properties.get("classfullpath").toString(); //com.javaTest.reflection23.Cat
        String methodName = properties.getProperty("method");

        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + methodName);

        //2.创建对象，传统方法行不通---》反射机制
        //new classfullpath();

        //3.使用反射机制解决****************************
        //3.1).加载类，返回Class类型的对象
        Class aClass = Class.forName(classfullpath);

        //3.2). 通过 aClass 得到加载的类 com.javaTest.reflection23.Cat
        Object o = aClass.newInstance();
        System.out.println("o的运行类型：" + o.getClass()); //运行类型

        //3.3). 通过 aClass 得到加载的类 com.javaTest.reflection23.Cat 的methodName=hi 的方法对象
        // 即：在反射中，可以把方法是为对象（外物皆对象）
        Method method = aClass.getMethod(methodName);

        //4.通过 method 调用方法: 即通过方法对象来实现调用方法
        System.out.println("------通过 method 调用方法: 即通过方法对象来实现调用方法----------");
        method.invoke(o); //1--传统方法 对象.方法()； 2--反射机制  方法.invoke(对象)


        //java.lang.reflect.Field: 代表类的成员变量, Field 对象表示某个类的成员变量
        // 得到 name 字段
        //getField 不能得到私有的属性
        Field nameField = aClass.getField("age"); //
        System.out.println(nameField.get(o)); // 传统写法 对象.成员变量 , 反射 : 成员变量对象.get(对象)

        //java.lang.reflect.Constructor: 代表类的构造方法, Constructor 对象表示构造器
        Constructor constructor = aClass.getConstructor(); //()中可以指定构造器参数类型, 返回无参构造器 System.out.println(constructor);//Cat()
        System.out.println(constructor);
        Constructor constructor2 = aClass.getConstructor(String.class); //这里老师传入的 String.class 就是 String 类的 Class 对象
        System.out.println(constructor2);//Cat(String name)


    }
}
