package com.ehu.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-24 14:30.
 */
@Data
@ApiModel
public class LoginRequest {
    @ApiModelProperty("账号")
    @NotNull(message = "账号不能为空")
    private String userAccount;

    @ApiModelProperty("密码")
    @NotNull(message = "密码不能为空")
    private String userPassword;
}
