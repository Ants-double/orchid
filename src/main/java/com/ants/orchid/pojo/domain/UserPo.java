package com.ants.orchid.pojo.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/8/10
 */
@Data
@ApiModel("用户实体")
public class UserPo {
    @ApiModelProperty("用户 id")
    public String userId;
    public String userName;
    public String password;
}
