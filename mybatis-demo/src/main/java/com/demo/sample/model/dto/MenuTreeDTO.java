package com.demo.sample.model.dto;

import com.demo.sample.framework.model.TreeNode;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MenuTreeDTO extends TreeNode {

	@ApiModelProperty(notes = "菜单名称")
    private String menuName;
    @ApiModelProperty(notes = "类型:1:目录,2:菜单,3:按钮")
    private Integer menuType;
    @ApiModelProperty(notes = "映射地址")
    private String router;
    @ApiModelProperty(notes = "路径")
    private String path;
    @ApiModelProperty(notes = "图标")
    private String icon;
    @ApiModelProperty(notes = "别名")
    private String alias;
}
