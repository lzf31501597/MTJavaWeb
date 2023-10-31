package com.javaTest.tankgame16_18.tankgame05;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//为了监听键盘事件，实现KeyListener
//为了让MyPanel不停地重绘子弹，需要将MyPanel 实现Runnable,当做一个线程使用
@SuppressWarnings("all")
public class MyPanel extends JPanel implements KeyListener,Runnable {
    //定义我的坦克
    HeroTank tank = null;

    //定义敌人的坦克,考虑多线程问题，降低人坦克放入 集合Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();

    //定义一个Vector用于存放炸弹
    //当子弹击中坦克时，加入一个Bomb对象到bombs集合
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    //定义三张图片，以展示爆炸效果状态
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {//初始化坦克
        tank = new HeroTank(500, 100);
        tank.setSpeed(8);//初始化坦克移动速度

        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //enemyTanks.add(new EnemyTank(100 *(i + 1), 0));
            //创建一个敌人的坦克
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);//设置敌人坦克的方向
            enemyTank.setSpeed(5);

            //启动敌人坦克线程，让他动起来
            new Thread(enemyTank).start();
            //给该 enemyTank 加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 40, enemyTank.getDirect());
            //将子弹加入到EnemyTank类的Vector集合
            enemyTank.shots.add(shot);
            //启动shot对象
            new Thread(shot).start();

