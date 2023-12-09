package com.javaTest.dao25.test;

import com.javaTest.dao25.dao.ActorDAO;
import com.javaTest.dao25.domain.Actor;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2023/12/08 15:53
 * @Description
 */
public class TestDAO {
    @Test
    public void test(){
        ActorDAO actorDAO = new ActorDAO();
        //1.查询
        String sql = "select * from actor where id >= ?";
        List<Actor> actors = actorDAO.queryMultplay(sql, Actor.class, 1);

        System.out.println("====查询结果====");
        for (Actor actor : actors) {
            System.out.println(actor);
        }

        //2.查询单行记录
        String sql2 = "select * from actor where id = ?";
        Actor actor = actorDAO.querySingle(sql2, Actor.class, 3);
        System.out.println("====查询单行结果====");
        System.out.println(actor);

        //3.查询单行单列
        String sql3 = "select name from actor where id = ?";
        Object o = actorDAO.queryScalar(sql3, Actor.class, 3);
        System.out.println("====查询单行单列====");
        System.out.println(o);

        //4.dml操作 insert，update，delete
        /*String sql4 = "insert into actor values(null, ?, ?, ?, ?)";
        int update = actorDAO.update(sql4, "张无忌", "男", "2023-12-12", "116");
        System.out.println(update > 0 ? "插入成功" : "插入失败");*/

        String sql5 = "update actor set name= ? where name='???'";
        int update1 = actorDAO.update(sql5, "5555");
        System.out.println(update1 > 0 ? "修改成功" : "修改失败");

        String sql6 = "delete from actor where name = ?";
        int update2 = actorDAO.update(sql6, "5555");
        System.out.println(update2 > 0 ? "删除成功" : "删除失败");
    }

}
