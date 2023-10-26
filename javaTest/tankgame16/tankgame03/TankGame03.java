package com.javaTest.tankgame16.tankgame03;

import javax.swing.*;

public class TankGame03 extends JFrame {
    //定义画板 MyPanel
    MyPanel myPanel = null;

    public static void main(String[] args) {
        TankGame03 tankGame02 = new TankGame03();
    }

    public TankGame03() {
        myPanel = new MyPanel();
        //将myPanel 放入到 Thread,并启动线程
        Thread threadTank = new Thread(myPanel);
        threadTank.start();

        this.add(myPanel); //把画板添加到游戏绘图区域
        this.setSize(1000, 750);
        this.addKeyListener(myPanel);//让JFrame监听键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
