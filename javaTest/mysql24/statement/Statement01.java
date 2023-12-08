package com.javaTest.mysql24.statement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 16:28
 * @Description
 */
public class Statement01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        //next（）当接受到 空格 或者  '就是表示结束'
        //如果希望看到SQL注入，这里就需要用nextLine()
        String admin_name = scanner.nextLine();
        System.out.println("请输入用户密码：");
        String admin_pwd = scanner.nextLine();

        //1,通过properties 对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/mysql24/jdbc/prectics.properties"));

        //2,获取属性值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //3,加载驱动
        Class.forName(driver);
        //4,建立连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //5,得到对象
        java.sql.Statement statement = connection.createStatement();
        //6,组织sql
        String sql = "select * from admin where name = '"+admin_name+"' and pwd = '"+admin_pwd+"'";
        //7，将查询到结果集，放入到 ResultSet集合
        ResultSet resultSet = statement.executeQuery(sql);
        //8，取出所有数据
        if(resultSet.next()){
            System.out.println("恭喜登陆成功。。。。。。");
        }else {
            System.out.println("恭喜登陆失败。。。。。。");
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
