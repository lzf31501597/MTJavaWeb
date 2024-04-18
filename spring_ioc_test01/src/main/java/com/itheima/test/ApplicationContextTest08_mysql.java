package com.itheima.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Descriptio  n
 */
public class ApplicationContextTest08_mysql {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext08.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);

        /*Object dataSource = applicationContext.getBean("dataSource");
        System.out.println(dataSource);

        Object connection = applicationContext.getBean("connection");
        System.out.println(connection);

        Object date = applicationContext.getBean("date");
        System.out.println(date);*/

        /*SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory01");
        //System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);*/

        /*//静态工厂方法
        InputStream inputS = Resources.getResourceAsStream("mybatis-config.xml");
        //无参构造实例化
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //实例工厂方法
        SqlSessionFactory sqlSessionFactory = builder.build(inputS);*/

        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2024-02-21 12:00:00");*/


       /*     Class.forName("com.mysql.jdbc.Driver");
            String url = "select * from salgrade";
            Connection connection = DriverManager.getConnection(url, "root", "321321321");
       */
    }



}
