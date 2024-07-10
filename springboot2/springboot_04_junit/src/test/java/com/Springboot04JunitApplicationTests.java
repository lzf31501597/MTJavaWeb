package com;

import com.itheima.Springboot04JunitApplication;
import com.itheima.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = Springboot04JunitApplication.class)
//@ContextConfiguration(classes = Springboot04JunitApplication.class)

class Springboot04JunitApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void testSave() {
        bookDao.save();
    }

}
