package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 15:20
 * @Description
 */
@Configuration
//@ComponentScan("com.itheima")
//@ComponentScan({"com.itheima.service", "com.itheima.dao"})
@ComponentScan(value = "com.itheima",
        excludeFilters = @ComponentScan.Filter(
            type = FilterType.ANNOTATION,
            classes = Controller.class
        )
)
public class SpringConfig {

}
