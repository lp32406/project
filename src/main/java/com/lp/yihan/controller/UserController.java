package com.lp.yihan.controller;

import com.lp.yihan.common.result.Page;
import com.lp.yihan.common.result.ResponseResult;
import com.lp.yihan.entity.User;
import com.lp.yihan.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户表(User)表控制层
 *
 * @author lp
 * @since 2020-05-30 15:55:31
 */
@Api(description = "用户操作")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "新增用户")
    @PostMapping("/insertUser")
    public ResponseResult insertUser(@Validated User user) {
        return userService.insertUser(user);
    }

    @ApiOperation(value = "查询用户列表",response = User.class)
    @GetMapping("/listUser")
    public ResponseResult listUser(Page page) {
        return userService.listUser(page);
    }
}