package com.itheima.controller.bak;

import org.springframework.web.bind.annotation.*;


/**
 * @author
 * @version 1.0
 * @date 2024/06/27 18:01
 * @description
 */
@RestController
@RequestMapping("/books1")
public class BookController1 extends BaseClass {

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
