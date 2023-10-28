package com.javaTest.tankgame16_18.threaduse.method;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread dt = new MyDaemonThread();
        //当希望main线程结束后，子线程dt也自动结束,将dt设置为守护线程即可;
        //如果没有设置，那么即使main 线程执行完毕，dt也不退出，可以体验一下
        dt.setDaemon(true);
        dt.start();
        for (int i = 1; i <= 10; i++) {//main线程
            Thread.sleep(500);
            System.out.println("宝强在辛苦的工作。。。。" + i);
        }
    }
}
class MyDaemonThread extends Thread{//子线程
    int count = 0;
    @Override
    public void run() {
        for (;;){//无限循环
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("马蓉和宋哲快乐聊天，哈哈哈哈哈哈" + (++count));
        }

    }
}