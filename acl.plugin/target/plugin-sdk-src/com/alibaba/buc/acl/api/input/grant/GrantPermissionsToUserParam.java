package com.alibaba.buc.acl.api.input.grant;

import java.util.Date;
import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 授予/冻结/移除用户权限入参
 *
 * @author taigao.wjj 2015/12/03
 */

public class GrantPermissionsToUserParam extends AclParam {

    private static final long serialVersionUID = 7203776587877535392L;

    /**
     * UC 中的 userId
     */
    private Integer userId;

    /**
     * 权限名列表
     */
    private List<String> permissionNames;

    /**
     * 过期时间
     */
    private Date expireDate;

    /**
     * 授予动作
     * 值为：Grant 或 Freeze 或 Revoke
     */
    private String action;

    /**
     * 理由
     */
    private String reason;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
