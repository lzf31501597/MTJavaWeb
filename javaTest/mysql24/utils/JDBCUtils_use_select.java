package com.javaTest.mysql24.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author
 * @version 1.0
 * @date 2023/12/05 17:44
 * @Description 该类则呢么调用JDBCUtils工具类， 完成select 和DML
 */
public class JDBCUtils_use_select {
    public static void main(String[] args) {
        JDBCUtils_use_select.testDML();

    }
    @Test
    public static void testDML() {
        //1.获取链接
        Connection connection = null;
        //2.组织一个sql
        String sql = "select * from admin";
        //3.创建 PreparedStatement 对象
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //这行得到结果集
            resultSet = preparedStatement.executeQuery();
            //遍历获取结果集
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String pwd = resultSet.getString("pwd");
                System.out.println(name + "\t" + pwd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
