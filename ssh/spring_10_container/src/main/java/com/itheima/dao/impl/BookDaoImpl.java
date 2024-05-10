package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

import java.util.*;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */
public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("constructor");
    }


    @Override
    public void save() {
        System.out.println("book dao save()  ");
    }
}
