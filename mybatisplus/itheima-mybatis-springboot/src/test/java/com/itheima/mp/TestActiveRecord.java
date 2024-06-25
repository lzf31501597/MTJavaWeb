package com.itheima.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.mp.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/20 17:40
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestActiveRecord {

    @Test
    public void testSelectById(){

        User user = new User();
        user.setId(23L);

        User user1 = user.selectById();
        System.out.println(user1);

    }

    @Test
    public void testInsert(){

        User user = new User();
        user.setId(1L);
        user.setName("smith1");
        user.setAge(30);
        user.setPassword("123");

        boolean flag = user.insert();
        System.out.println(flag);

    }

    @Test
    public void testInsertAll() {
        for (int i = 0; i < 10; i++) {
            User user1 = new User();
            user1.setName("smith"+ i);
            user1.setAge(30+i);
            user1.setPassword("321");
            user1.insert();
        }
        for (int i = 0; i < 10; i++) {
            User user1 = new User();
            user1.setName("tom"+ i);
            user1.setAge(10+i);
            user1.setPassword("321");
            user1.insert();
        }
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("james" + i);
            user.setAge(20+i);
            user.setPassword("321");
            user.insert();
        }
    }

    @Test
    public void testOracleInsertAll() {
        for (int i = 0; i < 10; i++) {
            User user1 = new User();
            user1.setName("smith"+ i);
            user1.setAge(30+i);
            user1.setPassword("321");
            user1.setUser_name("smith"+ i);
            user1.setEmail("smith"+ i+"@itheima.com");
            user1.insert();
        }
        for (int i = 0; i < 10; i++) {
            User user1 = new User();
            user1.setName("tom"+ i);
            user1.setAge(10+i);
            user1.setPassword("321");
            user1.setUser_name("tom"+ i);
            user1.setEmail("tom"+ i+"@itheima.com");
            user1.insert();
        }
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("james" + i);
            user.setAge(20+i);
            user.setPassword("321");
            user.setUser_name("james"+ i);
            user.setEmail("james"+ i+"@itheima.com");
            user.insert();
        }
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("smith10");

        boolean b = user.updateById();
        System.out.println("b =>" + b);
    }

    @Test
    public void testDelete(){
        User user = new User();
        user.setId(1L);

        boolean b = user.deleteById();
        System.out.println("b =>" + b);
    }

    @Test
    public void testSelect(){
        User user = new User();

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("age", 15).le("age", 35);

        List<User> users = user.selectList(queryWrapper);
        for (User user1 : users){
            System.out.println(user1);
        }
    }
}
