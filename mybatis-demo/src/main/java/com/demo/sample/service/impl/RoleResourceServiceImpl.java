package com.demo.sample.service.impl;

import com.demo.sample.entity.RoleResource;
import com.demo.sample.mapper.RoleResourceMapper;
import com.demo.sample.service.IRoleResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色资源关系表 服务实现类
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
@Service
public class RoleResourceServiceImpl extends ServiceImpl<RoleResourceMapper, RoleResource> implements IRoleResourceService {

}
