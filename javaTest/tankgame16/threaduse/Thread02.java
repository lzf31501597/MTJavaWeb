package com.javaTest.tankgame16.threaduse;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start();//这里不能调用start（）方法
        //创建了Thread对象，把Dog对象（实现 Runnable）放入Thread
        Thread thread = new Thread(dog);
        thread.start();
//        Tiger tiger = new Tiger();//实现了 Runnable
//        ThreadProxy threadProxy = new ThreadProxy(tiger);
//        threadProxy.start();
    }
}
class Animal{}
class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫。。。。。。");
    }
}
//线程代理类，模拟了一个极简的Thread类
class ThreadProxy implements Runnable {//可以把Proxy类当做ThreadProxy
    private Runnable target = null;//属性类型是Runnable
    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定Tiger
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }
    public void start(){
        start0();//这个方法是真正实现多线程方法
    }
    public void start0(){
        run();//
    }
}

class Dog implements Runnable{ //通过实现 Runnable接口，开发线程（静态代理模式）
    int times = 0;
    @Override
    public void run() {//普通方法
        while (true){
            System.out.println("小狗汪汪叫。。。。hi！！！ "+(++times) +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(1000);//休眠一秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            if (times == 10) {
                break;
            }
        }
    }
}