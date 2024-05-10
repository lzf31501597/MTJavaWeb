package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:52
 * @Description
 */
public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resources = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resources);
        /*BookDao bookDao = beanFactory.getBean(BookDao.class);
        bookDao.save();*/
    }
}
