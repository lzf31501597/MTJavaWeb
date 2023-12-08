package com.javaTest.mysql24.batch_;

import com.javaTest.mysql24.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author
 * @version 1.0
 * @date 2023/12/06 17:10
 * @Description 批处理
 */
public class Batch01 {
    public static void main(String[] args) throws SQLException {
        new Batch01().noBatch();
        new Batch01().batch();
    }
    //传统方法，添加5000条数据admin2
    @Test
    public void noBatch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin3 values(null, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("noBatch() 批量开始。。。");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();

        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法 耗时=" + (end - start));

        JDBCUtils.close(null, preparedStatement, connection);
    }
    //用批量方法，添加5000条数据admin2
    @Test
    public void batch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("batch() 批量开始。。。");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            //将sql语句加入到批处理中 --》看源码
            /*//1.第一步创建 ArrayList - elementData => Object[]
                2.  就会存放我们预处理的sql语句
                3.当  满后，就按照1.5倍扩容
                4.当添加到指定的值后，就executeBatch
                5.批量处理会减少我们发送sql语句的网络开销，而且减少编译次数，因此效率提高
            * public void addBatch() throws SQLException {
        synchronized(this.checkClosed().getConnectionMutex()) {
            if (this.batchedArgs == null) {
                this.batchedArgs = new ArrayList();
            }

            for(int i = 0; i < this.parameterValues.length; ++i) {
                this.checkAllParametersSet(this.parameterValues[i], this.parameterStreams[i], i);
            }

            this.batchedArgs.add(new PreparedStatement.BatchParams(this.parameterValues, this.parameterStreams, this.isStream, this.streamLengths, this.isNull));
        }
    }*/
            preparedStatement.addBatch();

            //当有1000条记录时，在批量执行
            if((i + 1) % 1000 ==0){
                preparedStatement.executeBatch();
                //清空一把
                preparedStatement.clearBatch();
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("用批量方法 耗时=" + (end - start));

        JDBCUtils.close(null, preparedStatement, connection);
    }
}
