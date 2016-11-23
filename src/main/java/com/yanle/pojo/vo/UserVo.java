package com.yanle.pojo.vo;/**
 * Created by lenovo on 2016-11-19.
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yanle.pojo.Role;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * User 查询条件类
 *
 * @author
 * @create 2016-11-19 15:04
 **/
public class UserVo implements Serializable {
    private  Long id;
    private String loginName;
    private String name;

    @JsonIgnore
    private String password;

    private Integer sex;

    private Integer age;

    private Integer userType;

    private Integer status;

    private Integer organizationId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String phone;

    private List<Role> rolesList;

    private String organizationName;

    private String roleIds;

    private Date createdateStart;
    private Date createdateEnd;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Role> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<Role> rolesList) {
        this.rolesList = rolesList;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public Date getCreatedateStart() {
        return createdateStart;
    }

    public void setCreatedateStart(Date createdateStart) {
        this.createdateStart = createdateStart;
    }

    public Date getCreatedateEnd() {
        return createdateEnd;
    }

    public void setCreatedateEnd(Date createdateEnd) {
        this.createdateEnd = createdateEnd;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
