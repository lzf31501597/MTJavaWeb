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
        //业务执行次数
        for (int i = 0; i < 10000; i++){
            System.out.println("book dao sava()");
        }
        //结束时间
        long endTime = System.currentTimeMillis();
        //计算时间差
        long totalTime = endTime - startTime;
        //输出信息
        System.out.println("执行万次消耗时间：" + totalTime + "ms");
    }

    @Override
    public void update() {
        System.out.println("book dao update()");
    }

    @Override
    public void delete() {
        System.out.println("book dao delete()");
    }

    @Override
    public void select() {
        System.out.println("book dao select()");
    }
}
