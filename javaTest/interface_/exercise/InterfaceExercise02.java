package com.javaTest.interface_.exercise;

/**
* 小结：类的五大成员
 * 1、属性；2、方法；3、构造器；4、代码块
* 5、内部类
* */
public class InterfaceExercise02 {
}

interface AA{
    int x = 0; //==>等价于public static final int x = 0;
}
class BB {
    int x = 1;
}
class CC extends BB implements AA{
    public void pX(){
        //System.out.println("x=" + x);//没有明确X的值：这个x的值不知道是调用父类的值？还是实现类的值？
        //访问接口的X就用：AA.x
        System.out.println("接口的X AA.x=" + AA.x);
        //访问父类的x就用：super.x
        System.out.println("父类的x super.x=" + super.x);


    }

    public static void main(String[] args) {
        new CC().pX();
    }
}