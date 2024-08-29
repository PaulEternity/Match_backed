package com.paul.usercenter.service;

import com.paul.usercenter.contant.UserConstant;
import com.paul.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.paul.usercenter.contant.UserConstant.ADMIN_ROLE;
import static com.paul.usercenter.contant.UserConstant.USER_LOGIN_STATE;

/**
 * @author 30420
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2024-04-21 19:22:23
 * 通用的写到service里
 */
public interface UserService extends IService<User> {

    /**
     * 用户登录态键
     * 通过登录态找到唯一一个值
     */
//     String USER_LOGIN_STATE = "userLoginState";

    /**
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword,String planetCode);

    /**
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request      请求信息
     * @return 脱敏后的用户信息
     */

    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

//    User doLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 根据标签搜索用户
     *
     */
    List<User> searchUsersByTags(List<String> tagNameList);

    /**
     * 判断是否为管理员
     * @param request
     * @return
     */
    boolean isAdmin(HttpServletRequest request) ;

    boolean isAdmin(User loginUser);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUser(User user,User loginUser);

    /**
     * 获取当前登录用户信息
     * @return
     */
    User getLoginUser(HttpServletRequest request);

}
