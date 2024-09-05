package com.paul.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.paul.usercenter.model.domain.Team;
import com.paul.usercenter.model.domain.User;

/**
* @author 30420
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-09-05 10:05:08
*/
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     * @param team
     * @return
     */
    long addTeam(Team team, User loginUser);


}
