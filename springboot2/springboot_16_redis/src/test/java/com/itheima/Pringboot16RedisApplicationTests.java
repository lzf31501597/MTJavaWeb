package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Pringboot16RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    void testRedisSet() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        //valueOperations.set("age", 41);
        valueOperations.set("name", "itheima");
        valueOperations.set("name2", "itcast");
        System.out.println(valueOperations.get("name"));
        System.out.println(valueOperations.get("name2"));
        System.out.println(valueOperations.get("age"));
    }

    @Test
    void testRedisHset() {
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.put("info", "a", "aa");
        hashOperations.put("info2", "a2", "aa2");

        Object info = hashOperations.get("info", "a");
        System.out.println(info);
        Object info2 = hashOperations.get("info2", "a2");
        System.out.println(info2);
    }

}
