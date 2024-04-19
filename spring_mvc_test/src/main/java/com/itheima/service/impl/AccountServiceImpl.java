package com.itheima.service.impl;

import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author
 * @version 1.0
 * @date 2024/04/11 11:27
 * @Description
 */

@Service("accountService")
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, timeout = 3)
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, timeout = 3)
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        //开启事务（为了保证两个增减动作同时成功）
        accountMapper.decrMoney(outAccount, money);
        //int i = 1/0;
        accountMapper.incrMoney(inAccount, money);
    }

    public void registAccount(){

    }
}
