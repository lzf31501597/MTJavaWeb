package com.javaTest.innerCass;

/**
* 局部内部类：
 * 1、局部内部类时定义在外部类的局部位置上：（比如方法中，并且有类名）
 * 2、可以直接访问外部类的所有成员，包含私有的
 * 3、不能添加访问修饰符：（因为它的地位就是一个局部变量,局部变量是不能使用修饰符的。
 *      但是可以使用final修饰符，应为局部变量也可以使用final修饰符)
 * 4、作用域：仅仅在定义它的方法或代码中
 * 5、局部内部类--->访问--->外部类的成员（访问方式：是直接访问）
 * 6、外部类--->访问--->局部内部类的成员
 *      访问方式：创建对象，再访问（注意：必须在作用域内）
 * 7、外部其他类---不能访问----局部内部类（因为局部内部类地位是一个局部变量）
 * 8、如果外部类和局部内部类的成员重名时，默认遵循就近原则；
 *      如果想访问外部类的成员，则可以使用（外部类。this。成员）去访问。
* */

/**
* 小结：1、局部内部类定义在方法中或代码块中
 *      2、作用域在方法体或者代码块中
 *      3、本质仍然是一个类
 *
* */

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();

    }
}
class Outer02 {
    private int n1 = 200;
    private void m2(){
        System.out.println("Outer02 m2()");
    };
    public void m1(){
        //1、局部内部类时定义在外部类的局部位置上：（比如方法中，并且有类名）
        //3、不能添加访问修饰符：（因为它的地位就是一个局部变量,局部变量是不能使用修饰符的。
        //      但是可以使用final修饰符，应为局部变量也可以使用final修饰符)
        //4、作用域：仅仅在定义它的方法或代码中
        String name = "XXXX Outer02 m1().........";
        final class Inner02{
            //2、可以直接访问外部类的所有成员，包含私有的
            private int n1 = 888;
            public void f1(){
                //5、局部内部类--->访问--->外部累的成员（访问方式：是直接访问）
                System.out.println("n1=" + n1);
                System.out.println("name:" + name);
                m2();
                //8、如果外部类和局部内部类的成员重名时，默认遵循就近原则；
               //如果想访问外部类的成员，则可以使用（外部类。this。成员）去访问。
                System.out.println("外部类：Outer02.n1=" + Outer02.this.n1);
                System.out.println("外部类：Outer02.hashCode()=" + Outer02.this.hashCode());
                m2();
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
        System.out.println("Outer02.hashCode()=" + Outer02.this.hashCode());
    }
    {//代码块
        class Inner03{

        }

    }
}
