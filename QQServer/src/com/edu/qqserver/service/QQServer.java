package com.edu.qqserver.service;

import com.edu.qqcommon.Message;
import com.edu.qqcommon.MessageType;
import com.edu.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/08 11:10
 * @Description 服务器监听9999，等待客户端的链接，并保持通信
 */
public class QQServer {
    private ServerSocket ss = null;

    public QQServer() {
        try {
            System.out.println("服务器在9999端口监听。。。");
            ss = new ServerSocket(9999);
            //当和某个客户端连接后，用while循环保证持续监听，
            while (true) {
                Socket accept = ss.accept();
                //得到socket关联的对象输入流和输出流
                ObjectInputStream objectInputStream = new ObjectInputStream(accept.getInputStream());
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(accept.getOutputStream());

                User user = (User) objectInputStream.readObject();//读取客户端发送的User对象
                Message message = new Message();//创建对象，准备回复客户端
                //验证用户登录
                if (user.getUserId().equals("100") && user.getPwd().equals("123456")) {//登录成功
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将message对象回复客户端
                    objectOutputStream.writeObject(message);
                    //创建一个线程，与客户端保持通信，该线程需要持有socket对象

                }else {//登录失败

                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
