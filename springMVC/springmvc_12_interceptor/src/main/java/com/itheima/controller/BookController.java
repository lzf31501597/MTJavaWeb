package com.itheima.controller;



import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.*;



/**
 * @author
 * @version 1.0
 * @date 2024/05/15 14:14
 * @Description
 */


@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save..." + book);
        return "{'module':'book save '}";
    }
    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete id ==>" + id);
        return "{'module':'book delete '}";
    }

    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update  ==>" + book);
        return "{'module':'book update '}";
    }

    @GetMapping(value = "/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("book getById id :" + id);
        return "{'module':'book getById'}";
    }

    @GetMapping
    public String getALL(){
        System.out.println("book getALL");
        return "{'module':'book getALL'}";
    }

}
