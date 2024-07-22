package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.elasticsearch.annotations.Mapping;

/**
 * @author
 * @version 1.0
 * @date 2024/07/22 15:58
 * @description
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
