package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */
public class  BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    public BookDaoImpl(String databaseName, int connectionNum ) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        //System.out.println("book dao save() ");
        System.out.println("book dao save() " + databaseName + " , " + connectionNum);
    }
}
