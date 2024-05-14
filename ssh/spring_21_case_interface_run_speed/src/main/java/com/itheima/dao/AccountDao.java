package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:37
 * @Description
 */
public interface AccountDao {
    @Insert("insert into tb_account(account_name, money) values(#{name},#{money})")
    void save(Account account);

    @Delete("delete from tb_account where id = #{id}")
    void delete(Integer id);

    @Update("update tb_account set account_name = #{name}, money = #{money}")
    void update(Account account);

    @Select("select * from tb_account")
    List<Account> findAll();

    @Select("select * from tb_account where id = #{id}")
    Account findById(int id);
}
