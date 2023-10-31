package com.javaTest.iostream19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 10:55
 * @Description ObjectInputStream 的使用，完成数据的反序列化
 */
public class ObjectInputStream_ {
    public static void main(String[] args) {
        //
        String filePath = "./javaFile/data.dat";
        ObjectInputStream objectInputStream = null;
        try {
            //读取反序列化的数据的顺序，必须和保存数据的序列化的顺序一致，否则会出现异常
            objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

            System.out.println(objectInputStream.readInt());
            System.out.println(objectInputStream.readBoolean());
            System.out.println(objectInputStream.readChar());
            System.out.println(objectInputStream.readDouble());
            System.out.println(objectInputStream.readUTF());

            //dog 编译类型是Object，运行类型是Dog
            Object dog = objectInputStream.readObject();
            System.out.println("运行类型：" + dog.getClass());
            System.out.println("dog信息：" + dog);//底层会向下转换  Object---> Dog

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
