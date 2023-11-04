package com.javaTest.intnet21.tcp_.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 16:13
 * @Description
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        //1.服务器在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器在8888端口监听。。。");
        //2.等待连接
        Socket accept = serverSocket.accept();

        //3.读取客户端发送的数据，通过scoket获取输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(accept.getInputStream());
        byte[] buf = StreamUtils.streamToByteArray(bufferedInputStream);

        //4.将得到  数组，写入到指定的路径，就得到一个文件
        String destFilePath = "/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/intnet21/upload/无名.mp3";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bufferedOutputStream.write(buf);
        bufferedOutputStream.close();

        //向客户端回复"已收到图片",通过 accept 获取到输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter.write("已收到图片");
        bufferedWriter.flush();//把内容刷新到数据通道
        accept.shutdownOutput();//设置写入结束标记

        //5.关闭流
        bufferedWriter.close();
        bufferedInputStream.close();
        accept.close();
        serverSocket.close();



    }
}
