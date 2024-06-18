package com.itheima.mp.simple;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.itheima.mp.simple.mapper.*;
import com.itheima.mp.simple.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/18 10:34
 * @description
 */

public class UserTest {
    @Test
    public void testFindAll() throws IOException {
        String configFile = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(configFile);
        SqlSessionFactory build = new MybatisSqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //List<User> users = userMapper.findAll();
        List<User> users = userMapper.selectList(null);

        for (User user : users) {
            System.out.println(user);
        }
    }

}
