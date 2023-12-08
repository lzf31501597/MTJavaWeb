package com.javaTest.mysql24.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 14:34
 * @Description
 */
public class JDBC01 {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/tmp";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "321321321");
        Connection connect = driver.connect(url, properties);

        String sql = "INSERT INTO mytable(name) values('tom6');";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);

        System.out.println(rows > 0 ? "OK" : "NO");

        statement.close();
        connect.close();
    }
}
