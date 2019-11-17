package com.demo.sample.service.impl;

import com.demo.sample.model.entity.User;
import com.demo.sample.mapper.UserMapper;
import com.demo.sample.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author BobZ
 * @since 2019-11-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
