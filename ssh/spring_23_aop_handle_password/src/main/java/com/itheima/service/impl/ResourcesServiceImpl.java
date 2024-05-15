package com.itheima.service.impl;

import com.itheima.dao.ResourcesDao;
import com.itheima.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author
 * @version 1.0
 * @date 2024/05/14 14:13
 * @Description
 */
@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private ResourcesDao resourcesDao;

    @Override
    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url, password);
    }
}
