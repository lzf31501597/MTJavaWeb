package com.itheima.controller;

import com.itheima.controller.bak.BaseClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author
 * @version 1.0
 * @date 2024/06/27 18:01
 * @description
 */
@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

    // private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String getById(){
        System.out.println("Springboot is running...");

        log.debug("info...");
        log.info("info...");
        log.warn("info...");
        log.error("info...");

        return "Springboot is running...";
    }




}
