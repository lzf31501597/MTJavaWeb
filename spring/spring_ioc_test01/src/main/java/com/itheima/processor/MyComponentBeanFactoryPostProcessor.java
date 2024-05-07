package com.itheima.processor;

import com.itheima.utils.BaseClassScanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

import java.util.Map;
import java.util.stream.BaseStream;

/**
 * @author
 * @version 1.0
 * @date 2024/02/22 16:29
 * @Description
 */
public class MyComponentBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        //通过扫描工具去扫描指定包及其子包下的所有类，手机使用 @MyComponent 的注解类
        Map<String, Class> stringClassMap = BaseClassScanUtils.scanMyComponentAnnotation("com.itheima");
        //遍历Map，组装BeanDefinition 进行注册
        stringClassMap.forEach((beanName,clazz)->{
            //获得beanClassName
            String beanClassName= clazz.getName();
            //创建BeanDefinition
            BeanDefinition beanDefinition = new RootBeanDefinition();
            beanDefinition.setBeanClassName(beanClassName);
            //注册
            beanDefinitionRegistry.registerBeanDefinition(beanName, beanDefinition);

        });
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
