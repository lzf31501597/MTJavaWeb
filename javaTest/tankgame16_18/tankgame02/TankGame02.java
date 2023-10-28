package com.javaTest.tankgame16_18.tankgame02;

import javax.swing.*;

public class TankGame02 extends JFrame {
    //定义画板 MyPanel
    MyPanel myPanel = null;

    public static void main(String[] args) {
        TankGame02 tankGame02 = new TankGame02();
    }

    public TankGame02() {
        myPanel = new MyPanel();
        this.add(myPanel); //把画板添加到游戏绘图区域
        this.setSize(1000, 750);
        this.addKeyListener(myPanel);//让JFrame监听键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
