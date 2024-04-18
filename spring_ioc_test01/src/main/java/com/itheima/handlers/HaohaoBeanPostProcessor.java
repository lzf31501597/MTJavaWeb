package com.itheima.handlers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author
 * @version 1.0
 * @date 2024/03/08 14:27
 * @Description
 */
public class HaohaoBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("HaohaoBeanPostProcessor被执行。。。."+beanName);
        return bean;//BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
