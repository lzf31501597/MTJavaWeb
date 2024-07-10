package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookServiceTests {

	@Autowired
	private IBookService bookService;

	@Test
	void testGetById(){
		Book book = bookService.getById(5);
	}

	@Test
	void testSave() {
		Book book = new Book();
		book.setType("测试数据123");
		book.setName("测试数据123");
		book.setDescription("测试数据123");
		bookService.save(book);
	}

	@Test
	void testGetAll(){
		List<Book> bookList = bookService.list();
		for (Book book : bookList){
			System.out.println(book);
		}

	}

	@Test
	void testUpdate(){

		String name = "测试数据123";
		LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
		lambdaQueryWrapper.eq(Book::getName, name);

		Book book = new Book();
		book.setType("测试数据456");
		book.setName("测试数据456");
		book.setId(35);

		bookService.update(book, null);
	}

	@Test
	void testDelete(){

		bookService.delete(34);
	}

	@Test
	void testGetPage(){
		IPage<Book> bookPage = bookService.getPage(1, 10);
		System.out.println(bookPage.getCurrent());
		System.out.println(bookPage.getSize());
		System.out.println(bookPage.getTotal());
		System.out.println(bookPage.getPages());
		System.out.println(bookPage.getRecords());
	}

}
