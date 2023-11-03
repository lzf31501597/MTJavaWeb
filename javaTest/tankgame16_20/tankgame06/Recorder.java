package com.javaTest.tankgame16_20.tankgame06;

import java.io.*;
import java.util.Vector;

/**
 * @author
 * @version 1.0
 * @date 2023/11/01 13:52
 * @Description HitEnemyTank统计被击毁数量
 */
@SuppressWarnings("all")
public class Recorder {
    //定义变量，记录我方击毁敌人坦克数
    private static int allHitEnemyTankNum = 0;

    //定义IO对象，准备写数据到和读数据文件中
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    //private static String filePath = "/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/tankgame16_18/tankgame05/";
    //private static String recorderFile = "./javaFile/myRecorder.txt";
    private static String recorderFile = "/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/tankgame16_18/tankgame06/myRecorder.txt";

    //定义Vector， 指向 MyPanel 对象的敌人坦克Vector
    private static Vector<EnemyTank> enemyTanks = null;

    //定义一个Node Vector， 用于保存敌人的信息node
    private static Vector<Node> nodes = new Vector<>();

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    //返回记录文件的路径
    public static String getRecorderFile() {
        return recorderFile;
    }

    //用于读取，恢复坦克相关信息
    //该方法，在继续上局的时候，调用即可
    public static Vector<Node> getNodesAndEnemyTankRec(){
        try {
            br = new BufferedReader(new FileReader(recorderFile));
            allHitEnemyTankNum = Integer.parseInt(br.readLine());

            //循环读取文件，生成nodes集合
            String line = "";
            while ((line = br.readLine()) != null){
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]),
                        Integer.parseInt(xyd[2]));
                nodes.add(node);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return nodes;
    }

    //当退出游戏时，我们将allEnemyTankNum 保存到 recorderFile
    //对keepRecorder 进行升级，保存敌人坦克的坐标和方向
    public static void keepRecorder(){
        try {
            bw = new BufferedWriter(new FileWriter(recorderFile));
            bw.write(allHitEnemyTankNum +"\r\n");

            //遍历敌人坦克的Vector， 然后根据情况保存即可
            //OOP,定义一个属性，然后通过SetXXX得到 敌人坦克的Vector
            for (int i = 0; i < enemyTanks.size(); i++) {
                //取出敌人的坦克
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLived){
                    //保存该enemyTank信息,
                    String record = enemyTank.getX()+" "+ enemyTank.getY()
                            +" "+enemyTank.getDirect();
                    bw.write(record +"\r\n" );
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static int getAllHitEnemyTankNum() {
        return allHitEnemyTankNum;
    }

    public static void setAllHitEnemyTankNum(int allHitEnemyTankNum) {
        Recorder.allHitEnemyTankNum = allHitEnemyTankNum;
    }

    //当我方坦克击毁敌人坦克，就应当 allHitEnemyTankNum++
    public static void addAllHitEnemyTankNum() {
        Recorder.allHitEnemyTankNum++;
    }
}
