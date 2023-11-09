package com.edu.qqserver.service;


import com.edu.qqcommon.Message;
import com.edu.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author
 * @version 1.0
 * @date 2023/11/09 14:10
 * @Description 推送新闻给所有用户
 */
public class SendNewsToAllService implements Runnable{

    @Override
    public void run() {

        //可以推送多次新闻
        while (true) {
            System.out.println("请输入服务器要推送的新闻、消息[exit:退出]。。。");
            String news = Utility.readString(100);

            if (news.equals("exit")) {
                break;
            }
            //构建一个群发Message对象
            Message message = new Message();
            message.setSender("服务器");
            message.setMesType(MessageType.MESSAGE_TO_ALL_MES);
            message.setContent(news);
            message.setSentTime(new Date().toString());

            System.out.println("服务器推送新闻给所有人 说：" + news);

            ObjectOutputStream objectOutputStream = null;
            //遍历所有的通信线程，获取socket，并转发message
            HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();
            Set<String> keySet = hm.keySet();
            Iterator<String> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                String userId = iterator.next().toString();
                try {
                    objectOutputStream = new ObjectOutputStream(ManageClientThreads.getServerConnectClientThread(userId).getSocket().getOutputStream());
                    objectOutputStream.writeObject(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
