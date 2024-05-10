package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:39
 * @Description
 */

//@Component
@Service
public class BookServiceImpl implements BookService {
    @Autowired//（必须）自动加载，位置随便，不需要set方法
    @Qualifier("bookDao")//用来指定自动加载哪个bean
    //5，删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao; // = new BookDaoImpl();
    @Override
    public void save() {
        System.out.println("book service save()");
        bookDao.save();
    }
    //6,提供对应DAO对象的set方法

    /*public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }*/
}
