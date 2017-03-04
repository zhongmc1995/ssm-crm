package com.descto.dao;

import com.descto.entity.User;

/**
 * 用户Dao接口
 * Created by descto on 17-3-4.
 */
public interface UserDao {

    /**
     * 用户登录
     * @param user
     * @return
     */
    public User login(User user);
}
