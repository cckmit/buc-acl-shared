package com.alibaba.buc.acl.api.input.grant;

import java.util.Date;
import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 授予/冻结/移除用户角色入参
 * only grant your app's role to user
 *
 * @author taigao.wjj 2015/12/03
 */
public class GrantRolesToUserParam extends AclParam {

    private static final long serialVersionUID = 7203776587877535392L;

    private Integer userId; // UC中的userId

    private List<String> roleNames; // 角色名列表

    private Date expireDate; // 过期时间

    private String action; // 授予动作

    private String reason; // 理由

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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
