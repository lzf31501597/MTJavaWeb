package com.javaTest.iostream19.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 16:53
 * @Description
 */
public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String filePath = "./MTJavaWeb/src/com/javaTest/iostream19/homework/dog.properties";
        properties.load(new FileReader(filePath));

        String name = properties.getProperty("name")+"";
        int age = Integer.parseInt(properties.get("age")+"");
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        String serFilePath = "./javaFile/dog.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(serFilePath));
        objectOutputStream.writeObject(dog);

        objectOutputStream.close();



    }
    @Test
    public void show() throws IOException, ClassNotFoundException {
        String serFilePath = "./javaFile/dog.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog) objectInputStream.readObject();

        System.out.println(dog);

        objectInputStream.close();
    }
}

