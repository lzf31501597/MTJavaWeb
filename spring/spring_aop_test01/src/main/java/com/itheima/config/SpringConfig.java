package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * @date 2024/04/03 14:18
 * @Description
 */

@Configuration
@ComponentScan("com.itheima") //<context:component-scan base-package="com.itheima"/>
@EnableAspectJAutoProxy //<aop:aspectj-autoproxy/>
public class SpringConfig {


}
