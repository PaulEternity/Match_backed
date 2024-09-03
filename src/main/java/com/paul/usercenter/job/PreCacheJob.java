package com.paul.usercenter.job;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.paul.usercenter.model.domain.User;
import com.paul.usercenter.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 缓存预热任务
 * 保证第一个打开的人加载速度加快
 */

@Component
@Slf4j
public class PreCacheJob {
    @Resource
    private UserService userService;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    private List<Long> mainUserList = Arrays.asList(1L);

    @Scheduled(cron = "0 31 0 * * *") //任务执行周期 cron表达式
    public void doCacheRecommendUser() {
        for (Long userId : mainUserList) {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            Page<User> userPage = userService.page(new Page<>(1, 20), queryWrapper);
            String redisKey = String.format("match:user:recommend:%s", userId);
            ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
            try {
                valueOperations.set(redisKey, userPage, 30000, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                log.error("Redis set key error", e);
            }
        }
    }
}
