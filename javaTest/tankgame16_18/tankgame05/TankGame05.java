package com.javaTest.tankgame16_18.tankgame05;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class TankGame05 extends JFrame {
    //定义画板 MyPanel
    MyPanel myPanel = null;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        TankGame05 tankGame02 = new TankGame05();
    }

    public TankGame05() {
        System.out.println("请输入选择 1：新游戏 2：继续上局");
        String key = scanner.next();

        myPanel = new MyPanel(key);
        //将myPanel 放入到 Thread,并启动线程
        Thread threadTank = new Thread(myPanel);
        threadTank.start();

        this.add(myPanel); //把画板添加到游戏绘图区域
        this.setSize(1200, 650);
        this.addKeyListener(myPanel);//让JFrame监听键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //在JFrame 中增加相应的关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("监听到关闭窗口了。。。");
                Recorder.keepRecorder();
                //super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
