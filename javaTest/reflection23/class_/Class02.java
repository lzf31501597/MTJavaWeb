package com.javaTest.reflection23.class_;

import com.javaTest.reflection23.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author
 * @version 1.0
 * @date 2023/11/10 13:47
 * @Description 演示Class常用方法
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        String classAllPath = "com.javaTest.reflection23.Car";
        //1 . 获取到 Car 类 对应的 Class 对象
        //<?> 表示不确定的 Java 类型
        Class<?> aClass = Class.forName(classAllPath);

        //2. 输出 aClass
        System.out.println(aClass); //显示 aClass 对象, 是哪个类的 Class 对象 class com.javaTest.reflection23.Car
        System.out.println(aClass.getClass()); //class java.lang.Class

        //3. 得到包名
        System.out.println(aClass.getPackage().getName());//com.javaTest.reflection23

        //4. 得到全类名
        System.out.println(aClass.getName());//com.javaTest.reflection23.Car

        //5. 通过 cls 创建对象实例
        Car car = (Car) aClass.newInstance();
        System.out.println(car);//car.toString() Car{brand='保时捷', price=5000000, color='白色'}

        //6. 通过反射获取属性 brand
        Field brand = aClass.getField("brand");
        System.out.println(brand.get(car));//保时捷

        brand = aClass.getField("price");//5000000
        System.out.println(brand.get(car));

        brand = aClass.getField("color");//白色
        System.out.println(brand.get(car));

        //7. 通过反射给属性赋值
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));//奔驰

        //8 我希望大家可以得到所有的属性(字段)
        System.out.println("=======所有的字段属性====");
        Field[] fields = aClass.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());//名称
        }
        System.out.println("=======所有的构造方法====");
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c.getName());//名称
        }
        System.out.println("=======所有的Method====");
        Method[] methods = aClass.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());//名称
        }


    }
}
