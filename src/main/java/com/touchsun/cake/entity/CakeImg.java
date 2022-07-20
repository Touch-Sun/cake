package com.touchsun.cake.entity;

import java.io.Serializable;

/**
 * (CakeImg)实体类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:25
 */
public class CakeImg implements Serializable {
    private static final long serialVersionUID = 418247942070120769L;
    
    private Integer id;
    
    private Integer fkId;
    
    private String url;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkId() {
        return fkId;
    }

    public void setFkId(Integer fkId) {
        this.fkId = fkId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

