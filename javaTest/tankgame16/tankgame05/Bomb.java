package com.javaTest.tankgame16.tankgame05;

public class Bomb {
    int x, y; //爆炸坐标
    int life = 9; //炸弹生命周期
    boolean isLived = true; //是否还存活

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void lifeDown(){ //配合图片展示爆炸效果
        if (life > 0){
            life--;
        }else {
            isLived = false;
        }
    }
}
