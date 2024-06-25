package com.itheima.mp.Injectors;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.AbstractSqlInjector;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/24 15:37
 * @description
 */
public class MySqlInjector extends DefaultSqlInjector {
    @Override
    public List<AbstractMethod> getMethodList() {
        ArrayList<AbstractMethod> lists = new ArrayList<>();

        //获取父类的方法集合
        lists.addAll(super.getMethodList());

        //再扩充自定义方法
        lists.add(new FindAll());

        return lists;
    }
}
