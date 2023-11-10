package com.javaTest.reflection23;

/**
 * @author
 * @version 1.0
 * @date 2023/11/09 15:36
 * @Description
 */
public class Cat {

    private String name = "招财猫";
    public int age = 5;

    public Cat() {
    }
    public Cat(String name) {
        this.name = name;
    }

    public void hi(){//常用方法
        System.out.println("hi " + name);
    }

    public void cry(){//常用方法
        System.out.println(name + " 喵喵叫。。。");
    }

}
