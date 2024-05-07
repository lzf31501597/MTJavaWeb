package com.itheima.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author
 * @version 1.0
 * @date 2024/04/10 14:27
 * @Description
 */
public interface AccountMapper {


    //+money
    @Update("update tb_account set money=money+#{money} where account_name=#{accountName}")
    public void incrMoney(@Param("accountName") String accountName, @Param("money") Integer money);
    //-money
    @Update("update tb_account set money=money-#{money} where account_name=#{accountName}")
    public void decrMoney(@Param("accountName") String accountName, @Param("money") Integer money);

}
