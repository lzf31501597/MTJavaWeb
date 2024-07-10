package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot05MybatisPlusApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        List<Book> books = bookDao.selectList(queryWrapper);

        for (Book book : books){
            System.out.println(book);
        }

    }

}
