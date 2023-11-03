package com.javaTest.tankgame16_20.tankgame04;

public class Tank {
    private int direct; //direct 表示方向（0 向上，1向右，2向下，3向左）
    private int x;//横坐标
    private int y;//纵坐标
    private int speed = 2;//坦克移动速度
    public boolean islived = true;

    //上右下左移动方法
    public void moveUp(){
        y -= speed;
    }
    public void moveRight(){
        x += speed;
    }
    public void moveDown(){
        y += speed;
    }
    public void moveLeft(){
        x -= speed;
    }


    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
