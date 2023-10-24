package com.javaTest.tankgame16.threaduse;

public class SellTicket {
    public static void main(String[] args) {
        //1).通过继承Thread类 方式，总是需要创建新的线程，因此每个窗口都售票100，没有来，
        //可以做成 static int tickets = 100；也会存在问题
        SellTicket1 sellTicket1 = new SellTicket1();
        SellTicket1 sellTicket2 = new SellTicket1();
        SellTicket1 sellTicket3 = new SellTicket1();
        sellTicket1.start();
        sellTicket2.start();
        sellTicket3.start();

        //2).通过实现Runnable接口 方式，（会多卖两张票）
//        SellTicket2 sellTicket21 = new SellTicket2();
//        new Thread(sellTicket21).start();
//        new Thread(sellTicket21).start();
//        new Thread(sellTicket21).start();
    }
}
class SellTicket1 extends Thread{

    private int ticketNum = 100;//多线程共享余票，
    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0) {
                System.out.println("SellTicket1 售票结束。。。。");
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口：" +Thread.currentThread().getName()
                    + "卖了一张票，剩余票数：" + (--ticketNum));
        }
    }
}
class SellTicket2 implements Runnable{

    private int ticketNum = 100;//多线程共享余票
    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0) {
                System.out.println("SellTicket2 售票结束。。。。");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口：" +Thread.currentThread().getName()
                    + "卖了一张票，剩余票数：" + (--ticketNum));
        }
    }
}