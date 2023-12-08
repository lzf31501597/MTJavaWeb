package com.javaTest.mysql24.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/12/07 11:22
 * @Description
 */
public class JDBCUtilsByDruid {
    private  static DataSource ds;

    //在静态代码块完成 ds的初始化
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    //编写getConnection方法
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //关闭连接，（在数据库连接池的技术中，close 不是真的断掉连接）
    //而是把使用的 Connection对象放回连接池
    public static void close(ResultSet resultSet, Statement statement, Connection connection){
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException throwables) {
            //将编译异常转成运行异常
            throw new RuntimeException();
        }
    }
}
