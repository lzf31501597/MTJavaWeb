package com.itheima.service.impl;

import com.itheima.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author
 * @version 1.0
 * @date 2024/05/28 15:09
 * @Description
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service save()");
    }
}
