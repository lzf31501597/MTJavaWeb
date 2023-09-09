package com.javaTest.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);

        //9、包装类（Integer、Double、Boolean等都是final），String也是final类。
        //Double
    }
}
/**
 * 6、一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法。
 * 7、final不能修饰构造方法（即构造器）
 * 8、final和static往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理
 * 9、包装类（Integer、Double、Boolean等都是final），String也是final类。
* */
class  BBB {
    //8、final和static往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理
    public final static int num = 10000;
    static {
        System.out.println("BBB 静态代码块被执行");
    }
}
final class AAA{
    //6、一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法。
    //public final void cry(){}
}