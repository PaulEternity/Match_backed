package com.paul.usercenter.model.vo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户包装类
 * @TableName user
 */
@TableName(value ="user")
@Data
public class UserVO implements Serializable {
    /**
     * 
     */
    private long id;

    /**
     * 
     */
    private String userAccount;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String avatarUrl;

    /**
     * 
     */
    private Integer gender;


    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private Integer userStatus;

    /**
     * 
     */
    private Date creatTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 标签列表
     */
    private String tags;


    /**
     * 用户角色 0：普通用户 1：管理员
     */
    private Integer userRole;

    /**
     * 编号
     */
    private String planetCode;

    private static final long serialVersionUID = 1L;
}