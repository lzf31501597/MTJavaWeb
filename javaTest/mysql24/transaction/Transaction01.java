package com.javaTest.mysql24.transaction;

import com.javaTest.mysql24.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 18:25
 * @Description
 */
public class Transaction01 {
    //没有使用事务处理
    @Test
    public void testDML() {
        //1.获取链接
        Connection connection = null;
        //2.组织一个sql
        String sql = "update account set money = money - 100 where id = 100";
        String sql2 = "update account set money = money + 100 where id = 200";
        //3.创建 PreparedStatement 对象
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //执行sql语句
            preparedStatement.executeUpdate();//执行第一条

            int i= 1/0;//抛出异常
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();//执行第二条
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
    //使用事务处理
    @Test
    public void testDML02() {
        //1.获取链接
        Connection connection = null;
        //2.组织一个sql
        String sql = "update account set money = money - 100 where id = 100";
        String sql2 = "update account set money = money + 100 where id = 200";
        //3.创建 PreparedStatement 对象
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //执行sql语句
            preparedStatement.executeUpdate();//执行第一条

            //int i= 1/0;//抛出异常
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();//执行第二条
            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
