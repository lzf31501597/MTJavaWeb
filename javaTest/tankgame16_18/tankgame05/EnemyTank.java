package com.javaTest.tankgame16_18.tankgame05;

import java.util.Vector;

@SuppressWarnings("all")
public class EnemyTank extends Tank implements Runnable{
    //定义一个shot对象，表示一个射击（线程）
    //Shot shot  = null;

    //敌人的坦克类，创建Vector 保存多个shot
    Vector<Shot> shots = new Vector<>();
    //增加成员，EnemyTank可以得到敌人坦克的Vector
    //1.Vector<EnemyTank> 是MyPanel的成员
    Vector<EnemyTank> enemyTanks = new Vector<>();
    boolean isLived = true;

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    //可以将MyPanel的成员 Vector<EnemyTank> enemyTanks = new Vector<>();
    //设置 EnemyTank 的成员的 enemyTanks
    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    //判断当前敌人坦克，是否和 enemyTanks 中的其他坦克是否发生了重叠或者碰撞
    public boolean isTouchEnemyTank(){
        //判断敌人当前坦克this 方向
        switch (this.getDirect()){
            case 0://上
                //让当前敌人坦克和其他所有敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector<EnemyTank> 中去除一个敌人的坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //1.如果敌人坦克时向下和上， x的范围（enemyTank.getX(), enemyTank.getX()+40）
                        //                      y的范围（enemyTank.getY(), enemyTank.getY()+40）
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //2.当前坦克 左上角的坐标【this.getX(), this.getY()】
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX()+40
                                    && this.getY() >=enemyTank.getY() && this.getY() <= enemyTank.getY() +40) {
                                return true;
                            }
                            //3.当前坦克 右上角的坐标【this.getX()+40, this.getY()】
                            if (this.getX()+40 >= enemyTank.getX() && this.getX()+40 <= enemyTank.getX()+40
                                    && this.getY() >=enemyTank.getY() && this.getY() <= enemyTank.getY() +40) {
                                return true;
                            }
                        }
                        //1。如果敌人坦克时向右和左， x的范围（enemyTank.getX(), enemyTank.getX()+40）
                        //                      y的范围（enemyTank.getY(), enemyTank.getY()+40）
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() ==3) {
                            //2.当前坦克 左上角的坐标【this.getX(), this.getY()】
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX()+40
                                    && this.getY() >=enemyTank.getY() && this.getY() <= enemyTank.getY() +40) {
                                return true;
                            }
                            //1.当前坦克 右上角的坐标【this.getX()+40, this.getY()】
                            if (this.getX()+40 >= enemyTank.getX() && this.getX()+40 <= enemyTank.getX()+40
                                    && this.getY() >=enemyTank.getY() && this.getY() <= enemyTank.getY() +40) {
                                return true;
                            }
                        }
                    }

                }
                break;
            case 1:
                //让当前敌人坦克和其他所有敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector<EnemyTank> 中去除一个敌人的坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //1.如果敌人坦克时向下和上， x的范围（enemyTank.getX(), enemyTank.getX()+40）
                        //                      y的范围（enemyTank.getY(), enemyTank.getY()+40）
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //2.当前坦克 右上角的坐标【this.getX()+40, this.getY()】
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3.当前坦克 右下角的坐标【this.getX()+40, this.getY()+40】
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY()+ 40 >= enemyTank.getY() && this.getY() + 40<= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                        //1。如果敌人坦克时向右和左， x的范围（enemyTank.getX(), enemyTank.getX()+40）
                        //                      y的范围（enemyTank.getY(), enemyTank.getY()+40）
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //2.当前坦克 右上角的坐标【this.getX() +40, this.getY()】
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3.当前坦克 右下角的坐标【this.getX()+40, this.getY()+40】
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2:
                //让当前敌人坦克和其他所有敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector<EnemyTank> 中去除一个敌人的坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //1.如果敌人坦克时向下和上， x的范围（enemyTank.getX(), enemyTank.getX()+40）
                        //                      y的范围（enemyTank.getY(), enemyTank.getY()+40）
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //2.当前坦克 左下角的坐标【this.getX(), this.getY()+40】
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3.当前坦克 右下角的坐标【this.getX()+40, this.getY()+40】
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                        //1。如果敌人坦克时向右和左， x的范围（enemyTank.getX(), enemyTank.getX()+40）
                        //y的范围（enemyTank.getY(), enemyTank.getY()+40）
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //2.当前坦克 左下角的坐标【this.getX() , this.getY()+40】
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3.当前坦克 右下角的坐标【this.getX()+40, this.getY()+40】
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3:
                //让当前敌人坦克和其他所有敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    //从Vector<EnemyTank> 中去除一个敌人的坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //不和自己比较
                    if (enemyTank != this) {
                        //1.如果敌人坦克时向下和上， x的范围（enemyTank.getX(), enemyTank.getX()+40）
                        //y的范围（enemyTank.getY(), enemyTank.getY()+40）
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            //2.当前坦克 左上角的坐标【this.getX(), this.getY()】
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3.当前坦克 左下角的坐标【this.getX(), this.getY()+40】
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                        //1。如果敌人坦克时向右和左， x的范围（enemyTank.getX(), enemyTank.getX()+40）
                        //y的范围（enemyTank.getY(), enemyTank.getY()+40）
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            //2.当前坦克 左上角的坐标【this.getX(), this.getY()】
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //3.当前坦克 左下角的坐标【this.getX(), this.getY()+40】
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public void run() {
        //Shot s = null;
        while (true){
            //判断我们如果 shots size()=0，创建一颗子弹，放入到shots集合中，并启动
            //if (shots.size() == 0 && isLived) {
            if (isLived && shots.size() < 2) {
                Shot s = null;
                //判断坦克的方向，创建对应的子弹
                switch (getDirect()){
                    case 0: //上
                        s = new Shot(getX()+20, getY(), 0);
                        break;
                    case 1: //右
                        s = new Shot(getX()+40, getY()+20, 1);
                        break;
                    case 2: //下
                        s = new Shot(getX()+20, getY()+40, 2);
                        break;
                    case 3: //左
                        s = new Shot(getX(), getY()+20, 3);
                        break;
                }
                shots.add(s);
            }

            //根据坦克的方向来继续移动
            switch (getDirect()){
                case 0://上
                    //moveUp();
                    //让坦克保持一个方向，走30步
                    for (int i = 0; i < 30; i++) {
                        //moveUp();
                        if (getY() > 0 && !isTouchEnemyTank()) {
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
                        if (getX()+40 < 1000 && !isTouchEnemyTank()) {
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
                        if (getY() + 40 < 650 && !isTouchEnemyTank()) {
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
                        if (getX() > 0 && !isTouchEnemyTank()) {
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


            //然后随机改变坦克方向 0-3
            setDirect((int) (Math.random() * 4));
            //setDirect(2);
            //写并发程序，一定要考虑清楚，该线程什么时候结束*****************
            if (!isLived) {
                break; //退出线程
            }

        }
    }
}
