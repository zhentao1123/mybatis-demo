package com.demo.sample.service.impl;

import com.demo.sample.entity.User;
import com.demo.sample.mapper.UserMapper;
import com.demo.sample.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
