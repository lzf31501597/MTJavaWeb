package com.itheima.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:37
 * @Description
 */
public interface LogDao {
    @Insert("insert into tb_log(info,createDate) values (#{info}, now())")
    void log(String info);


}
