package com.edu.qqclient.service;

import java.util.HashMap;

/**
 * @author
 * @version 1.0
 * @date 2023/11/08 10:42
 * @Description 管理客户端连接到服务器端的线程类
 */
public class ManageClientConnectServerThread {
    //创建多线程HashMap集合，key是用户ID，value就是线程
    private static HashMap<String, ClientConnectServerThread> hm = new HashMap<>();
    //将某个线程加入到集合
    public static void addClientConnectServerThread(String userId, ClientConnectServerThread clientConnectServerThread){
        hm.put(userId, clientConnectServerThread);
    }
    //通过userId 可以得到对应线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId) {
        return hm.get(userId);
    }
}
