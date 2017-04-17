package com.alibaba.buc.api.result;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.buc.api.model.Permission;

public class UserPermissionsResultModel implements Serializable {

    private static final long serialVersionUID = -5862614137488095634L;

    /**
     * 用户ID
     */
    private Integer           userId;

    /**
     * 权限过期时间
     */
    private Date              expireDate;

    /**
     * 授予时间
     */
    private Date              gmtModified;

    /**
     * 权限是否激活
     */
    private Boolean           isActive;

    /**
     * 权限信息
     */
    private Permission        permission;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

}
