package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */

//@Component("bookDao")
@Repository
//@Controller
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save()");
    }
}
