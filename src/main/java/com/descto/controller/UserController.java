package com.descto.controller;

import com.descto.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * 用户Controller层
 * Created by descto on 17-3-4.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;
}
