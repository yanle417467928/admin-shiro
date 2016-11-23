package com.yanle.commons.shiro;/**
 * Created by lenovo on 2016-11-19.
 */

import com.yanle.service.IRoleService;
import com.yanle.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 自定义realm
 *
 * @author yanle
 * @create 2016-11-19 14:45
 **/
public class ShiroDbRealm extends AuthorizingRealm {
    private  static  final Logger LOGGER  = LogManager.getLogger(ShiroDbRealm.class);

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
