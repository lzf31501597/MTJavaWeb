package com.itheima.mp.simple.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.mp.simple.pojo.User;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/18 11:53
 * @description
 */

public interface UserMapper extends BaseMapper<User> {

    public List<User> findAll();
}
