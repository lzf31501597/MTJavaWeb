package com.javaTest.tankgame16_20.threaduse.method;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        Thread thread = new Thread(t3);
        //thread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("主线程 hi。。。。" + i);
            Thread.sleep(1000);
            if (i == 5) { //当主线程执行输出5次 hi
                thread.start();//立即启动子线程输出 hello。。。。
                thread.join();// 立即将t3子线程，插入带main主线程，让t3子线程先执行
            }
        }
        System.out.println(Thread.currentThread().getName() + "主线程结束。。。");
    }
}
class T3 implements Runnable {
    private int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("子线程 hello。。。。" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + "子线程结束。。。");
    }
    /*@Override
    public void run() {
        for (int i = 1; i <= 1; i++) {
            System.out.println("子线程 hello。。。。" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(Thread.currentThread().getName() + "子线程结束。。。");
    }*/
}