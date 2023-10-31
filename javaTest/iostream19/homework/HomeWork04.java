package com.javaTest.iostream19.homework;

import java.io.*;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 16:53
 * @Description
 */
public class HomeWork04 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("alolor", "red");
        properties.list(System.out);

        String filePath = "./MTJavaWeb/src/com/javaTest/iostream19/homework/dog.properties";
        properties.store(new FileOutputStream(filePath), "dog.properties");

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = "";
        while ((line = br.readLine()) != null){
            String[] split = line.split("=");
            System.out.println(split[0] + "值是：" + split[1]);
        }


    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;
    //private static final long serialVersionUID = -2L;
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}