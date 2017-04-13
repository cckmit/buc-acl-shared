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
 * @author juan.dengj 2013-8-28 下午8:56:09
 */
public class UserRoleParam implements Serializable {

    private static final long serialVersionUID = -1717163917133709271L;

    /*
     * UC中的userId
     */
    private String            userId;
    /*
     * 角色name
     */
    private List<String>      roleNames;
    /*
     * 过期时间
     */
    private Date              expireDate;
    /*
     * 授予动作
     */
    private Action            action;

    private String            reason; // 理由

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
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
