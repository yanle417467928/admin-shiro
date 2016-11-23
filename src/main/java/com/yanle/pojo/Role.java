package com.yanle.pojo;

import java.io.Serializable;

/**
 * Created by lenovo on 2016-11-10.
 */
public class Role implements Serializable {
    private Long id;

    private String name;

    private Integer sql;

    private String description;

    private  Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSql() {
        return sql;
    }

    public void setSql(Integer sql) {
        this.sql = sql;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
