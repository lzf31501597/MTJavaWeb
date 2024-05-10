package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */

//@Component("bookDao")
@Repository
//@Controller
@Scope("singleton")//默认singleton单例, prototype非单例
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save()");
    }

    @PostConstruct
    public void init() {
        System.out.println("book dao init()");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("book dao destroy()");
    }
}
