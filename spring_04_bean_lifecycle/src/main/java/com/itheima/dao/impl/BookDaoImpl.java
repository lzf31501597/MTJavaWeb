package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save()");
    }

    public void init(){//表示bean初始化对应的操作
        System.out.println("init()");
    }
    public void destroy(){//表示bean销毁前对应的操作
        System.out.println("destroy()");
    }
}
