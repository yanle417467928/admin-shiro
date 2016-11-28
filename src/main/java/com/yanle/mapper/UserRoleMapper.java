package com.yanle.mapper;

import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.yanle.pojo.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2016-11-24.
 */
public interface UserRoleMapper extends AutoMapper<UserRole> {
    List<UserRole> selectByUserId(@Param("userId") Long userId);

    List<Long> selectRoleIdListByUserId(@Param("userId") Long userId);
}
