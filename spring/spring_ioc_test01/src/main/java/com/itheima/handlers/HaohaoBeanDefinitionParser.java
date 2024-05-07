package com.itheima.handlers;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @author
 * @version 1.0
 * @date 2024/03/08 14:18
 * @Description
 */
public class HaohaoBeanDefinitionParser implements BeanDefinitionParser {
    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {

        //注入一个BeanPostProcessor //BeanPostProcessorを注入する
        BeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClassName("com.itheima.handlers.HaohaoBeanPostProcessor");
        //登録する
        parserContext.getRegistry().registerBeanDefinition("haohaoBeanPostProcessor", beanDefinition);
        return beanDefinition;
    }
}
