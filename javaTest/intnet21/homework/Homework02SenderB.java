package com.javaTest.intnet21.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 18:23
 * @Description  UDP发送
 */
public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        //1.创建 DatagramSocket 对象，准备在 9998 端口 接收数据
        DatagramSocket socket = new DatagramSocket(8889);

        //2. 将需要发送的数据，封装到 DatagramPacket 对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题：如 '四大名著是哪些'");
        String question = scanner.next();//"四大名著是哪些"
        byte[] data = question.getBytes(); //
        //说明: 封装的 DatagramPacket（ data 内容字节数组 , data.length , 主机(IP) , 端口）
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.27"), 8888);
        socket.send(packet);

        //3.=== 接收从 A 端回复的信息
        //(1) 构建一个 DatagramPacket 对象，准备接收数据
        // 在前面讲解 UDP 协议时，老师说过一个数据包最大 64k
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);

        //(2) 调用 接收方法, 将通过网络传输的 DatagramPacket 对象填充到 packet 对象
        //老师提示: 当有数据包发送到 本机的 9998 端口时，就会接收到数据
        //如果没有数据包发送到 本机的 9998 端口, 就会阻塞等待.
        socket.receive(packet);
        //(3) 可以把 packet 进行拆包，取出数据，并显示.
        int length = packet.getLength();//实际接收到的数据字节长度
        data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //关闭资源
        socket.close();
        System.out.println("B 端退出");
    }
}
