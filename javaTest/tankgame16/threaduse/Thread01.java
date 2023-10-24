package com.javaTest.tankgame16.threaduse;

public class Thread01 {

    /*（1）
    public synchronized void start() {

        if (threadStatus != 0)
            throw new IllegalThreadStateException();

        group.add(this);

            boolean started = false;
                try {
                start0();//是本地方法，是JVM调用，底层是C/c++实现
                //真正实现多线程的效果：是start0()，而不是 run
                started = true;
            }
        }
            （2）
            private native void start0();
        */
    public static void main(String[] args) throws InterruptedException {
        //创建Cat对象，可以当作线程使用
        Cat cat = new Cat();
        cat.start();//启动线程 --》最终会执行cat的Run方法/
        //cat.run();//Run方法就是一个普通的方法，没有真正的启动一个线程，就会把run方法执行完毕，才向下执行。
        cat = new Cat();
        cat.start();//启动线程，--》最终会执行cat的Run方法
        //cat.run();
        //说明：当main线程启动了一个子线程Thread-0，主线程不会阻塞，会继续执行。
        //这时 主线程和子线程是交替执行的。。。。
        for (int i = 1; i <= 160; i++) {
            System.out.println("主线程 i=" +i + ",主线程名："+
                    Thread.currentThread().getName());
            //让主线程休眠
            Thread.sleep(1000);
        }

    }
}
//1.当一个类继承了Thread类，该类就可以当做线程使用；
//2.我们会重写run（），写上自己的业务代码
//3.run Thread类 实现了Runnable接口的run方法
/*@Override
public void run() {
    if (target != null) {
        target.run();
    }
}*/
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑

        //,super.run();

        while (true) {
            //该线程每隔一秒，在控制台输出"喵喵，我是小猫咪。。。"
            System.out.println("喵喵，我是小猫咪。。。"+ (++times) +
                    "，线程名称:" +Thread.currentThread().getName());
            //让该线程休眠一秒  ctrl + alt + t
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (times == 180) {
                break; //当打印了8次之后，退出while循环，也就是线程退出了。
            }
        }
    }

}