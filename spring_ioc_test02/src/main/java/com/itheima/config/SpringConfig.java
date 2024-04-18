package com.itheima.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.beans.OtherBean;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;


/**
 * @author
 * @version 1.0
 * @date 2024/03/20 15:42
 * @Description
 */

@Configuration //标注当前类是一个配置类（替代配置文件)+@Component
//<context:component-scan base-package="com.itheima"/>
//@ComponentScan(basePackages = {"com.itheima", "xxx.yyy"} )
@ComponentScan({"com.itheima"} ) //加载扫描
//<context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
//<import resource=""></import>
@Import(OtherBean.class)
//@Import({MyImportSelect.class})
//@Import({MyImportBeanDefinitionRegistrar.class})
//Mapper的接口扫描
@MapperScan("com.itheima.mapper")
//@MyMapperScan
public class SpringConfig {
    @Bean
    public DataSource dataSource(
            @Value("${jdbc.driver}") String driver,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.username}") String username,
            @Value("${jdbc.password}") String password
    ){
        System.out.println(driver+"  "+url+"  "+username+"  "+password);
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setPassword(username);
        druidDataSource.setPassword(password);
        //System.out.println(druidDataSource);
        return druidDataSource;
    }
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        //System.out.println(sqlSessionFactoryBean);
        return sqlSessionFactoryBean;
    }
}
