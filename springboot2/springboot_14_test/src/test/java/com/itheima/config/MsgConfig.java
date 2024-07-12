package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @version 1.0
 * @date 2024/07/11 16:18
 * @description
 */
@Configuration
public class MsgConfig {

    @Bean
    public String msg(){
        return "bean msg...";
    }
}
