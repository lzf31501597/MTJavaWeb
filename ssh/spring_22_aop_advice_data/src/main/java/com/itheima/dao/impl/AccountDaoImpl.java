package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import org.springframework.stereotype.Repository;


/**
 * @author
 * @version 1.0
 * @date 2024/05/14 14:13
 * @Description
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Override
    public String findName(int id, String name) {
        System.out.println("id:" + id);
        if(true)throw new NullPointerException();
        return "itcast";
    }
}
