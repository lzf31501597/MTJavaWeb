package com.javaTest.smallChangeSys.homeWork;

public class HomeWork16 {

    //16，java的动态绑定机制是什么？
    //（1.当调用对象的方法的时候，该方法会和对象的内存地址\运行类型绑定；
    //（2.当调用对象的属性的时候，没有动态绑定机制，哪里定义，哪里使用；
    public static void main(String[] args) {
        AAA obj = new BBB();//向上转型
        AAA a1 = obj;
        System.out.println("obj的hashCode()："+obj.hashCode());//BBB
        obj = new CCC();//向上转型
        System.out.println("obj的hashCode()："+obj.hashCode());//CCC
        obj = a1;
        System.out.println("obj的hashCode()："+obj.hashCode());//BBB
        obj = (AAA)a1;
        System.out.println("obj的hashCode()："+obj.hashCode());//BBB
        obj = new AAA();
        System.out.println("obj的hashCode()："+obj.hashCode());//AAA
    }

}

class AAA1{//father’s father class

}
class BBB1 extends AAA1{//father class

}
class CCC1 extends BBB{//son class




}
