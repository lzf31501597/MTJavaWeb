package com.itheima.dao.impl;

import com.itheima.dao.ResourcesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


/**
 * @author
 * @version 1.0
 * @date 2024/05/14 14:13
 * @Description
 */
@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        return password.equals("root");//模拟校验
    }

}
