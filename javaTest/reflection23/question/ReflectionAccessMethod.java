package com.javaTest.reflection23.question;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author
 * @version 1.0
 * @date 2023/11/10 18:04
 * @Description
 */
public class ReflectionAccessMethod {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        //1.得到Boss 类对应的class对象
        Class<?> aClass = Class.forName("com.javaTest.reflection23.question.Boss");

        //2.创建对象
        Object o = aClass.newInstance();

        //3.调用public的hi（）
        //Method hi = aClass.getMethod("hi", String.class);//ok
        //3.1 调用hi方法对象
        Method hi1 = aClass.getDeclaredMethod("hi", String.class);//ok
        //3.2 调用
        hi1.invoke(o, "tom");

        //4.调用private static String say()
        //4.1 得到say()方法对象
        Method say = aClass.getDeclaredMethod("say", int.class, String.class, char.class);
        //4.2 因为say方法是 private， 所有需要暴破，原理和构造器和属性一样
        say.setAccessible(true);
        System.out.println(say.invoke(o, 18, "smith", '男'));
        //4.3 因为say方法是 static， 还可以这样调用，可以传入null
        System.out.println(say.invoke(o, 25, "jack", '女'));

        //5.在反射中，如果方法有返回值，统一返回Object，但是它的运行类型和方法定义的返回类型一致
        Object invoke = say.invoke(null, 30, "john", '男');
        System.out.println("运行类型="+invoke.getClass());

    }
}
class Boss{
    public int age;
    private static String name;

    public Boss() {
    }
    private static String say(int n, String s, char c){
        return n + " " + s + " " + c;
    }
    public void hi(String s){
        System.out.println("hi=" + s);
    }
}