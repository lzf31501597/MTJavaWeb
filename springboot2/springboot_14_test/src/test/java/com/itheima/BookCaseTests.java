package com.itheima;

import com.itheima.testcase.domain.BookCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookCaseTests {

    @Autowired
    private BookCase bookCase;

    @Test
    void testBookCase() {
        System.out.println(bookCase);
    }

}
