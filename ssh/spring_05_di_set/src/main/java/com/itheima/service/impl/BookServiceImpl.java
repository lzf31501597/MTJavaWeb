package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:39
 * @Description
 */
public class BookServiceImpl implements BookService {

    //5，删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao; // = new BookDaoImpl();
    private UserDao userDao;
    @Override
    public void save() {
        System.out.println("book service save()");
        bookDao.save();
        userDao.save();
    }
    //6,提供对应DAO对象的set方法


    public void setBookDao(BookDao bookDao) {
        //System.out.println("setBookDao(BookDao bookDao)");
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
