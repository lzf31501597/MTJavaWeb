package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/28 18:07
 * @Description
 */

@Mapper
public interface UserDao extends BaseMapper<User> {

    //public User getById(Long id);

    //public List<User> getAll();
}
