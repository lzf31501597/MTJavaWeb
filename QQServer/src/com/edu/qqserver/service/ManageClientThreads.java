package com.edu.qqserver.service;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author
 * @version 1.0
 * @date 2023/11/08 14:37
 * @Description 用于管理与客户端通信的线程
 */
public class ManageClientThreads {
    private static HashMap<String, ServerConnectClientThread> hm =new HashMap<>();
    //添加线程对象到hm集合


    public static HashMap<String, ServerConnectClientThread> getHm() {
        return hm;
    }

    public static void setHm(HashMap<String, ServerConnectClientThread> hm) {
        ManageClientThreads.hm = hm;
    }

    public static void addClientThread(String userId, ServerConnectClientThread serverConnectClientThread){
        hm.put(userId, serverConnectClientThread);
    }

    //根据 userId返回 ServerConnectClientThread线程
    public static ServerConnectClientThread getServerConnectClientThread(String userId) {
        return hm.get(userId);
    }
    //根据 userId删除集合中的线程
    public static void removeServerConnectClientThread(String userId) {
        hm.remove(userId);
    }

    //返回在线用户列表
    public static String getOnlineUsers(){
        //集合遍历，遍历HashMap的key
        Iterator<String> iterator = hm.keySet().iterator();
        String onlineUsersList = "";
        while (iterator.hasNext()){
            onlineUsersList += iterator.next().toString() + " ";
        }
        return onlineUsersList;
    }
}
