package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author
 * @version 1.0
 * @date 2024/06/27 10:36
 * @description
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
