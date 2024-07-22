package com.itheima.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author
 * @version 1.0
 * @date 2024/06/27 14:08
 * @description
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public List<Book> getAll() {
        QueryWrapper<Book> bookQueryWrapper = new QueryWrapper<>();
        List<Book> bookList = bookDao.selectList(bookQueryWrapper);
        return bookList;
    }


}
