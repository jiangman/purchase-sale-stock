package com.ehu.controller;

import com.ehu.bean.request.LoginRequest;
import com.ehu.exceptions.LoginValidationException;
import com.ehu.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-24 14:45.
 */
@RestController
@Api(tags = "系统用户")
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService userService;

    @PostMapping("/login")
    @ApiOperation("登录")
    public Object login(@Valid @RequestBody LoginRequest request) throws LoginValidationException {
        return userService.login(request);
    }

    @GetMapping("/logout")
    @ApiOperation("注销")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public void logout() {
        userService.logout();
    }

    @GetMapping("/test")
    @ApiOperation("测试接口")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object test() {
        return new Date();
    }
}
