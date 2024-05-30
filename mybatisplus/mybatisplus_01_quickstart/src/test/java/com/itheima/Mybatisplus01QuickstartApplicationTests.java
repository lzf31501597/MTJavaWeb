package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave(){
        User user = new User();
        user.setName("黑马程序员");
        user.setAge(18);
        user.setTel("123432432423");
        user.setPassword("heima");
        userDao.insert(user);
    }

    @Test
    void testDelete(){
        userDao.deleteById(1795620054752002050L);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("Tom");
        user.setPassword("smith");
        user.setTel("123123213");
        user.setAge(23);
        userDao.updateById(user);
    }

    @Test
    void testGetById(){
        User users = userDao.selectById(2L);
        System.out.println(users);
    }



    @Test
    void testGetAll() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    @Test
    void testGetPage(){
        IPage page = new Page(2, 3);
        userDao.selectPage(page, null);
        System.out.println("当前页码值：" + page.getCurrent());
        System.out.println("每页显示数：" + page.getSize());
        System.out.println("一共多少页：" + page.getPages());
        System.out.println("一共多少条数据：" + page.getTotal());
        System.out.println("数据：" + page.getRecords());

    }
}
