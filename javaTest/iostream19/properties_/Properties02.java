package com.javaTest.iostream19.properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 15:05
 * @Description 使用 Properties类 读取mysql.properties文件
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        //使用 Properties类 读取mysql.properties文件

        //1.创建Properties对象
        Properties properties = new Properties();
        //2.加载指定配置文件
        properties.load(new FileReader("./MTJavaWeb/src/com/javaTest/iostream19/properties_/mysql.properties"));
        //3.把k-v显示在控制台
        properties.list(System.out);
        //4.根据key获取对应的值
        String user = properties.getProperty("user");
        String ip = properties.getProperty("ip");
        String pwd = properties.getProperty("pwd");
        /*System.out.println("user:" + user);
        System.out.println("ip:" + ip);
        System.out.println("pwd:" + pwd);*/


    }
}
