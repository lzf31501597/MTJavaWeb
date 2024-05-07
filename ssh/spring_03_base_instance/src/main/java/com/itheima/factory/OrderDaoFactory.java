package com.itheima.factory;

import com.itheima.dao.OrderDao;
import com.itheima.dao.impl.OrderDaoImpl;

/**
 * @author
 * @version 1.0
 * @date 2024/04/26 14:49
 * @Description
 */
public class OrderDaoFactory {

    public static OrderDao getOrderDao(){
        System.out.println("factory setup........");
        return new OrderDaoImpl();
    }
}
