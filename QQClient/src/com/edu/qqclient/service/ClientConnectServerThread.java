package com.edu.qqclient.service;

import com.edu.qqcommon.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Member;
import java.net.Socket;

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
                Message message = (Message) objectInputStream.readObject();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }
}
