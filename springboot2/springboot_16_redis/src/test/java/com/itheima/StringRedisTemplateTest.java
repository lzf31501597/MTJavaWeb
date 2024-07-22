package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author
 * @version 1.0
 * @date 2024/07/19 16:43
 * @description
 */
@SpringBootTest
public class StringRedisTemplateTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void testStringRedisGet(){
        ValueOperations<String, String> svo = stringRedisTemplate.opsForValue();
        String s = svo.get("name");
        System.out.println(s);
        String s1 = svo.get("name2");
        System.out.println(s1);
    }
}
