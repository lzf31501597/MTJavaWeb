package com.javaTest.tankgame16.threaduse.method;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("laohan");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        //主线程打印5个hi，就中断子线程
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi..." + i);
        }
        System.out.println(t.getName() + "线程的优先级：" + t.getPriority());
        t.interrupt();//当执行到这里，就会中断t线程的休眠
    }
}
class T extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " 吃包子。。。。。" + i);
        }

        try {
            System.out.println(Thread.currentThread().getName() + " 休眠中。。。。" );
            Thread.sleep(50000);
        } catch (InterruptedException e) {//InterruptedException 是捕获了一个中断异常
            //当线程执行到一个interrupt（）方式时，就会catch一个异常，可以加入自己的业务代码
            System.out.println(Thread.currentThread().getName() + " 被 interrupt 了" );
        }
    }
}
