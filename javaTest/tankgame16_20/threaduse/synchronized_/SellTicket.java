package com.javaTest.tankgame16_20.threaduse.synchronized_;

public class SellTicket {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //1).通过继承Thread类 方式，总是需要创建新的线程，因此每个窗口都售票100，没有来，
        //可以做成 static int tickets = 100；也会存在问题
//        SellTicket1 sellTicket1 = new SellTicket1();
//        SellTicket1 sellTicket2 = new SellTicket1();
//        SellTicket1 sellTicket3 = new SellTicket1();
//        sellTicket1.start();
//        sellTicket2.start();
//        sellTicket3.start();

        //2).通过实现Runnable接口 方式，（会多卖两张票）
//        SellTicket2 sellTicket21 = new SellTicket2();
//        new Thread(sellTicket21).start();
//        new Thread(sellTicket21).start();
//        new Thread(sellTicket21).start();
        //3).通过实现Runnable接口 方式和，使用 synchronized实现线程同步
        SellTicket3 sellTicket3 = new SellTicket3();
        new Thread(sellTicket3).start();
        new Thread(sellTicket3).start();
        new Thread(sellTicket3).start();
    }
}


//实现Runnable接口方式,使用 synchronized实现线程同步
class SellTicket3 implements Runnable {

    private int ticketNum = 100;//多线程共享余票
    private boolean loop = true;//控制run方法循环的变量

    Object object = new Object();

    //同步方法（静态的）的锁为当前类本身
    //1.public synchronized static void m1(){} 锁是加在SellTicket3.class
    //2.如果在静态方法中，实现一个同步代码块
    /*
        synchronized (SellTicket3.class){
            System.out.println("m2()");
    }*/
    public synchronized static void m1(){

    }
    public static void m2(){
        synchronized (SellTicket3.class){
            System.out.println("m2()");
        }
    }

    //1.public synchronized void sellTickets() {}就是一个同步方法
    //2.这时锁在this对象
    //3、也可以在代码块上写 synchronized---同步代码块，互斥锁还是在this对象上
    public /*synchronized*/ void sellTickets() { //同步方法，在同一时刻，只能有一个线程来执行 sellTickets() 方法
//        while (true){
//            if (ticketNum <= 0) {
//                System.out.println("SellTicket3 售票结束。。。。");
//                return;
//            }
        synchronized (/*this/new Object()*/ object) {
            if (ticketNum <= 0) {
                System.out.println("SellTicket3 售票结束。。。。");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口：" + Thread.currentThread().getName()
                    + "卖了一张票，剩余票数：" + (--ticketNum));
        }
    }
    // }

    @Override
    public void run() {
//        sellTickets();
        while (loop) {
            sellTickets();
        }
    }
}

class SellTicket1 extends Thread {

    private int ticketNum = 100;//多线程共享余票，

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("SellTicket1 售票结束。。。。");
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口：" + Thread.currentThread().getName()
                    + "卖了一张票，剩余票数：" + (--ticketNum));
        }
    }
}

class SellTicket2 implements Runnable {

    private int ticketNum = 100;//多线程共享余票

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("SellTicket2 售票结束。。。。");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口：" + Thread.currentThread().getName()
                    + "卖了一张票，剩余票数：" + (--ticketNum));
        }
    }
}