package javaTest.smallChangeSys.homeWork;

public class HomeWork14 {
    public static void main(String[] args) {
        C c = new C();
//        class A
//        hahaha,public B(String name)
//        hello,class C public C(String name)
//        class C public C()
        c = new C("james king");
//        class A
//        hahaha,public B(String name)
//        james king,class C public C(String name)
    }
}
class A {
    public A() {
        System.out.println("class A");
    }
}
class B extends A{
    public B() {
        System.out.println("public B()");
    }
    public B(String name) {
        System.out.println(name + ",public B(String name) ");
    }
}

class C extends B{
    public C() {
        this("hello");
        System.out.println("class C public C()");
    }
    public C(String name) {
        super("hahaha");
        System.out.println(name + ",class C public C(String name)");
    }
}