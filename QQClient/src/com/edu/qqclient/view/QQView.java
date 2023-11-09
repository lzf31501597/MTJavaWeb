package com.edu.qqclient.view;

import com.edu.qqclient.service.FileClientService;
import com.edu.qqclient.service.MessageClientService;
import com.edu.qqclient.service.UserClientService;
import com.edu.qqclient.utils.Utility;
import org.junit.jupiter.api.Test;

/**
 * @author
 * @version 1.0
 * @date 2023/11/04 17:14
 * @Description
 */
public class QQView {
    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("客户端退出系统。。。");
    }
    private boolean loop = true;//控制是否显示菜单
    private String key = "";//接收用户的键盘输入
    private UserClientService userClientService = new UserClientService();//对象UserClientService(用于用户登录、注册)
    private MessageClientService messageClientService = new MessageClientService();//对象用户私聊、群聊
    private FileClientService fileClientService = new FileClientService();//对象用于传输文件

    //显示主菜单
    public void mainMenu(){

        while (loop){
            System.out.println("=================欢迎登录网络通信系统==================");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.println("请输入你的选择：");

            key = Utility.readString(1);

            //根据用户的输入，来处理不同的逻辑
            switch (key){
                case "1":
                    //System.out.println("登录系统");
                    System.out.println("请输入用户号：");
                    String userId = Utility.readString(50);
                    System.out.println("请输入密  码：");
                    String pwd = Utility.readString(50);

                    //需要到服务端去验证用户是否合法
                    //UserClientService(用户登录、注册)
                    if (userClientService.checkUser(userId, pwd)) {
                        System.out.println("=================欢迎（用户" + userId + "）==================");
                        //进入到二级菜单
                        while (loop) {
                            System.out.println("\n=================网络通信系统二级菜单（用户:" + userId + "）==================");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发信息");
                            System.out.println("\t\t 3 私聊信息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 5 离线私聊信息");
                            System.out.println("\t\t 6 离线发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.println("请输入你的选择：");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    //System.out.println("显示在线用户列表");
                                    userClientService.onlineFriendList();
                                    break;
                                case "2":
                                    //System.out.println("群发信息");
                                    System.out.println("请输入想和大家说的话：");
                                    String content2 = Utility.readString(100);
                                    //调用将消息发送给服务器的方法
                                    messageClientService.sendMessageToAll(content2, userId);
                                    break;
                                case "3":
                                    //System.out.println("私聊信息");
                                    System.out.println("请输入想聊天的客户号（在线）：");
                                    String getterId = Utility.readString(50);
                                    System.out.println("请输入想说的话：");
                                    String content = Utility.readString(100);

                                    //调用将消息发送给服务器的方法
                                    messageClientService.sendMessageToOne(content, userId, getterId);

                                    break;
                                case "4":
                                    //System.out.println("发送文件");
                                    System.out.println("请输入想把文件发送的用户（在线）：");
                                    getterId = Utility.readString(50);
                                    System.out.println("请输入想发送文件的路劲：（../pg.png）");
                                    String fileSrc = Utility.readString(100);
                                    System.out.println("请输入想发送文件的目标路劲：（./pg.png）");
                                    String fileDest = Utility.readString(100);
                                    fileClientService.sendFileToOne(fileSrc, fileDest, userId, getterId);
                                    break;
                                case "5":
                                    //System.out.println("离线私聊信息");
                                    System.out.println("请输入想聊天的客户号（在线）：");
                                    getterId = Utility.readString(50);
                                    System.out.println("请输入想说的话：");
                                    content = Utility.readString(100);

                                    //调用将消息发送给服务器的方法
                                    messageClientService.sendMessageOffLineToOne(content, userId, getterId);

                                    break;
                                case "6":
                                    //System.out.println("离线发送文件");
                                    System.out.println("请输入想把文件发送的用户（在线）：");
                                    getterId = Utility.readString(50);
                                    System.out.println("请输入想发送文件的路劲：（../pg.png）");
                                    fileSrc = Utility.readString(100);
                                    System.out.println("请输入想发送文件的目标路劲：（./pg.png）");
                                    fileDest = Utility.readString(100);
                                    fileClientService.sendFileToOne(fileSrc, fileDest, userId, getterId);
                                    break;
                                case "9":
                                    //调用退出方法，给服务器发送一个退出系统的message
                                    //System.out.println("退出系统");
                                    userClientService.logout();
                                    loop = false;
                                    break;
                            }
                        }
                        ///Users/dreamtank77/IdeaProjects/QQClient/src/com/edu/qqclient/view/高山流水.mp3
                        ///Users/dreamtank77/高山流水.mp3
                    }else {
                        System.out.println("=================登录系统失败==================");
                    }

                    break;

                case "9":
                    System.out.println("退出系统");
                    loop = false;
                    break;
            }
        }
    }
}
