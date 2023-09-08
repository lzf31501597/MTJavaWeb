package com.javaTest.single_;

/**
 * 饿汉式模式
 */
public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFriend girlFriend = new GirlFriend("小红");
//        GirlFriend girlFriend1 = new GirlFriend("小白");
        //通过方法可以获取对象---饿汉式
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println("instance=" + instance);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println("instance2=" + instance2);
        System.out.println(instance == instance2);

        System.out.println(GirlFriend.n1);
    }
}
class GirlFriend {

    private String name;
    public static int n1 = 100;
    //为了能够在静态方法中，返回GF对象，需要将其用static修饰---饿汉式
    //对象--通常是重量级的对象，饿汉式可能造成创建了对象，但是没有使用--（造成资源浪费）
    private static GirlFriend girlFriend = new GirlFriend("小红红");

    //如何保障我们只能创建一个GirlFriend对象
    //饿汉式--单例模式步骤：
    //1、将构造器私有化
    //2、在类的内部直接创建（对象是static）
    //3、提供一个公共的static方法，返回gf对象

    private GirlFriend(String name) {
        System.out.println("GirlFriend(String name) 被调用。。。。。。");
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}