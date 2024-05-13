package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author
 * @version 1.0
 * @date 2024/05/10 18:09
 * @Description
 */

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        //开始时间
        long startTime = System.currentTimeMillis();
        System.out.println("执行时间：" + startTime + "ms");
        System.out.println("book dao sava()");


    }

    @Override
    public void update(int a) {
        System.out.println("book dao update() "+ a);
    }

}
