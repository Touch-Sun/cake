package com.touchsun.cake.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CakeScoreLog)实体类
 *
 * @author touchsun
 * @since 2022-07-18 15:46:34
 */
public class CakeScoreLog implements Serializable {
    private static final long serialVersionUID = -92317712986708978L;
    
    private Integer id;
    
    private Integer userId;
    
    private Integer objectId;
    
    private Integer score;
    
    private Date createTime;
    
    private Integer flag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

}

