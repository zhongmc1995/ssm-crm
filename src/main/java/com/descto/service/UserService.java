package com.descto.service;

import com.descto.entity.User;

/**
 * 用户Service接口
 * Created by descto on 17-3-4.
 */
public interface UserService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    public User login(User user);
}
