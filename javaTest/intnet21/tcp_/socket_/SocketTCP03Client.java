package com.javaTest.intnet21.tcp_.socket_;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 12:53
 * @Description 字符流
 */

public class SocketTCP03Client {

    public static void main(String[] args) throws IOException {
        //1.连接服务器端口和IP
        //Socket socket = new Socket("www.baidu.com");
        Socket socket = new Socket(InetAddress.getLocalHost(), 9989);
        System.out.println("客户端socket返回=" + socket.getClass());

        //2.连接上后，生成Socket ，通过socket.getOutputStream()
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流，写入数据到数据通道
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello server 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，(要求读取使用readLine())
        bufferedWriter.flush();// 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道

        //4.通过输入流，读取数据通道传过来的数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String readLen = bufferedReader.readLine();
        System.out.println(readLen);



        //5.关闭流对象和socket，必须关闭（后打开的先关闭）
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出。。。");

    }
}
