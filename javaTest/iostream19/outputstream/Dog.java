package com.javaTest.iostream19.outputstream;


import java.io.Serializable;

//如果要序列化类的对象，需要实现Serializable
public class Dog implements Serializable {
    private String name;
    private int age;

    private static String color;
    private transient String nation;

    //serialVersionUID 序列化的版本号，可以提高兼容性
    private static final long serialVersionUID = 1L;
    //序列化对象时，要求里面的属性的类型也需要实现序列化接口
    private Master master = new Master();

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }
}
class Master{
    private String name;

}