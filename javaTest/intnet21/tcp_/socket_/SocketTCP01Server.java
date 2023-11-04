package com.javaTest.intnet21.tcp_.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 12:18
 * @Description Server
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //1。监听9999端口键盘，等待连接
        //要求在本机没有其他服务监听9999端口，这个  可以通过accept()返回多个Socket[多个客户端连接的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，监听9999端口，等待连接。。");

        //2.当没有客户端连接9999端口时，程序会阻塞，等待连接。。
        // 如果有客户端连接，则会返回Socketduix，程序继续
        Socket socket = serverSocket.accept();

        System.out.println("socket =" + socket.getClass());

        //3.通过  读取客户端写入导数据通道的数据，显示
        InputStream inputStream = socket.getInputStream();

        //4.IO读取
        byte[] buff = new byte[1024];
        int readlen = 0;
        while ((readlen = inputStream.read(buff)) != -1){
            //根据读取到的实际长度，显示内容
            String s = new String(buff, 0, readlen);
            System.out.println(s);
        }

        //5.关闭流和socket
        inputStream.close();
        socket.close();
        serverSocket.close();


    }
}
