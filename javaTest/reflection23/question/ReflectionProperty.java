package com.javaTest.reflection23.question;

import java.lang.reflect.Field;

/**
 * @author
 * @version 1.0
 * @date 2023/11/10 17:40
 * @Description
 */
public class ReflectionProperty {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchFieldException {
        //1.得到Student 类对应的Class对象
        Class<?> aClass = Class.forName("com.javaTest.reflection23.question.Student");

        //2.创建实例
        Object o = aClass.newInstance();//o的运行类型就是Student
        System.out.println(o.getClass());//Student

        //3.使用反射获取age属性对象
        Field age = aClass.getField("age");
        age.set(o, 88);//通过反射来操作属性
        System.out.println(o);
        System.out.println(age.get(o));//返回age属性值

        //4.使用反射操作name 属性
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        //name.set(o, "jack");
        name.set(null, "jack");//因为name 是static属性，因此 o 也可以写出null
        System.out.println(o);
        System.out.println(name.get(o));//返回name属性值
        System.out.println(name.get(null));//返回name属性值，要求name是static

    }
}
class Student {

    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}