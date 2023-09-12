package com.javaTest.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
//8、抽象方法不能使用private，final，和static修饰，因为这些关键字都是和重写相违背的。
//private abstract class H{
//final abstract class H{
//static abstract class H{
abstract class H{
    public abstract void hi();//抽象fangfa
}

//7.如果一个类继承了抽象类，则它必须实现抽象类的所有方法，除非他自己也声明为abstract类
abstract class E{
    public abstract void hi();//6.抽象方法不能有方法体
}
abstract class F extends E{

}
class G extends E{
    @Override
    public void hi() {//这里相当于G子类实现了父类E的抽象方法，（所谓事项抽象方法：就是要有方法体）

    }
}
//5、抽象类本事还是类，所以可以有类的各种成员
abstract class D {
    public int n1 = 10;
    public static String name = "hanshunpingEDU";
    public void hi(){
        System.out.println("hi()");
    }
}
