package com.demo.sample.service.impl;

import com.demo.sample.entity.Resource;
import com.demo.sample.mapper.ResourceMapper;
import com.demo.sample.service.IResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

}
