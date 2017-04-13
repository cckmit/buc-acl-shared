package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class UserPermissionParam implements Serializable {

    private static final long         serialVersionUID          = 8578645148260804902L;

    /*
     * UC中的userId
     */
    private String                    userId;
    /*
     * 权限name
     */
    private List<String>              permissionNames           = new ArrayList<String>();

    /**
     * 
     */
    private List<DataPermissionParam> resourceAndOperationNames = new ArrayList<DataPermissionParam>();

    /*
     * 过期时间, 为空则为永久有效
     */
    private Date   expireDate;

    /*
     * 授予动作
     */
    private Action action;

    private String reason; // 理由

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getPermissionNames() {
        return permissionNames;
    }

    public void setPermissionNames(List<String> permissionNames) {
        this.permissionNames = permissionNames;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public List<DataPermissionParam> getResourceAndOperationNames() {
        return resourceAndOperationNames;
    }

    public void setResourceAndOperationNames(List<DataPermissionParam> resourceAndOperationNames) {
        this.resourceAndOperationNames = resourceAndOperationNames;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
