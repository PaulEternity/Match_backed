package com.paul.usercenter.once;
import java.util.Date;

import com.paul.usercenter.mapper.UserMapper;
import com.paul.usercenter.model.domain.User;
import com.paul.usercenter.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;

@Component
public class InsertUsers {
    @Resource
    private UserMapper userMapper;

    /**
     * 批量插入用户
     */
    public void doInsertUsers() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        final int INSERT_NUM = 100;
        for (int i = 0; i < INSERT_NUM; i++) {
            User user = new User();
            user.setUserAccount("");
            user.setUserName("假用户");
            user.setAvatarUrl("");
            user.setGender(0);
            user.setUserPassword("");
            user.setPhone("");
            user.setEmail("");
            user.setUserStatus(0);
            user.setTags("");
            user.setUserRole(0);
            user.setPlanetCode("");

            userMapper.insert(user);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }
}
