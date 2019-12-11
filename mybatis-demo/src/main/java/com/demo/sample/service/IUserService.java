package com.demo.sample.service;

import com.demo.sample.entity.User;

import java.util.List;

import org.crown.enums.StatusEnum;
import org.crown.model.dto.TokenDTO;
import org.crown.model.dto.UserDetailsDTO;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
public interface IUserService extends IService<User> {
	/**
     * 用户登陆
     *
     * @param loginName
     * @param password
     * @param ipAddr
     * @return
     */
    User login(String loginName, String password, String ipAddr);

    /**
     * 通过用户对象获取token
     *
     * @param user
     * @return
     */
    TokenDTO getToken(User user);

    /**
     * 获取用户详情
     *
     * @param uid
     * @return
     */
    UserDetailsDTO getUserDetails(Integer uid);

    /**
     * 用户修改密码
     *
     * @param uid
     * @param oldPassword
     * @param newPassword
     * @return
     */
    void updatePassword(Integer uid, String oldPassword, String newPassword);

    /**
     * 重置用户密码
     *
     * @param uid
     */
    void resetPwd(Integer uid);

    /**
     * @param uid
     * @param status
     */
    void updateStatus(Integer uid, StatusEnum status);

    /**
     * 添加用户角色
     *
     * @param uid
     * @param roleIds
     */
    void saveUserRoles(Integer uid, List<Integer> roleIds);

    /**
     * 根据用户ID获取角色
     *
     * @param uid
     * @return
     */
    List<Integer> getRoleIds(Integer uid);
}
