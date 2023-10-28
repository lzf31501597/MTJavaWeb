package com.javaTest.tankgame16_18.threaduse.method;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName() + "线程（小弟） 吃了" + i +"包子。。。。。");
            if (i == 5) {
                System.out.println(Thread.currentThread().getName()+"主线程（小弟）让 子线程(老大)  先吃包子。。。。。");
                t2.join();// 相当于让t2线程先执行完毕
                System.out.println(Thread.currentThread().getName()+"子线程(老大) 吃完包子，主线程（小弟）接着吃包子 。。。。。");
            }
        }

    }
}
class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {//InterruptedException 是捕获了一个中断异常
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"子线程(老大) 吃了" + i +"包子。。。。。");
        }


    }
}