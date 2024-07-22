package com.itheima;

import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
class Springboot17MongoApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Test
    void testSave() {
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setDescription("MongoDb"+i);
            book.setType("MongoDb"+i);
            book.setName("MongoDb"+i);
            mongoTemplate.save(book);
        }

    }

    @Test
    void testRemove() {
        //mongoTemplate.re("ObjectId(\"669dbaafd782da1131fb8da2\")")
    }

    @Test
    void testUpdate() {
        //mongoTemplate.
    }

    @Test
    void testFind() {
        // Book book = mongoTemplate.findById(0, Book.class);
        // System.out.println(book);

        List<Book> all = mongoTemplate.findAll(Book.class);
        System.out.println(all);
    }

}
