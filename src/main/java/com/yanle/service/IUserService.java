package com.yanle.service;

import com.baomidou.framework.service.ISuperService;
import com.yanle.commons.utils.PageInfo;
import com.yanle.pojo.User;
import com.yanle.pojo.vo.UserVo;


/**
 * Created by lenovo on 2016-11-19.
 */

public interface IUserService extends ISuperService<User> {
    User selectByLoginName(String loginName);

    void insertByVo(UserVo userVo);

    UserVo selectVoById(Long id);

    void updateByVo(UserVo userVo);

    void updatePwdByUserId(Long userId, String md5Hex);

    void selectDataGrid(PageInfo pageInfo);

    void deleteUserById(Long id);
}
