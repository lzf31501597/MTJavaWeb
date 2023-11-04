package com.javaTest.intnet21.tcp_.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 12:53
 * @Description  字节流
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9989);
        System.out.println("服务端，监听9999端口，等待连接。。");

        Socket accept = serverSocket.accept();
        System.out.println("accept =" + accept.getClass());


        InputStream inputStream = accept.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            String s = new String(buf, 0, readLen);
            System.out.println(s);
        }

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello, client".getBytes());
        accept.shutdownOutput();//设置写入结束标记

        inputStream.close();
        outputStream.close();
        accept.close();
        serverSocket.close();
    }
}
