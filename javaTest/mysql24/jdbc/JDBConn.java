package com.javaTest.mysql24.jdbc;

import com.mysql.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 14:34
 * @Description
 */
public class JDBConn {
    public static void main(String[] args) throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException, IOException {
        connect01();
        connect02();
        connect03();
        connect04();
        connect05();
    }

    //mysqll连接方式1
    public static void connect01() throws SQLException {
        Driver driver = new Driver();;
        String url = "jdbc:mysql://localhost:3306/tmp";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "321321321");

        Connection connect = driver.connect(url, properties);
        System.out.println("mysql连接方式1:" + connect);

    }

    //mysqll连接方式2
    public static void connect02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/tmp";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "321321321");

        Connection connect = driver.connect(url, properties);
        System.out.println("mysql连接方式2:" + connect);
    }

    //mysqll连接方式3
    public static void connect03() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/tmp";
        String user = "root";
        String password = "321321321";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("mysql连接方式3:" + connection);
    }

    //mysqll连接方式4
    //使用Class.forName 自动完成注册驱动，简化代码************：使用最多的方式，推荐使用
    public static void connect04() throws ClassNotFoundException, SQLException {

        //在加载 Driver类时，完成注册

        /*
            1.静态代码块，在类加载时，会执行一次
            2.DriverManager.registerDriver(new Driver());
            3.因此注册 的工作已经完成
        * static {
            try {
                DriverManager.registerDriver(new Driver());
            } catch (SQLException var1) {
                throw new RuntimeException("Can't register driver!");
            }
        }
        * */
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/tmp";
        String user = "root";
        String password = "321321321";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("mysql连接方式4:" + connection);
    }
    //mysqll连接方式5  在方式4的基础上，增加配置文件，
    public static void connect05() throws ClassNotFoundException, SQLException, IOException {

        //通过properties 对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/mysql24/jdbc/mysql.properties"));

        //获取属性值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //加载驱动
        Class.forName(driver);
        //建立连接
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("mysql连接方式5:" + connection);
    }
}
