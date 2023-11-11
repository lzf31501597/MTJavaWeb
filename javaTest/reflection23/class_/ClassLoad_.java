package com.javaTest.reflection23.class_;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author
 * @version 1.0
 * @date 2023/11/10 14:57
 * @Description
 */
public class ClassLoad_ {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key");
        String key = scanner.next();
        switch (key){
            case "1":
                Dog dog = new Dog();//静态加载
                dog.cry();
                break;
            case "2":
                //反射--》动态加载
                Class<?> aClass = Class.forName("com.javaTest.reflection23.class_.Person");//加载Cat类（动态加载）
                Object o = aClass.newInstance();
                Method m = aClass.getMethod("hi");
                m.invoke(o);
                System.out.println("ok...");
                break;
            default:
                System.out.println("do nothing...");
                break;
        }
    }
}
//因为 new Dog() 是静态加载类，因此必须要创建Dog类
//Person类是动态加载，所以，没有编译 类也不会报错，只有当动态加载该类时，才会报错
class Dog {

    public void cry(){
        System.out.println("小狗，汪汪叫。。。。");
    }
}

class Person {

    public void hi(){
        System.out.println("小狗，汪汪叫。。。。");
    }
}