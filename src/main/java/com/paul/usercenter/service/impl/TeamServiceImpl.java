package com.paul.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.paul.usercenter.model.domain.Team;
import com.paul.usercenter.mapper.TeamMapper;
import com.paul.usercenter.service.TeamService;
import org.springframework.stereotype.Service;

/**
* @author 30420
* @description 针对表【team(队伍)】的数据库操作Service实现
* @createDate 2024-09-05 10:05:08
*/
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
    implements TeamService{

}




