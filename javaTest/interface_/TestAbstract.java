package com.javaTest.interface_;


/**
* 实现接口 VS 继承类
 * 1、接口和继承解决的问题不同。
 *  a、继承的价值主要在于:解决代码的复用性和可维护性。
 *  b、接口的价值主要在于:设计，设计好各种规范（方法），让其他类去实现这些方法。
 * 2、接口比继承更加灵活--继承是满足is-a的关系，而接口只需满足like-a的关系。
 * 3、接口在一定程度上实现代码解耦（接口规范性+动态绑定机制）。
* */
public class TestAbstract{
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("大圣");
        littleMonkey.climbing();

        littleMonkey.flying();
        littleMonkey.swimming();

    }
}
class Monkey{
    private String name;

    public Monkey(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println("猴子会爬树。。。。。。。");
    }
}

interface Fishable{
    public void swimming();
}
interface Birdable{
    public void flying();
}
//子类继承了父类Monkey类，就自动的拥有父类的功能。
// 如果子类需要扩展功能，又可以通过实现接口Fishable,Birdable的方式，扩展功能
//----------可以理解成，实现接口是对java单继承机制的一种补充。
class LittleMonkey extends Monkey implements Fishable,Birdable {

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(this.getName() + "努力学习之后，学会游泳了。。。。。。。");
    }

    @Override
    public void flying() {
        System.out.println(this.getName() + "努力学习之后，学会飞了。。。。。。。");
    }
}