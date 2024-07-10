package com.itheima.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.R;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/27 18:01
 * @description
 */
@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true, bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        /* R r = new R();
        boolean flag = bookService.save(book);
        r.setFlag(flag); */

        if (book.getName().equals("123")) throw new IOException();
        boolean flag = bookService.save(book);
        return new R(flag, flag ? "添加成功！！！^_^" : "添加失败！！！-_-");

    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.modify(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, bookService.getById(id));
    }

    /* @GetMapping("/{currentPage}/{pageSize}")
    public R getByPage(@PathVariable int currentPage, @PathVariable int pageSize){

        IPage<Book> page = bookService.getPage(currentPage, pageSize);
        //如果当前页码值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if (currentPage > page.getPages()) {
            page = bookService.getPage((int) page.getPages(), pageSize); //最后页
            //page = bookService.getPage(1, pageSize); //第一页

        }

        return new R(true, page);

    } */

    @GetMapping("/{currentPage}/{pageSize}")
    public R getByPage(@PathVariable int currentPage, @PathVariable int pageSize, Book book){

        System.out.println(book);

        IPage<Book> page = bookService.getPage(currentPage, pageSize, book);
        //如果当前页码值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if (currentPage > page.getPages()) {
            page = bookService.getPage((int) page.getPages(), pageSize, book); //最后页
            //page = bookService.getPage(1, pageSize); //第一页

        }
        return new R(true, page);
    }
}
