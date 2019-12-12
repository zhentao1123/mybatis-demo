package com.demo.sample.service.impl;

import com.demo.sample.entity.User;
import com.demo.sample.enums.StatusEnum;
import com.demo.sample.mapper.UserMapper;
import com.demo.sample.model.dto.TokenDTO;
import com.demo.sample.model.dto.UserDetailsDTO;
import com.demo.sample.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public User login(String loginName, String password, String ipAddr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TokenDTO getToken(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetailsDTO getUserDetails(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePassword(Integer uid, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPwd(Integer uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStatus(Integer uid, StatusEnum status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveUserRoles(Integer uid, List<Integer> roleIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getRoleIds(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
