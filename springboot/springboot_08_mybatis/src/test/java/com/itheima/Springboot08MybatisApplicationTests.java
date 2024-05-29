package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot08MybatisApplicationTests {
	@Autowired
	private BookDao bookDao;

	@Test
	void testGetAll() {
		List<Book> all = bookDao.getAll();
		System.out.println(all);
	}

	@Test
	void testGetById() {
		Book book = bookDao.getById(5);
		System.out.println(book);
	}

}
