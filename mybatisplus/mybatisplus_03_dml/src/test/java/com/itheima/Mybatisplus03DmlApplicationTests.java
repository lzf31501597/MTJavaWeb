package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Mybatisplus03DmlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave(){
        User user = new User();
        //user.setId(887l);
        user.setName("黑马程序员");
        user.setAge(18);
        user.setTel("123432432423");
        user.setPassword("heima");
        userDao.insert(user);
    }

    @Test
    void testDeleteAll(){
        List<Long> list = new ArrayList<>();
        list.add(1795731546365112322l);
        list.add(1795733559262007297l);
        userDao.deleteBatchIds(list);
    }

    @Test
    void testDeleteLogic(){
        userDao.deleteById(5L);
        System.out.println(userDao.selectList(null));
    }

    @Test
    void testSelectAll(){
        List<Long> list = new ArrayList<>();
        list.add(1l);
        list.add(3l);
        list.add(4l);
        userDao.selectBatchIds(list);
    }

    @Test
    void testUpdate(){
        /*User user = new User();
        user.setId(3L);
        user.setVersion(1);
        user.setName("Tom88");
        userDao.updateById(user);*/

        //1、先通过id将要修改的数据对象取出来
        User user = userDao.selectById(3l); //version=3
        User user2 = userDao.selectById(3l); //version=3
        //2、再将要修改的数据设置到对象中
        user2.setName("Jock6688");
        userDao.updateById(user2); //version==>4

        user.setName("Jock666");
        //3、通过对象修改保存到数据库中
        userDao.updateById(user);//version=3 条件还成立吗？

    }

}
