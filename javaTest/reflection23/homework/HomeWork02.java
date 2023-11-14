package com.javaTest.reflection23.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author
 * @version 1.0
 * @date 2023/11/11 13:42
 * @Description
 */
public class HomeWork02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.获取File类对象
        Class<?> fileClass = Class.forName("java.io.File");
        //Object o = fileClass.newInstance();

        //2.获取File类所有的 Constructor 对象
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors){
            System.out.println("File类=" + declaredConstructor);
        }
        /**
         * File类=public java.io.File(java.lang.String,java.lang.String)
         * File类=public java.io.File(java.lang.String)
         * File类=private java.io.File(java.lang.String,java.io.File)
         * File类=public java.io.File(java.io.File,java.lang.String)
         * File类=public java.io.File(java.net.URI)
         * File类=private java.io.File(java.lang.String,int)
         */

        //3.获取获取指定 public java.io.File(java.lang.String) 的 Constructor 对象
        Constructor<?> declaredConstructor = fileClass.getDeclaredConstructor(String.class);
        String filePath = "./javaFile/mynew.txt";
        //创建文件对象
        Object file = declaredConstructor.newInstance(filePath);//
        //4.调用  方法创建文件对象
        Method createNewFile = fileClass.getMethod("createNewFile");
        createNewFile.invoke(file);

        System.out.println(file.getClass());
        System.out.println("创建文件成功" + filePath);

    }
}
