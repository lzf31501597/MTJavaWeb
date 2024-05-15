package com.itheima.service.impl;

import com.itheima.dao.LogDao;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 10:48
 * @Description
 */

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    @Override
    public void log(String out, String in, Double money) {
        logDao.log("转账操作由" + out + "到" + in + "，金额" + money);
    }
}
