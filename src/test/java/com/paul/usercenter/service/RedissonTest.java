package com.paul.usercenter.service;

import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class RedissonTest {

    @Autowired
    private RedissonClient redissonClient;

    @Test
    void testRedisson() {
        List<String> list = new ArrayList<>();
        list.add("paul");
        System.out.println("list:" + list.get(0));

        RList<String> rList = redissonClient.getList("test-list");
//        rList.add("paul");
        System.out.println("rList:" + rList.get(0));
        rList.remove("paul");

    }
}