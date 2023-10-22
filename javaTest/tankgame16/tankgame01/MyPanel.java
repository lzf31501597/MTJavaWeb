package com.javaTest.tankgame16.tankgame01;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    //定义我的坦克
    HeroTank tank = null;
    public MyPanel() {//初始化坦克
        tank = new HeroTank(100, 100);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认是黑色

        //画出坦克--封装方法
        drawTank(tank.getX(), tank.getY(), g, 0, 0);
        drawTank(tank.getX()+60, tank.getY(), g, 0, 1);
    }

    //编写画坦克方法，x:横坐标，y:纵坐标， g：画笔，direct：方向，type：坦克类型
    public void drawTank(int x, int y, Graphics g, int direct, int type){
        switch (type){
            case 0: //我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //我们的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克
        switch (direct){
            case 0:
                g.fill3DRect(x, y, 10,40, false);//坦克左轮子
                g.fill3DRect(x + 30, y, 10,40, false);//坦克右轮子
                g.fill3DRect(x + 10, y+10, 20,20, false);//坦克车身
                g.fillOval(x+10, y+10, 20, 20);//坦克炮筒圆盖
                g.drawLine(x+20, y+30, x+20, y);//坦克炮筒
                break;
            default:
                System.out.println("暂时没有处理。。。");
        }
    }
}
