package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/20 14:59
 * @Description
 */
//TODO   添加@Mapper
@Mapper
public interface BookDao {
    @Insert("insert into tb_book(type, name, description) values (#{type}, #{name}, #{description})")
    public int save(Book book);
    @Update("update tb_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);
    @Delete("delete from tb_book where id = #{id}")
    public int delete(Integer id);
    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);
    @Select("select * from tb_book")
    public List<Book> getAll();
}
