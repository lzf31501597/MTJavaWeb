package com.javaTest.manhanlou26.services;

import com.javaTest.manhanlou26.dao.MenuDAO;
import com.javaTest.manhanlou26.domain.Menu;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2023/12/09 11:06
 * @Description 完成对menu表的各种操作（通过MenuDAO）
 */
public class MenuService {

    //定义MenuDAO 属性
    private MenuDAO menuDAO = new MenuDAO();

    //返回所有菜品，返回给界面使用
    public List<Menu> list() {
        String sql = "select * from menu";
        return menuDAO.queryMultplay(sql, Menu.class);
    }

    //需求方法，根据ID，返回Menu对象

    public Menu getMenuById(int id) {
        String sql = "select * from menu where id = ?";
        return menuDAO.querySingle(sql, Menu.class, id);
    }
}
