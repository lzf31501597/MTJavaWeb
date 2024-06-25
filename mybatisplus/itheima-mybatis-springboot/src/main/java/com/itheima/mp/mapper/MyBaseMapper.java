package com.itheima.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/24 15:21
 * @description
 */
public interface MyBaseMapper<T> extends BaseMapper<T> {
    List<T> findAll();

    //扩展其他的方法
}
