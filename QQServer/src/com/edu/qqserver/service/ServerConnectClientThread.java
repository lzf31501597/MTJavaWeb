package com.edu.qqserver.service;

import com.edu.qqcommon.Message;
import com.edu.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author
 * @version 1.0
 * @date 2023/11/08 11:33
 * @Description 该类的一个对象和客户端保持通信
 */
public class ServerConnectClientThread extends Thread{

    private Socket socket;
    private String userId;//连接客户端的用户ID

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {//线程处于run的状态，可以发送、接收消息

        while (true){
            try {
                System.out.println("服务器和客户端" + userId + "保持通信，读取数据。。。");
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) objectInputStream.readObject();

                //后面会使用的Message ，根据Message的类型，作相应业务处理
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    //在线用户列表  100 300 tom
                    System.out.println(message.getSender() + " 请求在线用户列表");
                    String onlineUsers = ManageClientThreads.getOnlineUsers();

                    //返回一个 Message 对象，返回给客户端
                    Message message1 = new Message();
                    message1.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message1.setContent(onlineUsers);
                    message1.setGetter(message.getSender());

                    //写入客户数据通道，返回给客户端
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                    objectOutputStream.writeObject(message1);

                }else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)){//客户端退出
                    System.out.println(message.getSender() + " 退出");
                    //将这个客户端对应的线程，从集合删除
                    ManageClientThreads.removeServerConnectClientThread(message.getSender());
                    socket.close();//关闭连接
                    break;//退出线程

                }else if (message.getMesType().equals(MessageType.MESSAGE_CONN_MES)){//私聊信息

                    //通过message 获取getterId，然后获取对应线程
                    ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(message.getGetter());
                    //得到对应的socket对象输出流，将message对象转发给指定的(接收客户端)
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());

                    objectOutputStream.writeObject(message);//转发，提示如果客户不在线，可以保存到数据库，这样就可以实现离线留言
                    System.out.println(message.getSentTime()+": "+message.getSender() + " 对 " + message.getGetter() + " 说：" + message.getContent());


                }else if (message.getMesType().equals(MessageType.MESSAGE_OFFLINE_CONN_MES)){//离线私聊信息
                    Iterator<Message> iterator = message.getOffLineDb().iterator();
                    while (true) {
                        //通过message 获取getterId，然后获取对应线程
                        ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(message.getGetter());
                        //得到对应的socket对象输出流，将message对象转发给指定的(接收客户端)
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());

                        objectOutputStream.writeObject(message);//转发，提示如果客户不在线，可以保存到数据库，这样就可以实现离线留言
                        System.out.println(message.getSentTime() + ": " + message.getSender() + " 对 " + message.getGetter() + " 说：" + message.getContent());

                    }
                }else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)){//私聊信息
                    //需要遍历管理线程的集合，获取所有的线程socket，然后把信息转发给每个socket
                    HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();

                    Iterator<String> iterator = hm.keySet().iterator();
                    while (iterator.hasNext()){
                        String onLineUserId = iterator.next();//获取用户ID
                        if (!onLineUserId.equals(message.getSender())) {//排除群发信息的用户（发送者）
                            message.setGetter(onLineUserId);

                            /*ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(hm.get(onLineUserId).getSocket().getOutputStream());
                            objectOutputStream1.writeObject(message);*/

                            //通过message 获取getterId，然后获取对应线程
                            ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(onLineUserId);
                            //得到对应的socket对象输出流，将message对象转发给指定的(接收客户端)
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());

                            objectOutputStream.writeObject(message);//转发，提示如果客户不在线，可以保存到数据库，这样就可以实现离线留言
                            System.out.println(message.getSentTime()+": "+message.getSender() + " 对 " + onLineUserId + " 说：" + message.getContent());

                        }
                    }


                }else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {//转发发送文件message
                    //根据getterId 获取对应的线程，将 message 对象转发
                    ObjectOutputStream objectOutputStream =
                            new ObjectOutputStream(ManageClientThreads.getServerConnectClientThread(message.getGetter()).getSocket().getOutputStream());
                    objectOutputStream.writeObject(message);//转发
                } else {
                    System.out.println("返回的是其他类型的 Message，暂不处理。。。" );
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
