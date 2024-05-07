package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.OrderDao;
import com.itheima.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:52
 * @Description
 */
public class AppForInsataceOrder {
    public static void main(String[] args) {

        //实例化Bean对象，2，通过静态工厂创建对象
        /*OrderDao orderDao = OrderDaoFactory.getOrderDao();
        orderDao.save();*/

        //3.获取Ioc容器,（加载配置文件得到上下文对象）
        ApplicationContext cpxa = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        OrderDao orderDao = (OrderDao) cpxa.getBean("orderDao");
        orderDao.save();

        /*BookService bookService = (BookService) cpxa.getBean("bookService");
        bookService.save();*/
    }
}
