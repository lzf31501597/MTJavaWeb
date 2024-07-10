package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author
 * @version 1.0
 * @date 2024/06/26 17:15
 * @description
 */
@Mapper
public interface BookDao {

    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);
}
