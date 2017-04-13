package com.alibaba.buc.api.grant;

import com.alibaba.buc.api.common.AclParam;
import com.alibaba.buc.api.param.Action;

import java.util.Date;
import java.util.List;

/**
 * 授予/冻结/移除用户角色入参
 * <p/>
 * {@link com.alibaba.buc.api.GrantService#grantRolesToUser(GrantRolesToUserParam)}
 *
 * @author yicheng.wp
 */
public class GrantRolesToUserParam implements AclParam {

    private static final long serialVersionUID = -5872948023244927616L;

    private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private String appName; // 角色所在的应用

    private Integer userId; // UC中的userId

    private List<String> roleNames; // 角色名列表

    private Date expireDate; // 过期时间

    private Action action; // 授予动作

    private String reason; // 理由

    public Integer getPrincipalUserId() {
        return principalUserId;
    }

    public void setPrincipalUserId(Integer principalUserId) {
        this.principalUserId = principalUserId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

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
}
