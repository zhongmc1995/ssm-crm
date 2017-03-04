package com.descto.service.impl;

import com.descto.dao.UserDao;
import com.descto.entity.User;
import com.descto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户Service实现类
 * Created by descto on 17-3-4.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 用户登录
     * @param user
     * @return
     */
    public User login(User user) {
        return userDao.login(user);
    }
}
