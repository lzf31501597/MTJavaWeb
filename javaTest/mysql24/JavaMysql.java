package com.javaTest.mysql24;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/11/11 15:55
 * @Description
 */
public class JavaMysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载类，获取mysql链接Class.forName("com.mysql.cj.jdbc.Driver");
        //Class.forName("com.mysql.jdbc.Driver");
        Driver driver = new Driver();
        //jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC&useSSL=false
        String url = "jdbc:mysql://localhost:3306/tmp";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "321321321");

        Connection connection = DriverManager.getConnection(url, properties);

        //String sql = "create table goods(id int, name varchar(32), price double, introduce text)";
        String sql = "INSERT INTO mytable(name)  values('tom4');";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
        connection.close();
    }
}
