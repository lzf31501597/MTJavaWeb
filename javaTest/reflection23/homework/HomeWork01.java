package com.javaTest.reflection23.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author
 * @version 1.0
 * @date 2023/11/11 11:25
 * @Description
 */
public class HomeWork01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.获取 PrivateTest 类对应的class对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //Class<?> aClass = Class.forName("com.javaTest.reflection23.homework.PrivateTest");

        //2.创建对象实例
        Object o = privateTestClass.newInstance();

        //3.获取name属性对象
        Field name = privateTestClass.getDeclaredField("name");

        //4.暴破name
        name.setAccessible(true);
        System.out.println(name.get(o));
        name.set(o, "jack");

        //5.获取getName方法对象
        Method getName = privateTestClass.getMethod("getName");

        //6.因为 getName（）是public，所以直接调用
        Object invoke = getName.invoke(o);
        System.out.println("name属性值：" + invoke);

    }
}
class PrivateTest{

    private String name = "hello kitty";

    public String getName() {
        return name;
    }


}