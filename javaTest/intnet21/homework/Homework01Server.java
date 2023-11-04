package com.javaTest.intnet21.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/04 11:20
 * @Description
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        //1。监听9999端口键盘，等待连接
        //要求在本机没有其他服务监听9999端口，这个  可以通过accept()返回多个Socket[多个客户端连接的并发]
        ServerSocket serverSocket = new ServerSocket(9989);
        System.out.println("服务端，监听9999端口，等待连接。。");

        //2.当没有客户端连接9999端口时，程序会阻塞，等待连接。。
        // 如果有客户端连接，则会返回Socketduix，程序继续
        Socket accept = serverSocket.accept();
        System.out.println("accept =" + accept.getClass());

        //3.通过 InputStream 读取客户端写入导数据通道的数据，显示
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //4.IO读取
        String readLen = bufferedReader.readLine();
        System.out.println(readLen);


        //5.通过 OutputStream 写入数据到数据通道
        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello, client 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示写入的回复内容结束，(要求读取使用readLine())
        bufferedWriter.flush();// 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道

        //6.关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        accept.close();
        serverSocket.close();
        System.out.println("服务器退出。。。");

    }
}
