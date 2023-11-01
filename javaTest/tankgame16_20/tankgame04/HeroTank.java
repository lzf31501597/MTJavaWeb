package com.javaTest.tankgame16_18.tankgame04;


public class HeroTank extends Tank {
    //定义一个shot对象，表示一个射击（线程）
    Shot shot = null;

    /*//可以发射多颗子弹
    Vector<Shot> shots = new Vector<>();*/

    public HeroTank(int x, int y) {
        super(x, y);
    }

    //射击
    public void shotEnemyTank(){
        /*//发射多颗子弹怎么办？ 在控制面板上，控制只画出5颗子弹
        if (shots.size() == 5) {
            return;
        }*/

        //创建 Shot对象，根据当前 HeroTank对象的位置和方向来创建Shot
        switch (getDirect()){
            case 0://上
                shot = new Shot(getX() + 20, getY() , 0);
                break;
            case 1://右
                shot = new Shot(getX() + 40, getY() + 20, 1);
                break;
            case 2://下
                shot = new Shot(getX() + 20, getY() + 40, 2);
                break;
            case 3://左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        //把新建的shot放入shots集合中
        //shots.add(shot);
        //启动shot进程
        new Thread(shot).start();
    }
}
