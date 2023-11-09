package com.edu.qqclient.service;

import com.edu.qqcommon.Message;
import com.edu.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author
 * @version 1.0
 * @date 2023/11/08 18:01
 * @Description 该类对象，提供和消息相关的服务方法
 */
public class MessageClientService {
    //离线留言
    public void sendMessageOffLineToOne(String content,String senderId, String getterId){
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_OFFLINE_CONN_MES);//设置聊天信息的状态
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setContent(content);
        message.setSentTime(new Date().toString());//设置发送时间到message对象
        System.out.println(message.getSentTime()+": "+senderId + " 对 " + getterId + " 说：" + content);

        //发送给服务器
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //群聊发送的信息，发送者ID
    public void sendMessageToAll(String content,String senderId){
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_TO_ALL_MES);//设置聊天信息的状态
        message.setSender(senderId);
        message.setContent(content);
        message.setSentTime(new Date().toString());//设置发送时间到message对象
        System.out.println(message.getSentTime()+": "+senderId + " 对大家说：" + content);

        //发送给服务器
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //私聊发送的信息，发送者ID， 接收者ID
    public void sendMessageToOne(String content,String senderId, String getterId){
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CONN_MES);//设置聊天信息的状态
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setContent(content);
        message.setSentTime(new Date().toString());//设置发送时间到message对象
        System.out.println(message.getSentTime()+": "+senderId + " 对 " + getterId + " 说：" + content);

        //发送给服务器
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
