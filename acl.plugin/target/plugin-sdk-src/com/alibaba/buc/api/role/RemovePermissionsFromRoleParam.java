package com.alibaba.buc.api.role;

import com.alibaba.buc.api.common.AclParam;

import java.util.List;

/**
 * 从角色中移除权限入参
 * <p/>
 * {@link com.alibaba.buc.api.RoleService#removePermissionsFromRole(RemovePermissionsFromRoleParam)}
 *
 * @author yicheng.wp
 */
public class RemovePermissionsFromRoleParam implements AclParam {

    private static final long serialVersionUID = 677356577620615632L;

    private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private String appName; // 角色所在的应用

    private String roleName; // 角色名

    private List<String> permissionNames; // 权限名列表

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getPermissionNames() {
        return permissionNames;
    }

    public void setPermissionNames(List<String> permissionNames) {
        this.permissionNames = permissionNames;
    }
}
