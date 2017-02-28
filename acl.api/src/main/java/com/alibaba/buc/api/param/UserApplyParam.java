package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 封装用户申请相关参数
 * 类UserApplyParam.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-7-9 下午7:04:25
 */
public class UserApplyParam implements Serializable {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -3427934664602512693L;
    
    /**
     * 申请的权限name列表
     */
    private List<String> permissionNames;
    
    /**
     * 申请的角色name列表
     */
    private List<String> roleNames;
    
    /**
     * 申请人id
     */
    private Integer userId;
    
    /**
     * 申请原因
     */
    private String reason;
    
    /**
     * 过期时间
     */
    private Date expireDate;

    
    public List<String> getPermissionNames() {
        return permissionNames;
    }

    
    public void setPermissionNames(List<String> permissionNames) {
        this.permissionNames = permissionNames;
    }

    
    public List<String> getRoleNames() {
        return roleNames;
    }

    
    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

    
    public Integer getUserId() {
        return userId;
    }

    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    public String getReason() {
        return reason;
    }

    
    public void setReason(String reason) {
        this.reason = reason;
    }

    
    public Date getExpireDate() {
        return expireDate;
    }

    
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    
    
}
