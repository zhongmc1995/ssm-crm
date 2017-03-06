package com.descto.util;

import com.descto.entity.User;
import org.apache.shiro.SecurityUtils;

/**
 * Created by descto on 17-3-6.
 */
public class ShiroUtil {

    /**
     * 查询当前登录者信息
     * @return
     */
    public static User getCurrentUser() {
        return (User) SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * 查询当前登录者 用户名
     * @return
     */
    public static String getCurrentUserName() {
        return getCurrentUser().getUsername();
    }

    /**
     * 查询当前登录者 用户id
     * @return
     */
    public static Integer getCurrentUserId() {
        return getCurrentUser().getId();
    }

    /**
     * 判断当前是否登录
     * @return
     */
    public static boolean  isCurrentUser() {
        return getCurrentUser() != null;
    }
}
