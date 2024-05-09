package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

import java.util.*;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */
public class BookDaoImpl implements BookDao {
    private int[] arrary;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;

    public void setArrary(int[] arrary) {
        this.arrary = arrary;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("book dao save()");
        System.out.println("遍历数组：" + Arrays.toString(arrary));
        System.out.println("遍历List：" + list);
        System.out.println("遍历Set：" + set);
        System.out.println("遍历Map：" + map);
        System.out.println("遍历Properties：" + properties);
    }
}
