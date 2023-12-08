package com.javaTest.mysql24.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 17:44
 * @Description 该类则呢么调用JDBCUtils工具类， 完成select 和DML
 */
public class JDBCUtils_use_update {
    public static void main(String[] args) {


    }
@Test
    public void testDML() {
        //1.获取链接
        Connection connection = null;
        //2.组织一个sql
        String sql = "update admin set pwd = ? where name= ?";
        //3.创建 PreparedStatement 对象
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值
            preparedStatement.setString(2, "tttt");
            preparedStatement.setString(1, "321321");
            //执行sql语句
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
