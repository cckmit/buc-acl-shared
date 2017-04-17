package com.alibaba.buc.api.grant;

import com.alibaba.buc.api.common.AclParam;
import com.alibaba.buc.api.param.Action;

import java.util.Date;
import java.util.List;

/**
 * 授予/冻结/移除用户组权限入参
 * <p/>
 * {@link com.alibaba.buc.api.GrantService#grantPermissionsToUsergroup(GrantPermissionsToUsergroupParam)}
 *
 * @author yicheng.wp
 */
public class GrantPermissionsToUsergroupParam implements AclParam {

    private static final long serialVersionUID = 1213905291242034919L;

    private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private String appName; // 角色所在的应用

    private String usergroupName; // 用户组名

    private List<String> permissionNames; // 权限名列表

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
}
