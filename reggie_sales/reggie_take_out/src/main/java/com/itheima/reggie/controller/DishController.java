package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.DishFlavor;
import com.itheima.reggie.service.CategoryService;
import com.itheima.reggie.service.DishFlavorService;
import com.itheima.reggie.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author
 * @version 1.0
 * @date 2024/06/10 14:39
 * @description 菜品管理
 */

@Slf4j
@RestController
@RequestMapping("/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @Autowired
    private DishFlavorService dishFlavorService;

    @Autowired
    private CategoryService categoryService;

    /**
     * @author
     * @description
     * @param dishDto
     * @return
    **/
    @PostMapping
    public R<String> save(@RequestBody DishDto dishDto){
        log.info("新增菜品：{}", dishDto.toString());

        //dishService.save(dishDto);
        dishService.saveWithFlavor(dishDto);

        return R.success("新增菜品成功！！！");
    }

    /**
     * @Author
     * @Description 菜品分页查询
     * @Date 14:56 2024/06/05
     * @param page
     * @param pageSize
     * @param name
     * @return
     **/
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name){
        log.info("page = {}, pageSize = {}, name = {}", page, pageSize, name);

        //构建分页构造器
        Page<Dish> pageInfo = new Page<>(page, pageSize);
        Page<DishDto> dishDtoPage = new Page<>();

        //构建条件构造器
        LambdaQueryWrapper<Dish> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.like(StringUtils.isNotEmpty(name), Dish::getName, name);

        //添加排序条件
        lambdaQueryWrapper.orderByDesc(Dish::getUpdateTime);

        //执行查询
        dishService.page(pageInfo, lambdaQueryWrapper);

        //对象拷贝
        BeanUtils.copyProperties(pageInfo, dishDtoPage, "records");

        List<Dish> records = pageInfo.getRecords();
        List<DishDto> list = records.stream().map((item)->{
            DishDto dishDto = new DishDto();

            BeanUtils.copyProperties(item, dishDto);

            Long categoryId = item.getCategoryId();//分类id
            //根据分类id查询分类对象
            Category category = categoryService.getById(categoryId);
            String categoryName = category.getName();
            dishDto.setCategoryName(categoryName);

            return dishDto;
        }).collect(Collectors.toList());


        dishDtoPage.setRecords(list);

        //return R.success(pageInfo);
        return R.success(dishDtoPage);
    }

    /**
     * @Author
     * @Description 根据id查询菜品信息和对应的口味信息
     * @Date 16:30 2024/06/06
     * @param id
     * @return
     **/
    @GetMapping("/{id}")
    public R<DishDto> getById(@PathVariable Long id){
        log.info("根据id查询菜品信息！！！{}"+ id);

        DishDto dishDto = dishService.getByIdWithFlavor(id);

        return R.success(dishDto);
    }


    /**
     * @author
     * @description 修改菜品
     * @param dishDto
     * @return
     **/
    @PutMapping
    public R<String> update(@RequestBody DishDto dishDto){
        log.info(dishDto.toString());

        dishService.updateWithFlavor(dishDto);

        return R.success("修改菜品成功");

    }


    @PostMapping("/status/{status, ids}")
    public R<String> updateStatus(@PathVariable int status,@PathVariable List<Long> ids){
        log.info("修改菜品状态的 ids:{}"+ ids);

        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<Dish>();

        Iterator<Long> iterator = ids.iterator();
        while (iterator.hasNext()){
            Long dishId = iterator.next();
            dishLambdaQueryWrapper.eq(Dish::getId, dishId);
            Dish entity = dishLambdaQueryWrapper.getEntity();
            entity.setStatus(status);
        }

        dishService.update(dishLambdaQueryWrapper);

        return R.success("修改菜品状态成功！！！");
    }

    @DeleteMapping()
    public R<String> deleteByIds(@PathVariable List<Long> ids){
        log.info("删除菜品的 ids:{}"+ ids);

        dishService.removeByIds(ids);
        dishFlavorService.removeByIds(ids);

        return R.success("删除菜品状态成功！！！");
    }

}
