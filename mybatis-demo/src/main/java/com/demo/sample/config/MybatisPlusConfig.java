package com.demo.sample.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.demo.sample.mapper")
public class MybatisPlusConfig {

}
