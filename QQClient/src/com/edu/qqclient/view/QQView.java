package com.edu.qqclient.view;

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
                            System.out.println("\t\t 9 退出系统");
                            System.out.println("请输入你的选择：");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    System.out.println("显示在线用户列表");
                                    break;
                                case "2":
                                    System.out.println("群发信息");
                                    break;
                                case "3":
                                    System.out.println("私聊信息");
                                    break;
                                case "4":
                                    System.out.println("发送文件");
                                    break;
                                case "9":
                                    System.out.println("退出系统");
                                    loop = false;
                                    break;
                            }
                        }
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
