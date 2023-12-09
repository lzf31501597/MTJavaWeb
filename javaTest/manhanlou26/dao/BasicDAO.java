package com.javaTest.manhanlou26.dao;

import com.javaTest.dao25.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2023/12/08 14:36
 * @Description 开发BasicDAO类，是其他DAO的父类
 */
public class BasicDAO<T> {//泛型指定具体类型

    private QueryRunner qr = new QueryRunner();

    //开发通用的dml方法，针对任意的表
    public int update(String sql, Object... parameters){

        Connection connection = null;
        try {
            connection = (Connection) JDBCUtilsByDruid.getConnection();
            int update = qr.update(connection, sql, parameters);
            return update;

        } catch (Exception e) {
            //将编译异常 -> 运行异常， 抛出
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    //返回多个对象（即查询的结果是多行数据），针对任意的表
    /**
     * @param sql sql语句，可以有 ？（占位符）
     * @param clazz 传入一个类的Class对象, 比如：Actor.class
     * @param parameters 传入 ？ 的具体价值，可以使多个
     * @return 根据 Actor.class 返回对应的 ArrayList 集合
    */
    public List<T> queryMultplay(String sql, Class<T> clazz, Object... parameters){
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);

        } catch (Exception e) {
            //将编译异常 -> 运行异常， 抛出
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    //查询单行结果 的通用方法
    public T querySingle(String sql, Class<T> clazz, Object... parameters){
        Connection connection = null;
        try {
            connection = (Connection) JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanHandler<T>(clazz), parameters);

        } catch (Exception e) {
            //将编译异常 -> 运行异常， 抛出
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    //查询单行单列的方法，即返回单只的方法
    public Object queryScalar(String sql, Class<T> clazz, Object... parameters){
        Connection connection = null;
        try {
            connection = (Connection) JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new ScalarHandler(), parameters);

        } catch (Exception e) {
            //将编译异常 -> 运行异常， 抛出
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }
}
