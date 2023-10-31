package com.javaTest.iostream19;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 16:58
 * @Description
 */
public abstract class Reader_ {//抽象类
    public void readFile(){
    }

    public void readString(){

    }

    //在抽象类Reader，使用read（）统一管理
    //后面在调用时，利于对象动态绑定机制，绑定到对应的实现子类即可。
    public abstract void read();
}
