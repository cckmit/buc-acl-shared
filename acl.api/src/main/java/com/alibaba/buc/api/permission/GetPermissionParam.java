package com.alibaba.buc.api.permission;

import com.alibaba.buc.api.common.AclParam;

/**
 * 根据权限名查询权限入参
 * <p/>
 * {@link com.alibaba.buc.api.PermissionService#getPermission(GetPermissionParam)}
 *
 * @author yicheng.wp
 */
public class GetPermissionParam implements AclParam {

    private static final long serialVersionUID = -2395185815760281483L;

    private String permissionName;

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}
