package com.itheima.dao;


import org.apache.ibatis.annotations.Select;


/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:37
 * @Description
 */
public interface ResourcesDao {
    public boolean readResources(String url, String password);
}
