package com.alibaba.buc.acl.api.input.grant;

import java.util.Date;
import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 授予/冻结/移除用户组角色入参
 *
 * @author taigao.wjj 2015/12/03
 */
public class GrantRolesToUsergroupParam extends AclParam {

    private static final long serialVersionUID = 6726764788823144357L;

    private String usergroupName; // 用户组名

    private List<String> roleNames; // 权限名列表

    private Date expireDate; // 过期时间

    private String action; // 授予动作

    private String reason; // 理由

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
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
