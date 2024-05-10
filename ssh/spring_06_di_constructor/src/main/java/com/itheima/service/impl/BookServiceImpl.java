package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.dao.impl.UserDaoImpl;
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

    /*public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }


    @Override
    public void save() {
        System.out.println("book service save()");
        bookDao.save();
        userDao.save();
    }

}
