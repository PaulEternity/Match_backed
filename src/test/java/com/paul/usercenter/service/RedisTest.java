package com.paul.usercenter.service;

import com.paul.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("nobody", "wdf");
        valueOperations.set("nob", 1);
        valueOperations.set("sb", 2.0);
        User user = new User();
        user.setId(1L);
        user.setUserName("paul");
        Object someBody = valueOperations.get("nobody");
        Assertions.assertTrue("wdf".equals((String)someBody));
        valueOperations.set("ppp", user);
//        Assertions.assertTrue(1==(Integer)someBody);
        valueOperations.get("nobody");
        valueOperations.get("nob");
        valueOperations.get("sb");

    }
}
