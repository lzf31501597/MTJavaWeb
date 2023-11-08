package com.javaTest.intnet21.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 18:23
 * @Description UDP接收
 */
public class Homework02ReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个 DatagramSocket 对象，准备在 9999 接收数据
        DatagramSocket socket = new DatagramSocket(8888);

        //2. 构建一个 DatagramPacket 对象，准备接收数据
        // 在前面讲解 UDP 协议时，老师说过一个数据包最大 64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        //3. 调用 接收方法, 将通过网络传输的 DatagramPacket 对象，填充到 packet 对象
        //老师提示: 当有数据包发送到 本机的 9999 端口时，就会接收到数据
        //如果没有数据包发送到 本机的 9999 端口, 就会阻塞等待.
        System.out.println("接收端 A 等待接收数据..");
        socket.receive(packet);

        //4. 可以把 packet 进行拆包，取出数据，并显示.
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        String answer = "";
        if (s.equals("四大名著是哪些")) {
            answer = "四大名著是西游记，水浒传，红楼梦，三国演义";
            System.out.println(s);
        }else {
            answer = "what???";
            System.out.println(s);
        }


        //===回复信息给 B 端
        //将需要发送的数据，封装到 DatagramPacket 对象
        data = answer.getBytes();
        //说明: 封装的 DatagramPacket（data 内容字节数组 , data.length , 主机(IP) , 端口）
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.27"), 8889);
        socket.send(packet);//发送

        //5. 关闭资源
        socket.close();
        System.out.println("A 端退出...");
    }
}
