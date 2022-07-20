package com.touchsun.cake.entity;

import java.io.Serializable;

/**
 * (CakeUser)实体类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
public class CakeUser implements Serializable {
    private static final long serialVersionUID = -54264659586940869L;
    
    private Integer id;
    
    private String username;
    
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

