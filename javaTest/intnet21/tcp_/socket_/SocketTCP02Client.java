package com.javaTest.intnet21.tcp_.socket_;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 12:53
 * @Description
 */

public class SocketTCP02Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 9989);
        System.out.println("客户端socket返回=" + socket.getClass());

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello server".getBytes());
        socket.shutdownOutput();//设置写入结束标记

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1){
            String s = new String(bytes, 0, readLen);
            System.out.println(s);

        }
        outputStream.close();
        inputStream.close();
        socket.close();

    }
}
