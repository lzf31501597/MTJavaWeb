package com.itheima.service;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/10 16:26
 * @Description
 */
public interface AccountService {
    /**
    * 转账操作
    * @param out 转出方
    * @param in 转入方
    * @param money 金额
    * */

    @Transactional //(rollbackFor = {IOException.class})
    public void transfer(String out, String in, Double money) throws IOException;
}
