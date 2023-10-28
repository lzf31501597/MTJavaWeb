package com.javaTest.tankgame16_18.tankgame03;

public class HeroTank extends Tank {
    //定义一个shot对象，表示一个射击（线程）
    Shot shot = null;

    public HeroTank(int x, int y) {
        super(x, y);
    }

    //射击
    public void shotEnemyTank(){
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
        //启动shot进程
        new Thread(shot).start();
    }
}
