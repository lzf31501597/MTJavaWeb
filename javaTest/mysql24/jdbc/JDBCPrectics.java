package com.javaTest.mysql24.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 15:21
 * @Description
 */
public class JDBCPrectics {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        //通过properties 对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/mysql24/jdbc/prectics.properties"));

        //获取属性值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        String createtablesql = properties.getProperty("createtablesql");
        String insertsql = properties.getProperty("insertsql");
        String updatesql = properties.getProperty("updatesql");
        String deletesql = properties.getProperty("deletesql");

        //加载驱动
        Class.forName(driver);
        //建立连接
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        //statement.executeUpdate(createtablesql);
        //int rows = statement.executeUpdate(insertsql);
        //statement.executeUpdate(updatesql);
        int rows =statement.executeUpdate(deletesql);

        System.out.println(rows >= 5 ? "插入数据成功。。。" : "插入数据失败。。。");

    }
}
