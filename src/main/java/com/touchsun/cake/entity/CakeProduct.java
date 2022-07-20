package com.touchsun.cake.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CakeProduct)实体类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:33
 */
public class CakeProduct implements Serializable {
    private static final long serialVersionUID = -20424803171972584L;
    
    private Integer id;
    
    private String name;
    
    private Double price;
    
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

