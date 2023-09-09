package com.javaTest.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();

        EE ee = new EE();
        ee.cal();
    }
}
/**
* 1、final修饰的属性，也叫常量。一般用XX_XX_XX来命名
* 2、final修饰的属性在定义时，必须赋初值，并且以后不能修改。赋值的位置有以下三种：
*       1)、定义时：public final double TAX_RATE = 0.08;
*       2）、在构造器中，  3）、在代码块中。
* 3、如果final修饰的属性是静态的，则初始化的位置只能是：
*       1）、定义时   2）、在静态代码块中，不能再构造器中。
* 4、final类不能继承，但是可以实例化对象。
* 5、如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承。
*
* */

class AA {
    /**
    * 1、final修饰的属性，也叫常量。一般用XX_XX_XX来命名
    * 2、final修饰的属性在定义时，必须赋初值，并且以后不能修改。赋值的位置有以下三种：
    *       1)、定义时：public static final double TAX_RATE = 0.08;
    *       2）、在构造器中，  3）、在代码块中。
    * */
    public static final double TAX_RATE = 0.08;
    public static final double TAX_RATE2;
    //public static final double TAX_RATE3;
/**
* 3、如果final修饰的属性是静态的，则初始化的位置只能是：
 *       1）、定义时   2）、在静态代码块中，不能再构造器中。
 * */
//    public AA() {
//        TAX_RATE3 = 99.9;//error
//    }
    static {
        TAX_RATE2 = 88.8;
    }
}
/** 4、final类不能继承，但是可以实例化对象。
 *
 * */
final class CC {

}
/**
 * 5、如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承。
 * ----即必须遵守继承机制
 * */
class DD {
    public final void cal(){
        System.out.println("cal()方法");
    }
}
class EE extends DD{


}