            enemyTanks.add(enemyTank);//加入坦克集合

        }
        //初始化爆炸图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 650);//填充矩形，默认是黑色
        g.setColor(Color.WHITE);

        if (tank != null && tank.islived) {
            //画出坦克--封装方法
            drawTank(tank.getX(), tank.getY(), g, tank.getDirect(), 0);
        }


        //画出tank射出的子弹坐标轨迹
        if (tank.shot != null && tank.shot.isLived) {
            System.out.println("子弹被绘制...");
            //g.fill3DRect(tank.shot.x, tank.shot.y, 3,3, false);
            g.draw3DRect(tank.shot.x, tank.shot.y, 2,2, false);

        }
        /*//将tank的子弹集合 shots，遍历取出绘制
        for (int i = 0; i < tank.shots.size(); i++) {
            Shot shot = tank.shots.get(i);
            if (shot != null && shot.isLived) {
                g.draw3DRect(shot.x, shot.y, 2, 2, false);
                tank.setSpeed(5);

            } else {//如果该shot对象已经无效，就从shots集合中拿掉
                tank.shots.remove(shot);
            }

        }*/
        //画出敌人的坦克，遍历Vector
        //drawTank(tank.getX()+60, tank.getY(), g, tank.getDirect(), 1);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLived) {//当敌人坦克是存活的，才画出该坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);

                //画出 敌人enemyTank 所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);//取出子弹
                    //绘制子弹的运动轨迹
                    if (shot.isLived) {//默认 isLived=true
                        g.draw3DRect(shot.x, shot.y, 2, 2, false);
                    } else {
                        //从Vector 移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }

        //如果bombs 集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb对象的life值，去画出对应的图片
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 40, 40, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 40, 40, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 40, 40, this);
            }
            //让炸弹的生命值减少
            bomb.lifeDown();
            //如果 bomb life为0，就从bombs集合中去除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
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

    //判断我方的子弹(单颗)是否打中敌人的坦克
    //什么时候判断，我方子弹是否击中敌人坦克？ run方法
    //public void hitTank(Vector shots, Tank tank1){
    public void hitTank(Shot shot, Tank tank1) {

        //判断s 击中坦克
        switch (tank1.getDirect()) {
            case 0://坦克向上
            case 2://坦克向下
                if (shot.x > tank1.getX() && shot.x < tank1.getX() + 40
                        && shot.y > tank1.getY() && shot.y < tank1.getY() + 40) {
                    shot.isLived = false;
                    tank1.islived = false;//只是没有把坦克画出来，但是坦克集合里面没有去除

                    //坦克爆炸了，再往同一个地方射击的话，还是会爆炸效果
                    //当我的子弹击中敌人坦克后，将enemyTank从 enemyTanks 去除
                    enemyTanks.remove(tank1);

                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(tank1.getX(), tank1.getY());
                    bombs.add(bomb);
                }
                break;
            case 1://坦克向右
            case 3://坦克向左
                if (shot.x > tank1.getX() && shot.x < tank1.getX() + 40
                        && shot.y > tank1.getY() && shot.y < tank1.getY() + 40) {
                    shot.isLived = false;
                    tank1.islived = false;//只是没有把坦克画出来，但是坦克集合里面没有去除

                    //坦克爆炸了，再往同一个地方射击的话，还是会爆炸效果
                    //当我的子弹击中敌人坦克后，将enemyTank从 enemyTanks 去除
                    enemyTanks.remove(tank1);

                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(tank1.getX(), tank1.getY());
                    bombs.add(bomb);
                }
                break;
        }


    }
    //如果我们的坦克能发射多颗子弹
    //再判断我方子弹是否击中敌人坦克时，就需要把我们的子弹集合中的所有子弹，
    //都取出和敌人所有坦克，进行判断
    public void hitEnemyTank(){
        /*for (int j = 0; j < tank.shots.size(); j++) {
            Shot shot = tank.shots.get(j);
            //判断是否击中了敌人的坦克
            if (shot != null && shot.isLived) {//我的坦克子弹还活着

                //遍历敌人的坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(shot, enemyTank);
                }
            }
        }*/
        //判断是否击中了敌人的坦克
        if (tank.shot != null && tank.shot.isLived) {//我的坦克子弹还活着

            //遍历敌人的坦克
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(tank.shot, enemyTank);
            }
        }

    }

    //判断敌人坦克子弹是否击中我方坦克
    public void hitHeroTank(){
        //遍历敌人所有的坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出敌人的坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历敌人坦克所有的子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //判断 shot 是否击中我的坦克
                if (tank.islived && shot.isLived) {
                    hitTank(shot, tank);
                }
            }
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理上下左右按键 wsad 情况
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下W键
            //改变坦克的方向
            tank.setDirect(0);
            //修改坦克移动坐标
            //tank.setY(tank.getY()-1);
            if (tank.getY() > 0) {
                tank.moveUp();
            }
        }else if (e.getKeyCode() == KeyEvent.VK_D) {//按下D键
            //改变坦克的方向
            tank.setDirect(1);
            if (tank.getX()+40 < 1000) {
                tank.moveRight();//修改坦克移动坐标
            }
        }else if (e.getKeyCode() == KeyEvent.VK_S) {//按下S键
            //改变坦克的方向
            tank.setDirect(2);
            if (tank.getY() + 40 < 650) {
                tank.moveDown();//修改坦克移动坐标
            }
        }else if (e.getKeyCode() == KeyEvent.VK_A) {//按下A键
            //改变坦克的方向
            tank.setDirect(3);
            if (tank.getX() > 0) {
                tank.moveLeft();//修改坦克移动坐标
            }
        }

        //如果用户按下是j，就发射单颗子弹
        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("用户按下了j，开始射击。。。");

            //判断tank的子弹是否销毁
            if (tank.shot == null || !tank.shot.isLived) {
                tank.shotEnemyTank();
            }

            //发射多颗子弹
            //tank.shotEnemyTank();
        }




        //让面板重绘
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每个100ms，重绘刷新面板区域，子弹才会移动
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断是否击中了敌人的坦克
            hitEnemyTank();
            //判断是否击中了我方的坦克
            hitHeroTank();
            /*//判断是否击中了敌人的坦克
            if (tank.shot != null && tank.shot.isLived) {//我的坦克子弹还活着

                //遍历敌人的坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(tank.shot, enemyTank);
                }
            }*/

            this.repaint();
        }


    }
}
