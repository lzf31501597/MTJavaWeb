package com.javaTest.intnet21.homework;

import com.javaTest.intnet21.tcp_.upload.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 16:13
 * @Description
 */
public class Homework03Server {
    public static void main(String[] args) throws Exception {
        //1.服务器在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器在8888端口监听。。。");
        //2.等待连接
        Socket accept = serverSocket.accept();

        //3.读取客户端发送的文件名，通过scoket获取输入流
        InputStream inputStream = accept.getInputStream();
        byte[] buf = new byte[1024];
        int readlen = 0;
        String downloadFileName = "";
        while ((readlen = inputStream.read(buf)) != -1){
            downloadFileName += new String(buf, 0, readlen);
        }
        System.out.println("下载文件的名称是：" + downloadFileName);
        //如果返回的是：高山流水，则返回 高山流水.mp3；如果返回的是其他，则返回 无名.mp3；
        String resFilePath = "";
        if(downloadFileName.equals("高山流水")){
            resFilePath = "../高山流水.mp3";
        }else{
            resFilePath = "../无名.mp3";
        }

        //4.将得到  数组，写入到指定的路径，就得到一个文件
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resFilePath));
        //bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        //通过socket获取到输出流，将bytes数据发送给服务器
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(accept.getOutputStream());
        bufferedOutputStream.write(bytes);//将文件对应的字节数组的内容，写入导数据通道
        accept.shutdownOutput();//设置写入数据结束标志

       /*//String destFilePath = "/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/intnet21/homework/无名.mp3";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bufferedOutputStream.write(buf);
        bufferedOutputStream.close();*/

        /*//向客户端回复"已收到图片",通过 accept 获取到输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter.write("已传音乐文件");
        bufferedWriter.flush();//把内容刷新到数据通道
        accept.shutdownOutput();//设置写入结束标记*/

        //5.关闭流
        //bufferedWriter.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();



    }
}
