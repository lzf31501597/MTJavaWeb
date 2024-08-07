package com.itheima.service.impl;

import com.alicp.jetcache.anno.*;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    @Cached(name = "book_", key = "#id", expire = 3600, cacheType = CacheType.REMOTE)
    @CacheRefresh(refresh = 5)
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    @CacheUpdate(name = "book_", key = "#book.id", value = "#book")
    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    @CacheInvalidate(name = "book_", key = "#id")
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage<Book> bookIPage = new Page<>(currentPage, pageSize);
        return bookDao.selectPage(bookIPage, null);
    }
}
