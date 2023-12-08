package com.javaTest.mysql24.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2023/12/07 18:07
 * @Description
 */
public class DBUtils_use {

    //使用apache-dbutils 工具类 + druid 完成对表的crud 操作
    @Test
    public void testQueryMany() throws SQLException {
        //1.得到连接 dbutils
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2.使用 DButils 类和接口， 先引入dbutils相关的jar， 加入到本project
        //3.创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //4、就可以执行相关的方法，返回ArrayList 结果集
        String sql = "select * from actor where id >= ?";
        //1). query方法就是执行sql 语句，得到resultset --封装--> ArrayList集合中
        //2).返回集合
        //3）.connection：连接
        //4）.sql: 执行的SQL语句
        //5）.new BeanListHandler<>(Actor.class): 将在resultset --> Actor对象 --> 封装到ArrayList集合中
        //  底层使用反射机制 去获取Actor类的属性，然后进行封装
        //6).1--就是费sql 语句中的 ？ 赋值，可以多个值，因为是可变参数 Object。。。params
        /*    分析QueryRunner.query（）
        public <T> T query(Connection conn, String sql, ResultSetHandler<T> rsh, Object... params) throws SQLException {
            PreparedStatement stmt = null; //定义PreparedStatement
            ResultSet rs = null; //接受不了返回的的ResultSet
            Object result = null; //返回ArrayList

            try {
                stmt = this.prepareStatement(conn, sql); //创建PreparedStatement
                this.fillStatement(stmt, params); //对sql 进行赋值
                rs = this.wrap(stmt.executeQuery()); //执行sql，返回 ResultSet
                result = rsh.handle(rs); //返回 ResultSet-->ArrayList [使用反射机制，对传入class对象处理]
            } catch (SQLException var33) {
                this.rethrow(var33, sql, params);ResultSet
            } finally {
                try {
                    this.close(rs); //关闭了
                } finally {
                    this.close((Statement)stmt); //关闭了PreparedStatement
                }
            }

            return result;
        }
        *
        * */
        List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
        System.out.println("输出集合信息");
        for(Actor actor : list){
            System.out.println(actor);
        }

        //释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }

    /* *
    * 演示 使用apache-dbutils 工具类 + druid 完成 返回的结果是单行记录（单个对象）
    * */
    @Test
    public void testQuerySingle() throws SQLException {
        //1.得到连接 dbutils
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2.使用 DButils 类和接口， 先引入dbutils相关的jar， 加入到本project
        //3.创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //4、就可以执行相关的方法，返回单个对象
        String sql = "select * from actor where id = ?";
        //因为返回的的单行记录 <--> 单个对象，使用的Hander 是 BeanHandler
        Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 2);
        if (actor == null) {
            System.out.println("actor is null...");
        }else{
            System.out.println("actor=" + actor);
        }


        //释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }

    /* *
     * 演示 使用apache-dbutils 工具类 + druid 完成查询结果是单行单列--> 返回的结果是object
     * */
    @Test
    public void testQueryScalar() throws SQLException {
        //1.得到连接 dbutils
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2.使用 DButils 类和接口， 先引入dbutils相关的jar， 加入到本project
        //3.创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //4、就可以执行相关的方法，返回单个对象
        String sql = "select name from actor where id = ?";

        //应为返回的是一个对象，使用的Handler 就是 ScalarHandler
        Object query = queryRunner.query(connection, sql, new ScalarHandler(), 2);
        System.out.println(query);

        //释放资源
        JDBCUtilsByDruid.close(null, null, connection);

    }

    /* *
     * 演示 使用apache-dbutils 工具类 + druid 完成DML（insert，update，delete）
     * */
    @Test
    public void testDML() throws SQLException {
        //1.得到连接 dbutils
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2.使用 DButils 类和接口， 先引入dbutils相关的jar， 加入到本project
        //3.创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //4、组织sql 完成 DML（insert，update，delete）
        //String sql = "update actor set name = ? where id = ?";
        String sql = "insert into actor values(null, ?, ?, ?, ?)";
        //String sql = "delete from actor where id = ?";

        //1).执行DML 操作是queryRunner.update(）
        //2).返回值是受影响的行数 （affected：受影响）
        //int affectedRow = queryRunner.update(connection, sql, "james", 2);
        int affectedRow = queryRunner.update(connection, sql, "张三丰", "男", "1966-10-10", "116");
        //int affectedRow = queryRunner.update(connection, sql, 5);
        System.out.println(affectedRow > 0 ? "执行成功。。。" : "执行没有修改成功。。。");

        //释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }
}
