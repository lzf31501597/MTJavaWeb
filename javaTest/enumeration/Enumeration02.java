package com.javaTest.enumeration;


/**
 * 一、自定义类实现枚举
 * 1、不需要提供setXxx（）方法，因为枚举对象值通常为只读
 * 2、对枚举对象、属性使用 final + static 共同修饰，实现底层优化
 * 3、枚举对象名通常使用全部大写，常量的规范规范
 * 4、枚举对象根据需要，也可以有多个属性。
*/
/*
* 自定类实现枚举的特点：
* 1、构造器私有化
* 2、本类内部创建一组对象【春，夏，秋，冬】
* 3、对外暴露对象（通过为对象添加public final static 修饰符）
* 4、可以提供getXxx（）方法，但不是提供setXxx（）方法
* */
public class Enumeration02 {
    public static void main(String[] args) {
        Season02[] season02s = new Season02[4];
        season02s[0] = Season02.WINTER;
        season02s[1] = Season02.SUMMER;
        season02s[2] = Season02.AUTUMN;
        season02s[3] = Season02.WINTER;

        for (int i = 0; i < season02s.length; i++) {
            System.out.println(season02s[i]);
        }
    }
}
//演示枚举类型实现
class Season02 {
    private String name;
    private String desc; //描述

    //定义了四个对象
    public final static Season02 SPRING = new Season02("春天","温暖");
    public final static Season02 SUMMER = new Season02("夏天","炎热");
    public final static Season02 AUTUMN = new Season02("秋天","凉爽");
    public final static Season02 WINTER = new Season02("冬天","寒冷");
    //1、将构造器私有化，目的是防止直接new
    //2、去掉setXxx（）方法，防止属性被修改
    //3、在 Senson02 内部，直接创建固定的对象
    //4、优化：可以加入final修饰符
    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
