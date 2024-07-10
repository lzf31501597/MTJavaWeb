package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookDaoTests {

	@Autowired
	private BookDao bookDao;

	@Test
	void testGetById(){
		Book book = bookDao.selectById(5l);
	}

	@Test
	void testSave() {
		Book book = new Book();
		book.setType("测试数据123");
		book.setName("测试数据123");
		book.setDescription("测试数据123");
		bookDao.insert(book);
	}

	@Test
	void testGetAll(){
		List<Book> bookList = bookDao.selectList(null);
		for (Book book : bookList){
			System.out.println(book);
		}

	}

	@Test
	void testGetPage(){
		IPage<Book> bookPage = new Page<>(1,10);
		bookDao.selectPage(bookPage, null);

		System.out.println(bookPage.getCurrent());
		System.out.println(bookPage.getSize());
		System.out.println(bookPage.getTotal());
		System.out.println(bookPage.getPages());
		System.out.println(bookPage.getRecords());
	}

	@Test
	void testGetBybook(){

		String name = null;

		LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();

		//if(name != null) lambdaQueryWrapper.like(Book::getName, name);
		lambdaQueryWrapper.like(name != null, Book::getName, name);

		bookDao.selectList(lambdaQueryWrapper);
	}
}
