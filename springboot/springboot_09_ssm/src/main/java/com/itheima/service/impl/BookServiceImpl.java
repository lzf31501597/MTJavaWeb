package com.itheima.service.impl;

import com.itheima.controller.Code;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.PrintException;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/20 15:00
 * @Description
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao ;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
        //return true;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
        //return true;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
        //return true;
    }

    @Override
    public Book getById(Integer id) {
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "请不要用你的技术，挑战我的耐心！");
        }

        return bookDao.getById(id);

    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
