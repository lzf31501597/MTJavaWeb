package com.itheima.init;

import com.itheima.config.SpringConfig;
import com.itheima.config.SpringMVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author
 * @version 1.0
 * @date 2024/04/24 14:41
 * @Description
 */
public class MyAbstractAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {//提供Spring容器的核心配置类
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//提供SpringMVC容器的核心配置类
        return new Class[]{SpringMVCConfig.class};
    }

    @Override
    protected String[] getServletMappings() {//提供前段控制器的映射路劲
        return new String[]{"/"};
    }
}
