package com.descto.service.impl;

import com.descto.dao.UserDao;
import com.descto.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户Service实现类
 * Created by descto on 17-3-4.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
}
