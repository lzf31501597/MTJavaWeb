package com.javaTest.tankgame16.threaduse.homework;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        ForPrint forPrint = new ForPrint();
        Keyboard keyboard = new Keyboard(forPrint);
        forPrint.start();
        keyboard.start();


    }


}
class ForPrint extends Thread{
    private boolean loop = true;
    @Override
    public void run() {

        while (loop) {
            System.out.println("100以内的随机数：" + (int)(Math.random() * 100 +1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ForPrinta 线程退出。。。");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class Keyboard extends Thread{
    private ForPrint forPrint;
    private Scanner scanner = new Scanner(System.in);

    public Keyboard(ForPrint forPrint) {
        this.forPrint = forPrint;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入Q字符：");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') { //以通知的方式结束 ForPrint 进程
                forPrint.setLoop(false);
                System.out.println("Keyboard 线程退出。。。");
                break;
            }
        }
    }


}