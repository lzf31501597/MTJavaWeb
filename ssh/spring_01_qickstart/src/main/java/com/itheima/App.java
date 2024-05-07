package com.itheima;

import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:32
 * @Description ${Description}
 */

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}