package com.yanle.mapper;/**
 * Created by lenovo on 2016-11-23.
 */

import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.yanle.pojo.Resource;
import com.yanle.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 角色类数据仓库
 *
 * @author
 * @create 2016-11-23 11:53
 **/
public interface RoleMapper extends AutoMapper<Role> {
    List<Role> selectAll();

    List<Long> selectResourceIdListByRoleId(@Param("id") Long id);

    List<Resource> selectResourceIdListByRoleIdAndType(@Param("id") Long id);

    List<Map<Long, String>> selectResourceListByRoleId(@Param("id") Long id);

    List<Role> selectRoleList(Pagination page, @Param("sort") String sort, @Param("order") String order);
}
