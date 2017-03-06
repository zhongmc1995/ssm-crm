package com.descto.service;

import com.descto.dao.RoleDao;
import com.descto.dao.UserDao;
import com.descto.entity.Role;
import com.descto.entity.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;
import java.util.List;

/**
 * Created by descto on 17-3-6.
 */
@Named
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;

    /**
     * 权限认证方法
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User shiroUser = (User) principalCollection.getPrimaryPrincipal();

        User user = userDao.findByTel(shiroUser.getTel());
        if (user != null) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            //获取用户对应的角色列表
            List<Role> roleList = roleDao.findByUserId(user.getId());

            for (Role role : roleList) {
                info.addRole(role.getRolename());
            }
            return info;
        }
        return null;
    }

    /**
     * 登录方法
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String tel = token.getUsername();
        User user = userDao.findByTel(tel);
        if (user != null) {
            return new SimpleAuthenticationInfo(user, user.getPassword(),getName());
        }
        return null;
    }
}
