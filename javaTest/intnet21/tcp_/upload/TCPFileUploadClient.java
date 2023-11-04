package com.javaTest.intnet21.tcp_.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 16:13
 * @Description
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //客户端连接服务器，得到Socket对象
        Socket accept = new Socket(InetAddress.getLocalHost(), 8888);
        //创建读取磁盘文件的输入流
        String srcFilePath = "../无名.mp3";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));

        //bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        //通过socket获取到输出流，将bytes数据发送给服务器
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(accept.getOutputStream());
        bufferedOutputStream.write(bytes);//将文件对应的字节数组的内容，写入导数据通道
        bufferedInputStream.close();
        accept.shutdownOutput();//设置写入数据结束标志

        /*//接受服务器恢复的信息
        InputStream inputStream = accept.getInputStream();
        //使用StreamUtils的方法，直接将  读取到的内容直接转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String s1 = bufferedReader.readLine();
        if (s1 != null) {
            System.out.println(s1);
        }


        bufferedOutputStream.close();
        accept.close();
    }
}
