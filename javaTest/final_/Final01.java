package com.javaTest.final_;



public class Final01 {
    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RATE = 1.1;
        F f = new F();
        f.cry();
    }
}

/*
* 1、如果要求A类不能被其他类继承，可以用final修饰A类
* */

final class A {

}

//class B extends A { }
/*
* 2、当不希望父类的某个方法被子类覆盖、重写（override）时，可以用关键字final修饰该方法。
* */
class C{
    public final void hi(){}
}
class D extends C{
//    @Override
//    public void hi(){
//        System.out.println("重写了C类的hi（）方法");
//    }
}

/*
 * 3、当不希望类的某个属性值被修改，可以用final修饰
 * */
class  E {
    public final double TAX_RATE = 0.08;
}


/*
*4、当不希望某个局部变量被修改，可以用final修饰
 * */
class F {
    public void cry(){
        final double NUM = 0.01; //NUM为局部变量
        //NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}