package com.javaTest.mysql24.datasource;

import com.javaTest.mysql24.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

/**
 * @author
 * @version 1.0
 * @date 2023/12/06 18:05
 * @Description
 */
public class ConQuestion {

    //代码 连接mysql 5000次
    @Test
    public void testConn(){
        //看连接--关闭  connetion 会耗时多少
        long start = System.currentTimeMillis();
        System.out.println("链接开始...");
        for (int i = 0; i < 5000; i++) {
            //使用传统的jdbc方式，得到连接
            Connection connection = JDBCUtils.getConnection();
            //进行一些操作，prepareStatement ，关闭连接
            JDBCUtils.close(null, null, connection);
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式5000次 耗时=" + (end - start));//传统方式5000次 耗时=26470
    }
}
