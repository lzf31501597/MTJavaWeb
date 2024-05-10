package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */

//@Component("bookDao")
@Repository("bookDao2")
//@Controller
//@Scope("singleton")//默认singleton单例, prototype非单例
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save()22222");
    }
}
