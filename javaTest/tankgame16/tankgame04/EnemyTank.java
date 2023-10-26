package com.javaTest.tankgame16.tankgame04;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable{
    //定义一个shot对象，表示一个射击（线程）
    Shot shot = null;
    //敌人的坦克类，创建Vector 保存多个shot
    Vector<Shot> shots = new Vector<>();
    boolean isLived = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true){
            //根据坦克的方向来继续移动
            switch (getDirect()){
                case 0://上
                    //moveUp();
                    //让坦克保持一个方向，走30步
                    for (int i = 0; i < 30; i++) {
                        //moveUp();
                        if (getY() > 0) {
                            moveUp();
                        }

                        //休眠50ms
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 1://右
                    //moveRight();
                    //让坦克保持一个方向，走30步
                    for (int i = 0; i < 30; i++) {
                        //moveRight();
                        if (getX()+40 < 1000) {
                            moveRight();
                        }

                        //休眠50ms
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2://下
                    //moveDown();
                    //让坦克保持一个方向，走30步
                    for (int i = 0; i < 30; i++) {
                       //moveDown();
                        if (getY() + 40 < 700) {
                            moveDown();
                        }
                        //休眠50ms
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3://左
                    //moveLeft();
                    //让坦克保持一个方向，走30步
                    for (int i = 0; i < 30; i++) {
                        //moveLeft();
                        if (getX() > 0) {
                            moveLeft();
                        }
                        //休眠50ms
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }

            /*//休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            //然后随机改变坦克方向 0-3
            setDirect((int) (Math.random() * 4));
            //setDirect(2);
            //写并发程序，一定要考虑清楚，该线程什么时候结束
            if (!isLived) {
                break; //退出线程
            }

        }
    }
}
