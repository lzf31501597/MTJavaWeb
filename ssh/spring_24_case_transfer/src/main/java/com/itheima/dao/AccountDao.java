package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:37
 * @Description
 */
public interface AccountDao {
    @Update("update tb_account set money = money + #{money} where name = #{name}")
    void inMoney(@Param("name") String name, @Param("money") Double money);

    @Update("update tb_account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name") String name, @Param("money") Double money);

}
