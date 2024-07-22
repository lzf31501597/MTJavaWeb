package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/27 14:05
 * @description
 */
public interface BookService {

    public Boolean save(Book book);
    public List<Book> getAll();
}
