package com.javaTest.mysql24.datasource;


import com.javaTest.mysql24.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author
 * @version 1.0
 * @date 2023/12/07 11:31
 * @Description
 */
public class JDBCUtilsByDruid_use {

    public static void main(String[] args) {
        //testSelect_Druid();
        //testUpdate();
       testSelectDruidToArraylist();
        JDBCUtilsByDruid_use.testSelectDruidToArraylist1();
    }
    //解决ResultSet =封装=>  Arraylist


    public static void testSelectDruidToArraylist() {
        //1.获取链接
        Connection connection = null;
        //2.组织一个sql
        String sql = "select * from actor where id >= ?";
        //3.创建 PreparedStatement 对象
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Actor> list = new ArrayList<>();//创建 ArrayList 对象，存放actor对象

        try {
            connection = JDBCUtilsByDruid.getConnection();
            System.out.println("connection testSelect()的运行类型：" + connection.getClass()); //com.alibaba.druid.pool.DruidPooledConnection
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);
            //这行得到结果集
            resultSet = preparedStatement.executeQuery();
            //connection.close();//--Operation not allowed after ResultSet closed
            //遍历获取结果集
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Date bornDate = resultSet.getDate("bornDate");
                String phone = resultSet.getString("phone");
                //System.out.println(name + "\t" + pwd);

                //把得到的 的记录，封装到Actor对象里，放入到List
                list.add(new Actor(id, name, sex, bornDate, phone));

            }
            System.out.println("list集合数据=" + list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(resultSet, preparedStatement, connection);
        }
    }
    public static ArrayList<Actor> testSelectDruidToArraylist1() {
        //1.获取链接
        Connection connection = null;
        //2.组织一个sql
        String sql = "select * from actor where id >= ?";
        //3.创建 PreparedStatement 对象
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Actor> list = new ArrayList<>();//创建 ArrayList 对象，存放actor对象

        try {
            connection = JDBCUtilsByDruid.getConnection();
            System.out.println("connection testSelect()的运行类型：" + connection.getClass()); //com.alibaba.druid.pool.DruidPooledConnection
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);
            //这行得到结果集
            resultSet = preparedStatement.executeQuery();
            //connection.close();//--Operation not allowed after ResultSet closed
            //遍历获取结果集
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Date bornDate = resultSet.getDate("bornDate");
                String phone = resultSet.getString("phone");
                //System.out.println(name + "\t" + pwd);

                //把得到的 的记录，封装到Actor对象里，放入到List
                list.add(new Actor(id, name, sex, bornDate, phone));
            }
            System.out.println("list集合数据=" + list);

            for(Actor actor : list){
                System.out.println("id=" + actor.getId() + "\t" + actor.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(resultSet, preparedStatement, connection);
        }
        return list;
    }
    public static void testSelect_Druid() {
        System.out.println("使用Druid方式完成");
        //1.获取链接
        Connection connection = null;
        //2.组织一个sql
        String sql = "select * from admin";
        //3.创建 PreparedStatement 对象
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            System.out.println("connection testSelect()的运行类型：" + connection.getClass()); //com.alibaba.druid.pool.DruidPooledConnection
            preparedStatement = connection.prepareStatement(sql);
            //这行得到结果集
            resultSet = preparedStatement.executeQuery();
            //connection.close();--Operation not allowed after ResultSet closed
            //遍历获取结果集
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String pwd = resultSet.getString("pwd");
                System.out.println(name + "\t" + pwd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtilsByDruid.close(null, preparedStatement, connection);
        }
    }

    public static void testUpdate() {
        //1.获取链接
        Connection connection = null;
        //2.组织一个sql
        String sql = "update admin set pwd = ? where name= ?";
        //3.创建 PreparedStatement 对象
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            System.out.println("connection testUpdate()的运行类型：" + connection.getClass());
            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值
            preparedStatement.setString(2, "tttt");
            preparedStatement.setString(1, "tttt");
            //执行sql语句
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}


