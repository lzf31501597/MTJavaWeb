package com.edu.qqclient.service;

import com.edu.qqcommon.Message;
import com.edu.qqcommon.MessageType;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Member;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author
 * @version 1.0
 * @date 2023/11/08 10:12
 * @Description 和服务端保持通信
 */
public class ClientConnectServerThread extends Thread{
    //该线程需要持有Socket
    private Socket socket;
    //构造器可以接受一个 Socket对象
    public ClientConnectServerThread(Socket socket) {
        //super(target);
        this.socket = socket;
    }
    //为了更方便的得到Socket
    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {
        while (true){//while循环，保证Thread后台和服务器通信
            try {
                System.out.println("客户端线程，等待读取从服务器端发送的信息");
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                //如果服务器端没有发送Message对象，线程会阻塞在这里
                Message message = (Message) objectInputStream.readObject();

                //判断这个 Message 的类型，然后做相应的业务处理
                //如果是读取到的是 服务器端返回的在线列表
                if (message.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)) {
                    //取出在线列表，并显示
                    String[] onlineUsers = message.getContent().split(" ");
                    System.out.println("\n================显示在线用户列表================");
                    for (int i = 0; i < onlineUsers.length; i++) {
                        System.out.println("用户：" + onlineUsers[i]);
                    }

                }else if (message.getMesType().equals(MessageType.MESSAGE_CONN_MES)){//普通聊天信息
                    //需要遍历管理线程的集合，获取所有的线程socket，然后把信息转发给每个socket
                    HashMap<String, ClientConnectServerThread> hm = ManageClientConnectServerThread.getHm();

                    Iterator<String> iterator = hm.keySet().iterator();
                    while (iterator.hasNext()) {
                        String onLineUserId = iterator.next();//获取用户ID
                        if (!onLineUserId.equals(message.getSender())) {//排除群发信息的用户（发送者）
                            System.out.println("\n" + message.getSender() + " 对 " + onLineUserId
                                    + " 说： " + message.getContent());
                        }
                    }

                }else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)){//群聊天信息
                    //System.out.println("\n" +message.getSender() + " 对 " + message.getGetter()+ " 说：" + message.getContent());
                    System.out.println("\n" +message.getSender() + " 对大家说：" + message.getContent());

                }else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)){//文件传输消息
                    System.out.println("\n" +message.getSender() + " 给 " + message.getGetter() + " 发送文件 "+
                        message.getSrc() +" 到 "+message.getDest());
                    //获取文件字节数组，通过文件输出流将文件保存到磁盘
                    FileOutputStream fileOutputStream = new FileOutputStream(message.getDest());
                    fileOutputStream.write(message.getFileBytes());
                    fileOutputStream.close();
                    System.out.println("\n 保存文件成功。。。");

                }else {
                    System.out.println("返回的是其他类型的 Message，暂不处理。。。" );
                }

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }
}
