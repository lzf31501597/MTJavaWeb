package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author
 * @version 1.0
 * @date 2024/06/27 16:38
 * @description
 */
public interface IBookService extends IService<Book> {

    boolean save(Book book);
    boolean modify(Book book);
    boolean delete(Integer id);
    IPage<Book> getPage(int currentPage, int pageSize);
    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
