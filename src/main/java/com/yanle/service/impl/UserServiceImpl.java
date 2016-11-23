package com.yanle.service.impl;/**
 * Created by lenovo on 2016-11-19.
 */

import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.yanle.commons.utils.PageInfo;
import com.yanle.mapper.UserMapper;
import com.yanle.pojo.User;
import com.yanle.pojo.vo.UserVo;
import com.yanle.service.IUserService;
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


    @Override
    public User selectByLoginName(String loginName) {
        return null;
    }

    @Override
    public void insertByVo(UserVo userVo) {

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

    }

    @Override
    public void deleteUserById(Long id) {

    }
}
