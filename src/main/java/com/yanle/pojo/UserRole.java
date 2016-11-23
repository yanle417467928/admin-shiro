package com.yanle.pojo;

import java.io.Serializable;

/**
 * Created by lenovo on 2016-11-10.
 */
public class UserRole implements Serializable {

    private Long id;

    private Long userId;

    private Long roleId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
