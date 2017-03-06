package com.descto.dao;

import com.descto.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 用户Dao接口
 * Created by descto on 17-3-4.
 */
public interface UserDao {

    /**
     * 根据手机号查找用户
     * @param tel
     * @return
     */
    User findByTel(String tel);

}
