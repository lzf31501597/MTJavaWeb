package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import com.itheima.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/27 18:01
 * @description
 */
@RestController
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    private MsgService msgService;

    @PostMapping
    public boolean check(String tele, String code){
        return msgService.check(tele, code);
    }

    @GetMapping("{tele}")
    public String get(@PathVariable String tele){
        return msgService.get(tele);
    }

}
