package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import static sun.net.www.protocol.http.AuthCacheValue.Type.Server;

@SpringBootApplication
@EnableConfigurationProperties({ServerConfig.class})
public class Springboot13ConfigurationApplication {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        //druidDataSource.setDriverClassName("com.mysql.jdbc.Driver123");
        return druidDataSource;
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot13ConfigurationApplication.class, args);
        ServerConfig bean = applicationContext.getBean(ServerConfig.class);
        System.out.println(bean);

        DruidDataSource druidDataSource = applicationContext.getBean(DruidDataSource.class);
        System.out.println(druidDataSource.getDriverClassName());
    }

}
