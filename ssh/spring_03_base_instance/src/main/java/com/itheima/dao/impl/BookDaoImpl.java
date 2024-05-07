package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */
public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {//实例化Bean，1，是加载无参构造器
        System.out.println("book dao constructor is running....");
    }

    @Override
    public void save() {
        System.out.println("book dao save()");
    }
}
