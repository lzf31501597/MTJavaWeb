package com.javaTest.intnet21.homework;

import com.javaTest.intnet21.tcp_.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 16:13
 * @Description
 */
public class Homework03Client {
    public static void main(String[] args) throws Exception {
        //客户端连接服务器，得到Socket对象
        Socket accept = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream outputStream = accept.getOutputStream();

        //创建读取磁盘文件的输入流
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您需要下载音乐文件：高山流水");
        String strs = scanner.next();
        outputStream.write(strs.getBytes());
        accept.shutdownOutput();

        //4.将得到  数组，写入到指定的路径，就得到一个文件
        BufferedInputStream bufferedInputStream = new BufferedInputStream(accept.getInputStream());

        //bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        String filePath = "/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/intnet21/homework/"+strs+".mp3";

        //通过socket获取到输出流，将bytes数据发送给服务器
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));
        bufferedOutputStream.write(bytes);//将文件对应的字节数组的内容，写入导数据通道
        bufferedInputStream.close();
        //accept.shutdownOutput();//设置写入数据结束标志

        /*//接受服务器恢复的信息
        InputStream inputStream = accept.getInputStream();
        //使用StreamUtils的方法，直接将  读取到的内容直接转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);*/

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String s1 = bufferedReader.readLine();
        if (s1 != null) {
            System.out.println(s1);
        }*/

        //bufferedReader.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        outputStream.close();
        accept.close();
        System.out.println("文件下载成功。。。");
    }
}
