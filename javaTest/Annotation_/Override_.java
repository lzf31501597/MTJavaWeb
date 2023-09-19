package com.javaTest.Annotation_;

public class Override_ {
    public static void main(String[] args) {

    }
}
class Father {
    public void fly(){
        System.out.println("Father fly()......");
    }
    public void say(){
        System.out.println("Father say()......");
    }
}
class Son extends Father {
    /**
    * 1、@Override 注解放在fly（）方法上，表示子类的 fly（）方法重写了父类的fly方法
     * 2、没写@Override，也还是重写了父类的fly（）方法
     * 3、如果你写了@Override注解，编译器就会去检查该方法，是否真的重写了父类的方法。
     *      如果的确重写了，则编译通过，如果没有构成重写，则编译错误。
     * 4、@Override定义声明（只能修饰方法，不能修饰其他类，包，属性等）
     * //@interface 不是接口，是注解类（jdk1.5之后加入的）
     * @Target(ElementType.METHOD)  //说明只能修饰方法
     *      *****@Target修饰注解的注解，称为元注解。****
     * @Retention(RetentionPolicy.SOURCE)
     * public @interface Override {
     * }
    *
    * */
    @Override
    public void fly() {
        System.out.println("Son fly()......");
    }

    @Override
    public void say(){
        System.out.println("Son say()......");
    }
}

