package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @author
 * @version 1.0
 * @date 2024/05/31 14:42
 * @Description
 */
public interface CategoryService extends IService<Category> {

    public void remove(Long id);
}
