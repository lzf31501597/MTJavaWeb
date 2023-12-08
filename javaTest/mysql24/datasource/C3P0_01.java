package com.javaTest.mysql24.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/12/06 18:37
 * @Description
 */
public class C3P0_01 {


    //方式1：相关参数，在程序中指定user， URL，password等
    @Test
    public void testC3P0_01() throws Exception {
        //1.创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //2.通过配置文件 mysql.properties 获取相关链接信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/mysql24/datasource/mysql.properties"));
        //读取相关数据属性值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //给数据源 ComboPooledDataSource 设置相关参数
        //注意：comboPooledDataSource 来管理*******************
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        //设置初始化连接参数
        comboPooledDataSource.setInitialPoolSize(10);
        //最大连接数
        comboPooledDataSource.setMaxPoolSize(50);
        //测试连接池的效率，测试对mysql 5000次的链接操作
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            //getConnection() 是调用 DataSource 接口实现的方法的
            Connection connection = comboPooledDataSource.getConnection();
            //System.out.println("连接成功。。。");
            connection.close();
        }
//        //getConnection() 是调用 DataSource 接口实现的方法的
//        Connection connection = comboPooledDataSource.getConnection();
//        System.out.println("连接成功 testC3P0_01()。。。");
//        connection.close();
        long end = System.currentTimeMillis();
        //c3p0 5000次连接mysql 耗时=591
        System.out.println("c3p0 5000次连接mysql 耗时=" + (end - start));
    }

    //方式2：使用配置文件模版来完成
    //1.将c3p0 提供的 c3p0.config.xml 拷贝到 src目录下**********
    //2.该文件指定了连接数据库和连接池的相关参数
    @Test
    public void testC3P0_02() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("hello_mysql");
        /*Connection connection = comboPooledDataSource.getConnection();
        System.out.println("连接成功 testC3P0_02()。。。");
        connection.close();*/
        //测试连接池的效率，测试对mysql 5000次的链接操作
        long start = System.currentTimeMillis();
        System.out.println("开始连接。。。");
        for (int i = 0; i < 500000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        //c3p0 第二种方式 耗时=514
        System.out.println("c3p0 第二种方式 耗时=" + (end - start));
    }
}
