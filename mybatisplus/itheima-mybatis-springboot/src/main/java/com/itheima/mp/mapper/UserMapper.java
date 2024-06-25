package com.itheima.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.mp.pojo.User;

/**
 * @author
 * @version 1.0
 * @date 2024/06/18 15:11
 * @description
 */
public interface UserMapper extends MyBaseMapper<User> {

    User findById(Long id);
}
