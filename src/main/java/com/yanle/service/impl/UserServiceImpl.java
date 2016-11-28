package com.yanle.service.impl;/**
 * Created by lenovo on 2016-11-19.
 */

import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.yanle.commons.utils.BeanUtils;
import com.yanle.commons.utils.PageInfo;
import com.yanle.mapper.RoleMapper;
import com.yanle.mapper.UserMapper;
import com.yanle.mapper.UserRoleMapper;
import com.yanle.pojo.User;
import com.yanle.pojo.UserRole;
import com.yanle.pojo.vo.UserVo;
import com.yanle.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * UserService实现类
 *
 * @author
 * @create 2016-11-19 15:42
 **/
@Service
public class UserServiceImpl extends SuperServiceImpl<UserMapper,User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByLoginName(String loginName) {
        return null;
    }

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public void insertByVo(UserVo userVo) {
        User user = BeanUtils.copy(userVo,User.class);
        this.insert(user);
        Long id = user.getId();
        String [] roles = userVo.getRoleIds().split(",");
        UserRole userRole = new UserRole();
        for (String string :roles){
            userRole.setUserId(id);
            userRole.setRoleId(Long.valueOf(string));
            userRoleMapper.insert(userRole);
        }
    }

    @Override
    public UserVo selectVoById(Long id) {
        return null;
    }

    @Override
    public void updateByVo(UserVo userVo) {

    }

    @Override
    public void updatePwdByUserId(Long userId, String md5Hex) {

    }

    @Override
    public void selectDataGrid(PageInfo pageInfo) {
        Page<UserVo> page = new Page<UserVo>(pageInfo.getNowpage(),pageInfo.getSize());
        List<UserVo> list = userMapper.selectUserVoPage(page,pageInfo.getCondition());
        pageInfo.setRows(list);
        pageInfo.setTotal(page.getTotal());
    }

    @Override
    public void deleteUserById(Long id) {

    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
