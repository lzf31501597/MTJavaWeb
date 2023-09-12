package com.javaTest.interface_.interfaceDetail;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        //7、接口中的属性访问形式：接口名.属性名
        //以下两点证明：接口中的属性，是public static final
        System.out.println(IB.n1); //说明n1,就是static的类属性
        //IB.n1 = 30; //error n1的值不能修改，说明final关键字修饰符


    }
}
//接口中的属性，只能是final的，而且是public static final 修饰符
interface IB{
//    default int n2= 10; //error
//    protected int n3 = 10;//error
//    private int n4 =10;//error

    int n1 = 10; //等价于public static final int n1 = 10；
    void say();
}
interface IC{
    void hi();
}
//5、一个类可以同时实现多个接口
class Pig implements IB,IC {

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

//8、一个接口不能继承其他的类，但是可以继承多个别的接口
interface Dog extends IB,IC{

}
//interface Dog extends pig {
//
//}
//9、接口的修饰符，只能是public和默认，这点和类的修饰是一样的
interface IH{}
//private interface IE{} //error
//protected interface IF{} //error
//default interface IG{} //error
