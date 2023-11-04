package com.javaTest.intnet21.tcp_.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author
 * @version 1.0
 * @date 2023/11/03 11:55
 * @Description
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1.获取指定的 InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//makkunoMacBook-Pro.local/192.168.1.27

        //2.根据主机名，获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("makkunoMacBook-Pro.local");
        System.out.println("host1=" + host1);//makkunoMacBook-Pro.local/192.168.1.27

        //3.根据域名，获取 InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);//www.baidu.com/119.63.197.139

        //4.通过InetAddress对象，获取对应的IP地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2对应的IP地址=" + hostAddress);//119.63.197.139/119.63.197.151

        //5.通过InetAddress对象，获取对应主机名或域名
        String host2HostName = host2.getHostName();
        System.out.println("host2HostName=" + host2HostName);//www.baidu.com
    }
}
