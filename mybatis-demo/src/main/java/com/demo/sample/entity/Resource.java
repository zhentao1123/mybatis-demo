package com.demo.sample.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 资源表
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_resource")
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 路径映射
     */
    private String mapping;

    /**
     * 请求方式
     */
    private String method;

    /**
     * 权限认证类型
     */
    private Integer authType;

    private LocalDateTime updateTime;

    /**
     * 权限标识
     */
    private String perm;


    public static final String ID = "id";

    public static final String RESOURCE_NAME = "resource_name";

    public static final String MAPPING = "mapping";

    public static final String METHOD = "method";

    public static final String AUTH_TYPE = "auth_type";

    public static final String UPDATE_TIME = "update_time";

    public static final String PERM = "perm";

}
