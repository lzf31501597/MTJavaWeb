package com.javaTest.Annotation_.homeWork;

public class HomeWork05 {
    public static void main(String[] args) {
        new A().f1();
    }
}
class A {
    private String NAME = "kings";

    public void f1(){
        class B{
            private final String NAME ="jack";

            public void show(){
                System.out.println("NAME:" + NAME +" ,外部类的name=" + A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }


}