package com.itheima;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

/**
 * @author
 * @version 1.0
 * @date 2024/05/29 22:11
 * @Description
 */
public class Generator {
    public static void main(String[] args) {

        AutoGenerator autoGenerator = new AutoGenerator();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/tmp?serverTimezone=UTC");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("321321321");
        autoGenerator.setDataSource(dataSourceConfig);
        autoGenerator.execute();
    }
}
