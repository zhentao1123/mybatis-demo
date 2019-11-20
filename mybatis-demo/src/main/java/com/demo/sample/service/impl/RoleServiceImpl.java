package com.demo.sample.service.impl;

import com.demo.sample.entity.Role;
import com.demo.sample.mapper.RoleMapper;
import com.demo.sample.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
