package com.javaTest.mysql24.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 17:26
 * @Description 这是一个工具类，完成mysql的连接盒关闭资源
 */
public class JDBCUtils {
    private static String user;
    private static String password;
    private static String url;
    private static String driver;

    static {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/mysql24/utils/mysql.properties"));
            //读取相关数据属性值
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");

        } catch (IOException e) {
            /*
            * 在实际开发中，我们这么处理
            * 1.将编译异常转成运行异常
            * 2.这里是调用者，可以选择捕获该异常
            *   也可以选择默认处理该异常，比较方便
            * */
            throw new RuntimeException(e);
        }
    }

    //链接数据库，返回Conntion
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            /*
             * 1.将编译异常转成运行异常
             * 2.这里是调用者，可以选择捕获该异常
             *   也可以选择默认处理该异常，比较方便
             * */
            throw new RuntimeException(e);
        }
    }

    //关闭相关资源，ResultSet，Statement/PreparedStatement, Connection
    public static void close(ResultSet set, Statement statement, Connection connection){
        try {
            if (set != null) {
                set.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            /*
             * 1.将编译异常转成运行异常
             * 2.这里是调用者，可以选择捕获该异常
             *   也可以选择默认处理该异常，比较方便
             * */
            throw new RuntimeException(e);
        }
    }
}
