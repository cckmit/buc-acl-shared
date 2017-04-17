package com.alibaba.buc.api.condition;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 类UserRolePermissionCondition.java的实现描述：TODO 类实现描述
 * 
 * @author tongxu.ay 2014-1-9 下午12:51:46
 */
public class UserRolePermissionCondition implements Condition {

    private static final long serialVersionUID = -7991665810754465666L;

    private String            userId;

    private String            roleName;
    
    /**
     * 权限英文名
     */
    private String            permissionName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    
    public String getPermissionName() {
        return permissionName;
    }

    
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
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
