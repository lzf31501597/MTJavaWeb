package com.itheima;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

/**
 * @author
 * @version 1.0
 * @date 2024/05/29 22:11
 * @Description
 */
public class CodeGenerator {
    public static void main(String[] args) {
        //1.获取代码生成器的对象
        AutoGenerator autoGenerator = new AutoGenerator();

        //2、设置数据库相关配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/tmp?serverTimezone=UTC");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("321321321");
        autoGenerator.setDataSource(dataSourceConfig);


        //设置全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //System.out.println(System.getProperty("user", ""));
        //System.out.println(System.getProperty("user", "/Users/dreamtank77/IdeaProjects"));
        globalConfig.setOutputDir(System.getProperty("user", "/Users/dreamtank77/IdeaProjects")
                +"/mybatisplus/mybatisplus_04_generator/src/main/java");//设置代码生成输出目录
        globalConfig.setOpen(false);//设置生成完毕后，是否打开生成代码所在的目录
        globalConfig.setAuthor("itheima");//设置作者
        globalConfig.setFileOverride(true);//设置是否覆盖原始生成的文件
        globalConfig.setMapperName("%sDao");//设置数据层接口名，%s为占位符，指代模块名称
        globalConfig.setIdType(IdType.ASSIGN_ID);//设置id生成策略
        autoGenerator.setGlobalConfig(globalConfig);

        //设置包名相关配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.itheima");//设置生成的包名，与代码所在位置不冲突，二者叠加组成完整路劲
        packageConfig.setEntity("domain");//设置实体类包名
        packageConfig.setMapper("dao");//设置数据层包名
        autoGenerator.setPackageInfo(packageConfig);

        //策略设置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("mybatisplus_user");//设置当前参与生成的表名，参数为可变参数
        strategyConfig.setTablePrefix("mybatisplus_");//设置数据库表的前缀名称，模块名=数据库表名-前缀名，如：User=tbl_user-tbl
        strategyConfig.setRestControllerStyle(true);//设置是否启用Rest风格
        strategyConfig.setVersionFieldName("version");//设置乐观锁字段名
        strategyConfig.setLogicDeleteFieldName("deleted");//设置逻辑删除字段
        strategyConfig.setEntityLombokModel(true);//设置是否启用lombok
        autoGenerator.setStrategy(strategyConfig);

        //执行生成操作
        autoGenerator.execute();
    }
}
