package com.yanle.service.impl;/**
 * Created by lenovo on 2016-11-19.
 */

import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.yanle.commons.utils.PageInfo;
import com.yanle.mapper.RoleMapper;
import com.yanle.pojo.Role;
import com.yanle.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * RoleService实现类
 *
 * @author
 * @create 2016-11-19 16:05
 **/
@Service
public class RoleServiceImpl extends SuperServiceImpl<RoleMapper,Role> implements IRoleService {

    @Override
    public List<Long> selectRoleIdListByUserId(Long userId) {
        return null;
    }

    @Override
    public List<Map<Long, String>> selectRoleResourceListByRoleId(Long roleId) {
        return null;
    }

    @Override
    public void selectDataGrid(PageInfo pageInfo) {

    }

    @Override
    public Object selectTree() {
        return null;
    }

    @Override
    public List<Long> selectResourceIdListByRoleId(Long id) {
        return null;
    }

    @Override
    public void updateRoleResource(Long id, String resourceIds) {

    }
}
