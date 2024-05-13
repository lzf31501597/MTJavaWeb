package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
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
@Repository("bookDao")
//@Controller
//@Scope("singleton")//默认singleton单例, prototype非单例
public class BookDaoImpl implements BookDao {
    //@Value("itheima")
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save() " + name);
    }
}
