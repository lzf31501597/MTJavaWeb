package com.edu.qqclient.service;

import com.edu.qqcommon.Message;
import com.edu.qqcommon.MessageType;
import com.edu.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/04 17:55
 * @Description 该类完成用户登录验证和用户注册等功能
 */
public class UserClientService {
    //因为我们在其他地方，使用User信息，因此做出成员属性
    private User u = new User();
    //因为 Socket 在其他地方可能使用，，因此做出成员属性
    private Socket socket;

    //根据 userId 和 pwd 到服务器验证用户是否合法
    public boolean checkUser(String userId, String pwd){
        boolean b = false;
        //创建对象
        u.setUserId(userId);
        u.setPwd(pwd);

        //连接到服务器，发送U对象
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
            //得到 ObjectOutputStream 对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);//发送User对象

            //读取服务器返回的回复Message对象,
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream()); //登录成功
            Message ms = (Message) ois.readObject();

            if (ms.getMesTime().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {//登录成功

                //创建一个和服务器端保持通信的线程--》创建一个类 ClientConnectServerThead
                //
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                clientConnectServerThread.start();//启动线程
                //为了后面客户端的扩展，我们将线程放入到集合管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);
                b = true;

            }else {
                //如果登录失败，我们就不能启动和服务器通信的线程，关闭socket
                socket.close();
                //b = false;
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return b;
    }

}
