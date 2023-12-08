package com.javaTest.mysql24.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/12/07 11:07
 * @Description 测试Druid 应用
 */
public class Druid01 {
    @Test
    public void testDruid() throws Exception {
        //1.加入 druid-1.1.10.jar 包
        //2.加入配置文件 druid.properties ，将文件拷贝到src目录下
        //3.创建 Properties 对象，读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/druid.properties"));
        //4.创建一个指定参数的数据库连接池，Druid连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
            //System.out.println("连接成功。。。");
            connection.close();
        }
        long end = System.currentTimeMillis();
        //Druid 5000次连接mysql 耗时=3371
        System.out.println("Druid 5000次连接mysql 耗时=" + (end - start));

        //Druid 500000次连接mysql 耗时=3371
        //c3p0 500000 第二种方式 耗时=9715
    }

}
