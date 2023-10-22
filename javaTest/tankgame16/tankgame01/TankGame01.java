package com.javaTest.tankgame16.tankgame01;

import javax.swing.*;

public class TankGame01 extends JFrame {
    //定义画板 MyPanel
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }

    public TankGame01()  {
        myPanel = new MyPanel();
        this.add(myPanel); //把画板添加到游戏绘图区域
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
