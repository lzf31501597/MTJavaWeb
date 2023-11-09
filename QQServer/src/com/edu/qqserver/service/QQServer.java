package com.edu.qqserver.service;

import com.edu.qqcommon.Message;
import com.edu.qqcommon.MessageType;
import com.edu.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author
 * @version 1.0
 * @date 2023/11/08 11:10
 * @Description 服务器监听9999，等待客户端的链接，并保持通信
 */
public class QQServer {
    private ServerSocket ss = null;
    //创建一个集合 HashMap，存放多个用户，如果是这些用户登录，就认为是合法
    //可以使用 ConcurrentHashMap,可以处理并发的集合，没有线程安全
    //HashMap 没有处理线程安全，因此多线程情况下是不安全的
    //ConcurrentHashMap 是处理线程安全的，即线程同步处理，在多线程情况下是安全的
    private static ConcurrentHashMap<String, ArrayList<Message>> offLineDb = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, User> validUsers = new ConcurrentHashMap<>();

    static{
        validUsers.put("100", new User("100", "123456"));
        validUsers.put("200", new User("200", "123456"));
        validUsers.put("300", new User("300", "123456"));
        validUsers.put("tom", new User("tom", "123456"));
        validUsers.put("jack", new User("jack", "123456"));
        validUsers.put("smith", new User("smith", "123456"));


    }

    //验证用户是否有效方法
    private boolean checkUser(String userId,String pwd){
        User user = validUsers.get(userId);
        if (user == null) {//说明userId没有存在validUsers集合的key中
            return false;
        }
        if (!user.getPwd().equals(pwd)) {//userId正确，但是密码错误
            return false;
        }
        return true;
    }

    public QQServer() {
        try {
            System.out.println("服务器在9999端口监听。。。");
            //启动推送新闻的线程
            new Thread(new SendNewsToAllService()).start();
            ss = new ServerSocket(9999);
            //当和某个客户端连接后，用while循环保证持续监听，
            while (true) {
                Socket accept = ss.accept();//如果没有客户端连接，就会阻塞
                //得到socket关联的对象输入流和输出流
                ObjectInputStream objectInputStream = new ObjectInputStream(accept.getInputStream());
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(accept.getOutputStream());

                User user = (User) objectInputStream.readObject();//读取客户端发送的User对象
                Message message = new Message();//创建对象，准备回复客户端
                //验证用户登录
                if (checkUser(user.getUserId(), user.getPwd())) {//登录成功
                    //System.out.println("用户 id=" + user.getUserId() + ", pwd=" + user.getPwd()+"验证登录成功");
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将message对象回复客户端
                    objectOutputStream.writeObject(message);
                    //创建一个线程，与客户端保持通信，该线程需要持有socket对象
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(accept, user.getUserId());
                    serverConnectClientThread.start();
                    //把该线程对象，放到线程集合，进行管理
                    ManageClientThreads.addClientThread(user.getUserId(), serverConnectClientThread);

                }else {//登录失败
                    System.out.println("用户 id=" + user.getUserId() + ", pwd=" + user.getPwd()+"验证登录失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    objectOutputStream.writeObject(message);
                    accept.close();//关闭socket对象
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //如果服务器退出了while循环，说明服务器端不在监听，因此关闭ServerSocket
            try {
                ss.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
