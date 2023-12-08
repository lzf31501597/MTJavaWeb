package com.javaTest.mysql24.statement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 16:48
 * @Description
 */
public class preparedStatementDML01 {
    public static void main(String[] args) throws Exception {
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
        //5,组织sql
        String sql = "insert into admin values(?, ?)";
        //6,得到对象PreparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //7,给？赋值
        preparedStatement.setString(1, admin_name);
        preparedStatement.setString(2, admin_pwd);

        //8.如果执行的是 dml（update， insert， delete）---executeUpdate（）

        int rows = preparedStatement.executeUpdate();
        System.out.println(rows > 1 ? "ok..." : "NO OK...");


        preparedStatement.close();
        connection.close();
    }
}
