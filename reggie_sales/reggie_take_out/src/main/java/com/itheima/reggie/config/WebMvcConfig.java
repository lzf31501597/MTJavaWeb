package com.itheima.reggie.config;

import com.itheima.reggie.mapper.JacksonObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/30 17:43
 * @Description
 */

@Slf4j
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("开始加载映射静态资源。。。。。。。。。");
        registry.addResourceHandler("/backend/**").addResourceLocations("classpath:/backend/");
        registry.addResourceHandler("/front/**").addResourceLocations("classpath:/front/");

    }

    /**
     * @Author
     * @Description 扩展mvc框架的消息转换器
     * @Date 18:16 2024/06/05
     * @param converters
    **/
    @Override
    protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        log.info("扩展消息转换器！！！"+ converters.toString());
         //创建JSON消息转换器对象
        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
        //设置对象转换器，底层使用Jackson将java对象转为JSON
        messageConverter.setObjectMapper(new JacksonObjectMapper());
        //将上面的消息转换器对象，追加打牌mvc框架的转换器集合中
        converters.add(0, messageConverter);

        /* //创建CBOR消息转换器对象
        MappingJackson2CborHttpMessageConverter cborHttpMessageConverter = new MappingJackson2CborHttpMessageConverter();
        cborHttpMessageConverter.setObjectMapper(new JacksonObjectMapper());
        converters.add(1, cborHttpMessageConverter); */
    }
}
