package com.javaTest.tankgame16.tankgame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    HeroTank tank = null;

    //定义敌人的坦克,考虑多线程问题，降低人坦克放入 集合Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel() {//初始化坦克
        tank = new HeroTank(100, 100);
        tank.setSpeed(5);//初始化坦克移动速度
        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //enemyTanks.add(new EnemyTank(100 *(i + 1), 0));
            //创建一个敌人的坦克
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);//设置敌人坦克的方向
            enemyTank.setSpeed(5);
            enemyTanks.add(enemyTank);//加入坦克集合

        }

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认是黑色

        //画出坦克--封装方法
        drawTank(tank.getX(), tank.getY(), g, tank.getDirect(), 0);
        //画出敌人的坦克，遍历Vector
        //drawTank(tank.getX()+60, tank.getY(), g, tank.getDirect(), 1);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
        }

//        drawTank(tank.getX(), tank.getY(), g, 0, 0);
//        drawTank(tank.getX()+60, tank.getY(), g, 0, 1);

//        drawTank(tank.getX(), tank.getY()+60, g, 1, 0);
//        drawTank(tank.getX()+60, tank.getY()+60, g, 1, 1);
//
//        drawTank(tank.getX(), tank.getY()+120, g, 2, 0);
//        drawTank(tank.getX()+60, tank.getY()+120, g, 2, 1);
//
//        drawTank(tank.getX(), tank.getY()+180, g, 3, 0);
//        drawTank(tank.getX()+60, tank.getY()+180, g, 3, 1);

        //this.repaint();
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

        //根据坦克方向，来绘制对应方向的坦克
        //direct 表示方向（0 向上，1向右，2向下，3向左）
        switch (direct){
            case 0: //向上
                g.fill3DRect(x, y, 10,40, false);//坦克左轮子
                g.fill3DRect(x + 30, y, 10,40, false);//坦克右轮子
                g.fill3DRect(x + 10, y+10, 20,20, false);//坦克车身
                g.fillOval(x+10, y+10, 20, 20);//坦克炮筒圆盖
                g.drawLine(x+20, y+30, x+20, y);//坦克炮筒
                break;
            case 1: //1向右
                g.fill3DRect(x, y, 40, 10, false);//坦克左轮子
                g.fill3DRect(x, y + 30, 40, 10, false);//坦克右轮子
                g.fill3DRect(x + 10, y+10, 20, 20, false);//坦克车身
                g.fillOval(x+10, y+10, 20, 20);//坦克炮筒圆盖
                g.drawLine(x+30, y+20, x+40, y+20);//坦克炮筒
                break;
            case 2: //向下
                g.fill3DRect(x, y, 10,40, false);//坦克左轮子
                g.fill3DRect(x + 30, y, 10,40, false);//坦克右轮子
                g.fill3DRect(x + 10, y+10, 20,20, false);//坦克车身
                g.fillOval(x+10, y+10, 20, 20);//坦克炮筒圆盖
                g.drawLine(x+20, y+30, x+20, y+40);//坦克炮筒
                break;
            case 3: //向左
                g.fill3DRect(x, y, 40, 10, false);//坦克左轮子
                g.fill3DRect(x, y + 30, 40, 10, false);//坦克右轮子
                g.fill3DRect(x + 10, y+10, 20, 20, false);//坦克车身
                g.fillOval(x+10, y+10, 20, 20);//坦克炮筒圆盖
                g.drawLine(x+30, y+20, x, y+20);//坦克炮筒
                break;
            default:
                System.out.println("暂时没有处理。。。");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理上下左右按键 wsad 情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下W键
            //改变坦克的方向
            tank.setDirect(0);
            //修改坦克移动坐标
            //tank.setY(tank.getY()-1);
            tank.moveUp();
        }else if (e.getKeyCode() == KeyEvent.VK_D) {//按下D键
            //改变坦克的方向
            tank.setDirect(1);
            tank.moveRight();//修改坦克移动坐标
        }else if (e.getKeyCode() == KeyEvent.VK_S) {//按下S键
            //改变坦克的方向
            tank.setDirect(2);
            tank.moveDown();//修改坦克移动坐标
        }else if (e.getKeyCode() == KeyEvent.VK_A) {//按下A键
            //改变坦克的方向
            tank.setDirect(3);
            tank.moveLeft();//修改坦克移动坐标
        }

        //让面板重绘
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
