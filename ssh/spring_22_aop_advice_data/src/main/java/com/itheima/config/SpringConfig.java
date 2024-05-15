package com.itheima.config;

import org.springframework.context.annotation.*;

/**
 * @author
 * @version 1.0
 * @date 2024/05/10 16:28
 * @Description
 */

@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class SpringConfig {

}
