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

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {//登录成功

                //创建一个和服务器端保持通信的线程--》创建一个类 ClientConnectServerThead
                //
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                clientConnectServerThread.start();//启动客户端线程
                //为了后面客户端的扩展，我们将线程放入到集合管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);
                b = true;

            }/*else if (ms.getMesType().equals(MessageType.MESSAGE_CONN_MES)){//普通聊天信息
                System.out.println("\n" +ms.getSender() + " 对 " + ms.getGetter()
                        + " 说： " + ms.getContent());

            }*/else {
                //如果登录失败，我们就不能启动和服务器通信的线程，关闭socket
                socket.close();
                //b = false;
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return b;
    }

    //向服务器请求在线的用户列表
    public void onlineFriendList(){
        //发送一个 Message，类型 MESSAGE_GET_ONLINE_FRIEND = "4"
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserId());

        try {
            //从管理线程的集合中，通过userId ，得到这个线程对象
            ClientConnectServerThread clientConnectServerThread = ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId());
            //通过得到这个线程对象得到关联的Socket
            Socket socket = clientConnectServerThread.getSocket();
            //发送给服务器,得到当前线程的Socket 对应，ObjectOutputStream对象
            //ObjectOutputStream objectOutputStream = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId()));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(message);//发送一个Message 对象，向服务器要求在线列表
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //退出客户端，并给服务器发送一个退出系统的Message对象
    public void logout(){
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId());//必须指定是哪个客户端的userId

        //发送message
        try {
            //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());

            oos.writeObject(message);
            System.out.println(u.getUserId() + " 退出系统");
            System.exit(0); //结束线程
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
