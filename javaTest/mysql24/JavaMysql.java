package com.javaTest.mysql24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author
 * @version 1.0
 * @date 2023/11/11 15:55
 * @Description
 */
public class JavaMysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载类，获取mysql链接Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("com.mysql.jdbc.Driver");
        //jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC&useSSL=false
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "321321321");

        //String sql = "create table goods(id int, name varchar(32), price double, introduce text)";
        String sql = "INSERT INTO goods(name)  values('tom3');";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        statement.close();
        connection.close();
    }
}
