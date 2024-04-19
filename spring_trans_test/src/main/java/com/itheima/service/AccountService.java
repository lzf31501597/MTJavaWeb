package com.itheima.service;

/**
 * @author
 * @version 1.0
 * @date 2024/04/11 11:25
 * @Description
 */
public interface AccountService {
    void transferMoney(String outAccount, String inAccount, Integer money);
}
