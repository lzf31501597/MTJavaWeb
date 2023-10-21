package com.javaTest.generic15;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        //1.给泛型指定数据类型时，要求是引用类型，不能是基本数据类型。
        List<Integer> list = new ArrayList<Integer>();//OK
        //List<int> list = new ArrayList<int>();//false

        //2.由于E 指定了A类型，构造器传入了 new A（）
        //在给泛型指定了具体数据类型后，可以传入该类型或者其子类型********
        Pigg<A> pig = new Pigg<A>(new A());
        pig.f();
        Pigg<A> pig1 = new Pigg<A>(new B());
        pig1.f();

        //3.泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        //在实际开发中，我们往往简写右边的泛型类型
        //编译器会进行类型判断，《=====推荐此方法
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        ArrayList<Pigg> list5 = new ArrayList<>();

        //4.如果这样写，默认泛型是Object
        ArrayList  alist = new ArrayList(); //等价于ArrayList<Object> list1 = new ArrayList<Object>();
        alist.add("aaaa");
        /*public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }*/

        Tiger tiger = new Tiger();

        /*class Tiger<E>{
            E e;
            public Tiger() {
            }
            public Tiger(E e) {
                this.e = e;
            }
        }*/
    }
}
class Tiger<E>{
    E e;
    public Tiger() {
    }
    public Tiger(E e) {
        this.e = e;
    }
}

class A{}
class B extends A{}

class Pigg<E>{
    E e;

    public Pigg(E e) {
        this.e = e;
    }

    public void f(){
        System.out.println(e.getClass());
    }
}