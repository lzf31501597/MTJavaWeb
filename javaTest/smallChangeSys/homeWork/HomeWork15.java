package com.javaTest.smallChangeSys.homeWork;

public class HomeWork15 {
    //15,什么事多态，多态具体体现有哪些？
    //多态特征：方法或对象具有多种形态，是oop的第三大特征，是建立在封装和继承的基础上多态的具体表现：
    //1.方法的多态：（1），重载体现多态  （2），重写体现多态
    //2，对象的多态：
    // （1）对象的编译类型和运行类可以不一致，编译类型在定义时，就确定，不能变化；
    // （2）对象的运行类型是可以变化的可以通过getClass()来查看运行类型；
    // （3）编译类型：看定义时的=号的左边，运行类型看=号的右边
    public static void main(String[] args) {
        AAA obj = new BBB();//向上转型
        AAA a1 = obj;
        System.out.println("obj的运行类型："+obj.getClass());//BBB
        obj = new CCC();//向上转型
        System.out.println("obj的运行类型："+obj.getClass());//CCC
        obj = a1;
        System.out.println("obj的运行类型："+obj.getClass());//BBB
        obj = (AAA)a1;
        System.out.println("obj的运行类型："+obj.getClass());//BBB
        obj = new AAA();
        System.out.println("obj的运行类型："+obj.getClass());//AAA
    }

}

class AAA{//father’s father class

}
class BBB extends AAA{//father class

}
class CCC extends BBB{//son class

}