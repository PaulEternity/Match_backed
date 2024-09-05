package com.paul.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.paul.usercenter.mapper.UserTeamMapper;
import com.paul.usercenter.model.domain.UserTeam;
import com.paul.usercenter.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
* @author 30420
* @description 针对表【user_team(用户-队伍表)】的数据库操作Service实现
* @createDate 2024-09-05 10:08:26
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




