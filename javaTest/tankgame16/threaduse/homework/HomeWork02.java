package com.javaTest.tankgame16.threaduse.homework;

public class HomeWork02 {
    public static void main(String[] args) {
        DrawMoney drawMoney = new DrawMoney();
        Thread thread = new Thread(drawMoney);
        Thread thread1 = new Thread(drawMoney);
        thread.setName("t1");
        thread1.setName("t2");
        thread.start();
        thread1.start();
    }
}

//编程取款线程
//因为这里涉及到多个线程共享资源，所以我们使用实现Runnable方式
class DrawMoney implements Runnable {
    private int money = 10000;
    private boolean loop = true;

    @Override
    public void run() {

        while (loop) {
            /*
            * 1.这里使用 synchronized 实现了线程同步
            * 2.当多个线程执行到这里，就会去争夺this对象锁
            * 3.哪个线程争夺（获取）this对象锁，就执行 synchronized 代码块，执行完后，会释放
            * 4.争夺不到this对象锁，就blocked，准备继续争夺
            * 5.this对象锁是 非公平锁
            * */
            synchronized (this) {
                //判断余额是否足够
                if (money <= 0) {
                    System.out.println("余额不足。。。。");
                    loop = false;
                    break;
                }
                money -= 1000;
                System.out.println(Thread.currentThread().getName() + " 取出了1000元，还剩" + money + "钱");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }
}