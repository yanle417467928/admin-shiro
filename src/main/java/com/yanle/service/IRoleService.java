package com.yanle.service;/**
 * Created by lenovo on 2016-11-19.
 */

import com.baomidou.framework.service.ISuperService;
import com.yanle.commons.utils.PageInfo;
import com.yanle.pojo.Role;

import java.util.List;
import java.util.Map;

/**
 * 角色实体类
 *
 * @author yanle
 * @create 2016-11-19 15:45
 **/
public interface IRoleService extends ISuperService<Role>{
    List<Long> selectRoleIdListByUserId(Long userId);

    List<Map<Long, String>> selectRoleResourceListByRoleId(Long roleId);

    void selectDataGrid(PageInfo pageInfo);

    Object selectTree();

    List<Long> selectResourceIdListByRoleId(Long id);

    void updateRoleResource(Long id, String resourceIds);
}
