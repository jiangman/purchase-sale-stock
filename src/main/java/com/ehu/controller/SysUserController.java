package com.ehu.controller;

import com.ehu.bean.request.LoginRequest;
import com.ehu.exceptions.LoginValidationException;
import com.ehu.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
}
