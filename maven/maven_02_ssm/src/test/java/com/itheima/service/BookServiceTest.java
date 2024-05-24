package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/20 15:24
 * @Description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book bookId = bookService. getById(2);
        System.out.println(bookId);
    }

    @Test
    public void testGetAll(){
        List<Book> bookList = bookService.getAll();
        System.out.println(bookList);
    }
}
