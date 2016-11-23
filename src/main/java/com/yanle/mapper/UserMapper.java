package com.yanle.mapper;/**
 * Created by lenovo on 2016-11-19.
 */

import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.yanle.pojo.User;
import com.yanle.pojo.vo.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * User类数据仓库
 *
 * @author
 * @create 2016-11-19 16:11
 **/
public interface UserMapper extends AutoMapper<User> {
    UserVo selectUserVoById(@Param("id") Long id);

    List<UserVo> selectUserVoPage(Pagination page, Map<String, Object> params);
}
