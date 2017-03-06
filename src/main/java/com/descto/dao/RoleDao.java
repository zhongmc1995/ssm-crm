package com.descto.dao;

import com.descto.entity.Role;

import java.util.List;

/**
 * Created by descto on 17-3-6.
 */
public interface RoleDao {

    /**
     * 根据用户id查找对应的角色列表
     * @param userId
     * @return
     */
    List<Role> findByUserId(Integer userId);
}
