package com.javaTest.generic15.customgeneric;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10); //会自动封装 Integer10 ，输出Integer
        apple.fly(new Dog());//Dog
    }
}
class Apple<T,R,M>{
    public<E> void fly(E e){//泛型方法
        System.out.println(e.getClass().getSimpleName());
    }
    public<U> void eat(U u){} //错误，因为U没有声明
    public void run(M m){}

}
class Dog{}
