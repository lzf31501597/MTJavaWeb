package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/31 14:51
 * @Description
 */

@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 新增分类
     * @param category
     * @return
     */
    @PostMapping
    public R<String> save(@RequestBody Category category){
        log.info("新增分类：{}", category.toString());

        categoryService.save(category);

        return R.success("新增分类成功！！！");
    }


    /**
     * @Author
     * @Description 分类分页查询
     * @Date 14:56 2024/06/05
     * @param page
     * @param pageSize
     * @return
     **/
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize){
        log.info("page = {}, pageSize = {}", page, pageSize);

        //构建分页构造器
        Page pageInfo = new Page(page, pageSize);

        //构建条件构造器
        LambdaQueryWrapper<Category> lambdaQueryWrapper = new LambdaQueryWrapper();

        //添加排序条件
        lambdaQueryWrapper.orderByDesc(Category::getSort);

        //执行查询
        categoryService.page(pageInfo, lambdaQueryWrapper);

        return R.success(pageInfo);
    }

    /**
     * @Author
     * @Description 根据id修改分类信息
     * @Date 17:26 2024/06/05
     * @param category
     * @return
     **/
    @PutMapping
    public R<String> update(@RequestBody Category category){
        log.info(category.toString());

        categoryService.updateById(category);

        return R.success("分类信息修改成功！！！");
    }

    /**
     * @Author
     * @Description 根据id查询分类信息
     * @Date 16:30 2024/06/06
     * @param id
     * @return
     **/
    @GetMapping("/{id}")
    public R<Category> getById(@PathVariable Long id){
        log.info("根据id查询分类信息！！！");
        Category category = categoryService.getById(id);

        return R.success(category);
    }

    /**
     * @Author
     * @Description 根据id删除分类信息
     * @Date 16:30 2024/06/06
     * @param id
     * @return
     **/
    @DeleteMapping
    public R<String> delete(Long id){
        log.info("根据id删除分类信息！！！id：{}" + id);

        //categoryService.removeById(id);
        categoryService.remove(id);

        return R.success("分类信息删除成功！！！");
    }

    /**
     * @author
     * @description 根据条件查询分类数据
     * @param category
     * @return
    **/
    @GetMapping("/list")
    public R<List<Category>> list(Category category){
        LambdaQueryWrapper<Category> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(category.getType() != null, Category::getType, category.getType());
        lambdaQueryWrapper.orderByAsc(Category::getSort).orderByDesc(Category::getUpdateTime);

        List<Category> list = categoryService.list(lambdaQueryWrapper);
        return R.success(list);
    }

}
