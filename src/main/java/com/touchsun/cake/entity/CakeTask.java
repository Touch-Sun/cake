package com.touchsun.cake.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CakeTask)实体类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
public class CakeTask implements Serializable {
    private static final long serialVersionUID = -70550278662044086L;
    
    private Integer id;
    
    private String name;
    
    private String desc;
    
    private String status;
    
    private Integer score;
    
    private Integer execUser;
    
    private Integer createUser;
    
    private Date createTime;
    
    private Date updateTime;
    
    private Integer flag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getExecUser() {
        return execUser;
    }

    public void setExecUser(Integer execUser) {
        this.execUser = execUser;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

}

