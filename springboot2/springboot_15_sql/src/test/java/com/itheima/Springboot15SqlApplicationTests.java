package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Springboot15SqlApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void testBookDao() {
        Book book = bookDao.selectById(1);
        System.out.println(book);
    }

    /* @Autowired
    private JdbcTemplate jdbcTemplate; */

    @Test
    void testJdbcTemplate(@Autowired JdbcTemplate jdbcTemplate){
        // String sql = "select * from tb_book where id = 1";
        String sql = "select * from tb_book";
        /* List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps); */


        RowMapper<Book> rm = new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setType(resultSet.getString("type"));
                book.setName(resultSet.getString("name"));
                book.setDescription(resultSet.getString("description"));
                return book;
            }
        };
        List<Book> list = jdbcTemplate.query(sql, rm);
        Iterator<Book> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    void testJdbcTemplateInsert(@Autowired JdbcTemplate jdbcTemplate){

        String sql = "INSERT INTO TB_BOOK VALUES(9,'JdbcTemplateInsert', 'JdbcTemplateInsert', 'JdbcTemplateInsert')";
        jdbcTemplate.update(sql);

        String sql1 = "SELECT * FROM TB_BOOK";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql1);

        Iterator<Map<String, Object>> iterator = maps.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
