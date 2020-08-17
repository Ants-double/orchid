package com.ants.orchid.pojo.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/8/17
 */
@Data
@ApiModel("项目实体")
public class ProjectPo {
    @ApiModelProperty(value = "项目 id",required = false,hidden = true)

    private String id;
    @ApiModelProperty("项目名")
    private String projectName;
    @ApiModelProperty("添加人")
    private String addName;
    @ApiModelProperty("项目描述")
    private String projectScan;
    @ApiModelProperty("项目负责人")
    private String projectCharge;
    @ApiModelProperty("项目类型,后面改为枚举，先这样用")
    private String projectType;
    @ApiModelProperty(value = "项目最后一次修改时间",required = false,hidden = true)
    private String gmtModified;
    @ApiModelProperty(value = "项目添加时间",required = false,hidden = true)
    private String gmtCreate;
}
