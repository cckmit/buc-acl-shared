package com.alibaba.buc.api.datapermission.param;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装验权用户相关信息
 * 类UserProfile.java的实现描述：TODO 类实现描述 
 * @author tongxu 2015年9月16日 上午10:31:43
 */
public class UserProfileParam implements Serializable{

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 7492718476902582927L;
    
    /**
     * 用户id
     */
    private Integer userId;

    
    public Integer getUserId() {
        return userId;
    }

    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(this);
    }

   
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
    
}
