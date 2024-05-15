package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/10 16:25
 * @Description
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    @Override
    public void transfer(String out, String in, Double money) throws IOException {
        try {
            accountDao.outMoney(out, money);
            int i = 1/0;
            //if(true){throw new IOException();}
            accountDao.inMoney(in, money);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            logService.log(out, in, money);
        }
    }
}
