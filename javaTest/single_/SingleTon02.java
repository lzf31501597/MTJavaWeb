package com.javaTest.single_;

/**
 * 懒汉式模式
 */

/*
* 懒汉式和饿汉式的区别：
* 1、二者最主要的区别：在于创建对象的时机不同：
*       饿汉式：是在类加载时就创建了对象实例。 懒汉式：是在使用时才创建。
* 2、饿汉式不存在线程安全问题，二懒汉式存在线程安全问题。
* 3、饿汉式存在浪费资源问题，因为如果程序员一个对象实例都没有使用。
*       那么饿汉式创建的对象就浪费了。懒汉式是使用时才创建，就不在这个问题。
* 4、在我们javaSE标准类中，java.lang.RunTime就是经典的单例模式
* */

public class SingleTon02 {
    public static void main(String[] args) {
        //new Cat("xiaohuang"); //error
        //System.out.println(Cat.n1);

        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

        System.out.println(instance1 == instance);//true
//        Cat(String name) 被调用。。。。。。
//        Cat{name='小小可爱'}
//        Cat{name='小小可爱'}
//        true

        //Runtime
    }
}
//希望在运行过程中，只能创建一个Cat对象
//使用单列模式
class Cat {
    private String name;
    public static int n1 = 888;
    private static Cat cat ;

    //如何保障我们只能创建一个GirlFriend对象
    //懒汉式--单例模式步骤：
    //1、将构造器私有化
    //2、定义一个static静态属性对象
    //3、提供一个公共的static方法，返回一个cat对象
    //4、懒汉式：只有当用户使用getInstance时，才返回cat对象，后面再次调用时，会返回上次创建的Cat对象。
    //从而保证了单例

    private Cat(String name) {
        System.out.println("Cat(String name) 被调用。。。。。。");
        this.name = name;
    }

    public static Cat getInstance() {//如果没有创建cat对象
        if (cat == null) {
            cat = new Cat("小小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}