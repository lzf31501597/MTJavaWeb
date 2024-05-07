package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.OrderDao;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */
public class OrderDaoImpl implements OrderDao {

    @Override
    public void save() {
        System.out.println("Order dao save()");
    }
}
