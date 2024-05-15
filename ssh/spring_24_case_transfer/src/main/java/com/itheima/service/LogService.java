package com.itheima.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2024/05/10 16:26
 * @Description
 */
public interface LogService {
    /**
    * 转账操作
    * @param out 转出方
    * @param in 转入方
    * @param money 金额
    * */

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String out, String in, Double money);
}
