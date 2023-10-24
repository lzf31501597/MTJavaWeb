package com.javaTest.tankgame16.threaduse.exit;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        t1.start();

        //如果希望main线程去控制t1线程终止，必须可以修改loop
        //让t1 退出方法，从而终止 t1线程- 》通知方式
        //System.out.println("main线程休眠10s");
        Thread.sleep( 10 * 1000);
        System.out.println("main线程休眠10s");
        t1.setLoop(false);
    }
}
class T1 extends Thread{
    private int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50); //让当前线程休眠50ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T1 运行中。。。。" + (++count));
        }
    }
}