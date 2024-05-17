package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 17:21
 * @Description
 */
public interface UserDao {
    @Insert("insert into tb_user(name,money) values(#{name}, #{money})")
    public void save(User user);
}
