package com.javaTest.tankgame16_20.events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BallMove extends JFrame{
    //演示小球通过键盘上下左右移动--》讲解java的事件控制
    MyPanel myPanel = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();

    }

    public BallMove() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(400,300);
        //窗口Jframe，对象可以监听键盘事件
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//画板，画出小球
//KeyListener 是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener, MouseListener, WindowListener {
    //为了让小球可以移动，把他的左上角的坐标（x，y）设置变量
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(x, y, 20, 20);//默认黑色
    }

    //有键盘字符输出时，该方法会触发。
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当键盘某个键按下时，该方法会触发。
    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println((char) e.getKeyCode() + "被按下。。");
        //根据用户按下的不同建，来处理小球的移动（上下左右键）
        //在java中，会给每个键盘分配一个值（int）
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {//KeyEvent.VK_DOWN 就是向下的箭头对应的code
            y++;
        }else if(e.getKeyCode() == KeyEvent.VK_UP) {//KeyEvent.VK_DOWN 就是向下的箭头对应的code
            y--;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {//KeyEvent.VK_DOWN 就是向下的箭头对应的code
            x--;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {//KeyEvent.VK_DOWN 就是向下的箭头对应的code
            x++;
        }

        //让面板重绘
        this.repaint();
    }

    //当键盘某个键释放（松开）时，该方法会触发。
    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
