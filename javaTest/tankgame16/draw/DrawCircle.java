package com.javaTest.tankgame16.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {//JFrame对应窗口，可以理解成是一个画框
    //定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序。。。。");
    }
    //

    public DrawCircle() {//构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口（画框）
        this.add(mp);
        //设置窗口大小
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

//1.先定义一个MyPanel类，继承JPanel，画图形，就在画板上面
class MyPanel extends JPanel {
    /*
     * 1.MyPanel 对象就是一个画板；
     * 2.Graphics g 把g 理解成一支画笔；
     * 3.Graphics类 提供了很多绘图方法；
     * */
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化

        System.out.println("paint(Graphics g) 被调用。。。。。");
        //画一个离左顶点（0，0），下：10；右：10；（坐标10，10），作为起点下右直径为100的圆
        //g.drawOval(10, 10, 100, 100);

        //演示绘制不同的图形..
        //画直线 drawLine(int x1,int y1,int x2,int y2)
        //g.drawLine(10, 10, 100, 100);

        //画矩形边框 drawRect(int x, int y, int width, int height)
        //g.drawRect(10, 10, 100, 100);

        //画椭圆边框 drawOval(int x, int y, int width, int height)
        //填充矩形 fillRect(int x, int y, int width, int height)
        //设置画笔的颜色
        //g.setColor(Color.blue);
        //g.fillRect(10, 10, 100, 100);

        //填充椭圆 fillOval(int x, int y, int width, int height)
        //g.setColor(Color.red);
        //g.fillOval(10, 10, 100, 100);

        //画图片 drawImage(Image img, int x, int y, ..)
        //1. 获取图片资源, /bg.png 表示在该项目的根目录去获取 bg.png 图片资源
        //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
        //g.drawImage(image, 10, 10, 175, 221, this);


        //给画笔设置颜色和字体
        //设置画笔的颜色 setColor(Color c)
        g.setColor(Color.red);
        //设置画笔的字体 setFont(Font font)
        g.setFont(new Font("宋体", Font.BOLD, 50));
        //画字符串 drawString(String str, int x, int y)//写字
        g.drawString("北京你好", 100, 100);//这里设置的 100， 100， 是 "北京你好"左下角


    }
}