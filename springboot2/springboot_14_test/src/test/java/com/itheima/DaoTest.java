package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author
 * @version 1.0
 * @date 2024/07/12 14:54
 * @description
 */
@SpringBootTest
@Transactional
@Rollback(false)
public class DaoTest {

    @Autowired
    private BookService bookService;

    @Test
    void testSave(){
        Book book = new Book();
        book.setDescription("springboot3");
        book.setName("springboot3");
        book.setType("springboot3");
        bookService.save(book);
        bookService.getAll();
    }
}
