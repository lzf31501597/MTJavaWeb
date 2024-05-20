package com.itheima.service;

import com.itheima.domain.Book;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/20 14:59
 * @Description
 */
public interface BookService {
    /**
    * baocun
     * @param book
     * @return
    * */
    public boolean save(Book book);
    /**
     * xiugai
     * @param book
     * @return
     * */
    public boolean update(Book book);
    /**
     * genjuid  delete
     * @param id
     * @return
     * */
    public boolean delete(Integer id);
    /**
     * chaxun
     * @param id
     * @return
     * */
    public Book getById(Integer id);
    /**
     * chaxun quanbu
     * @return
     * */
    public List<Book> getAll();
}
