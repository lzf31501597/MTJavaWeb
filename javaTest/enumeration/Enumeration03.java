package com.javaTest.enumeration;


/**
 * 二、自定义类实现枚举
 * 1、不需要提供setXxx（）方法，因为枚举对象值通常为只读
 * 2、对枚举对象、属性使用 final + static 共同修饰，实现底层优化
 * 3、枚举对象名通常使用全部大写，常量的规范规范
 * 4、枚举对象根据需要，也可以有多个属性。
 */
public class Enumeration03 {
    public static void main(String[] args) {
        Season03[] season02s = new Season03[5];
        season02s[0] = Season03.WINTER;
        season02s[1] = Season03.SUMMER;
        season02s[2] = Season03.AUTUMN;
        season02s[3] = Season03.WINTER;
        season02s[4] = Season03.what;

        for (int i = 0; i < season02s.length; i++) {
            System.out.println(season02s[i]);
        }
    }
}

//演示enum关键字来实现枚举类型
enum Season03 {


//    //定义了四个对象
//    public final static Season02 SPRING = new Season03("春天","温暖");
//    public final static Season02 SUMMER = new Season03("夏天","炎热");
//    public final static Season02 AUTUMN = new Season03("秋天","凉爽");
//    public final static Season02 WINTER = new Season03("冬天","寒冷");
    //如果使用了enum关键字来实现枚举
    //1.使用关键字enum 替代 class
    //2.public final static Season02 SPRING = new Season03("春天","温暖"); 直接使用
    //  SPRING("春天","温暖"),解读成：常量名（实参名）
    //3.如果有多个常量（对象），使用，好间隔即可
    //4.如果要enum来是想枚举，要求将定义常量对象，写在最前面。
    //5.如果使用的是无参构造器，创建常量对象，则可以省略（）。
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷"),what;
    private String name;
    private String desc; //描述
    //1、将构造器私有化，目的是防止直接new
    //2、去掉setXxx（）方法，防止属性被修改
    //3、在 Senson02 内部，直接创建固定的对象
    //4、优化：可以加入final修饰符

    private Season03() {//无参构造器

    }
    private Season03(String name, String desc) {
        System.out.println("Season03(String name, String desc)");
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
/**
* javap Season03.class
Compiled from "Enumeration03.java"
final class com.javaTest.enumeration.Season03 extends java.lang.Enum<com.javaTest.enumeration.Season03> {
  public static final com.javaTest.enumeration.Season03 SPRING;
  public static final com.javaTest.enumeration.Season03 SUMMER;
  public static final com.javaTest.enumeration.Season03 AUTUMN;
  public static final com.javaTest.enumeration.Season03 WINTER;
  public static com.javaTest.enumeration.Season03[] values();
  public static com.javaTest.enumeration.Season03 valueOf(java.lang.String);
  public java.lang.String getName();
  public java.lang.String getDesc();
  public java.lang.String toString();
  static {};
}

* */