package com.demo.sample.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单资源关系表
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_menu_resource")
public class MenuResource implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单ID
     */
    private Integer menuId;

    /**
     * 资源ID
     */
    private String resourceId;


    public static final String ID = "id";

    public static final String MENU_ID = "menu_id";

    public static final String RESOURCE_ID = "resource_id";

}
