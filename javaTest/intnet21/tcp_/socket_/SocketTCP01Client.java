package com.javaTest.intnet21.tcp_.socket_;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 12:26
 * @Description
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务器端口和IP
        //Socket socket = new Socket("www.baidu.com");
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());

        //2.连接上后，生成Socket ，通过socket.getOutputStream()
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流，写入数据到数据通道
        outputStream.write("hello server!!!".getBytes());

        //4.关闭流对象和socket，必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出。。。");
    }
}
