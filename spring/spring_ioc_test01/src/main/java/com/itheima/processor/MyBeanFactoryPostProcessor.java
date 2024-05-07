package com.itheima.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author
 * @version 1.0
 * @date 2024/02/22 15:27
 * @Description
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor方法 postProcessBeanFactory()。。。");
        //System.out.println("beanDefinitionMap填充完毕后回调该方法。。。");
        //修改某个BeanDefinition
        /*BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("userService");
        beanDefinition.setBeanClassName("com.itheima.dao.impl.UserDaoImpl");*/

        //注册BeanDefinition
        /*BeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClassName("com.itheima.dao.impl.PersonDaoImpl");
        //强制转换成DefaultListableBeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableListableBeanFactory;
        defaultListableBeanFactory.registerBeanDefinition("personDao", beanDefinition);*/
    }
}
