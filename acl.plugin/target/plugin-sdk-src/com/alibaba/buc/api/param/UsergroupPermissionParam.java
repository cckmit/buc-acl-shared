/*
 * Copyright 2013 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author juan.dengj 2013-8-29 上午10:40:53
 */
public class UsergroupPermissionParam implements Serializable {

    private static final long serialVersionUID = 3543526509888469654L;

    /*
     * 用户组name
     */
    private String            usergroupName;
    /*
     * 权限name
     */
    private List<String>      permissionNames;
    /*
     * 过期时间
     */
    private Date              expireDate;
    /*
     * 授予动作
     */
    private Action            action;

    private String            reason; // 理由

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
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
