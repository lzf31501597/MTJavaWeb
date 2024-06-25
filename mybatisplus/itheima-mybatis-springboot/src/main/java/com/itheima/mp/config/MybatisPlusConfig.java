package com.itheima.mp.config;

import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.incrementer.OracleKeyGenerator;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.SqlExplainInterceptor;
import com.itheima.mp.Injectors.MySqlInjector;
import com.itheima.mp.plugins.MyIntorceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/19 18:21
 * @description
 */

@Configuration
@MapperScan("com.itheima.mp.mapper")
public class MybatisPlusConfig {

    @Bean //配置分页插件
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }

    @Bean //oracle的序列生成器
    public OracleKeyGenerator oracleKeyGenerator(){
        return new OracleKeyGenerator();
    }

    @Bean //注入自定义的拦截器、插件
    public MyIntorceptor myIntorceptor(){
        return new MyIntorceptor();
    }

    @Bean //SQL分析插件
    public SqlExplainInterceptor sqlExplainInterceptor(){
        SqlExplainInterceptor sqlExplainInterceptor = new SqlExplainInterceptor();

        List<ISqlParser> sqlParserList = new ArrayList<>();
        //攻击sql阻断解析器，加入加入解析链
        sqlParserList.add(new BlockAttackSqlParser());//全表更新，删除的阻断器
        sqlExplainInterceptor.setSqlParserList(sqlParserList);

        return sqlExplainInterceptor;
    }

    /**
     * @author
     * @description 注入自定义的SQL注入器
     * @return
    **/
    @Bean
    public MySqlInjector mySqlInjector(){
        return new MySqlInjector();
    }

}
