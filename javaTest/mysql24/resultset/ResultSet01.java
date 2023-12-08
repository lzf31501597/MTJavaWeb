package com.javaTest.mysql24.resultset;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 15:50
 * @Description
 */
public class ResultSet01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        //通过properties 对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/mysql24/jdbc/prectics.properties"));

        //获取属性值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //加载驱动
        Class.forName(driver);
        //建立连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //得到对象
        Statement statement = connection.createStatement();
        //sql
        String sql = "select * from prectics;";
        //将查询到结果集，放入到 ResultSet集合
        ResultSet resultSet = statement.executeQuery(sql);
        //取出所有数据
        while(resultSet.next()){
            int anInt = resultSet.getInt(1);
            String name = resultSet.getString(2);
            System.out.println(anInt + "\t" + name);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
