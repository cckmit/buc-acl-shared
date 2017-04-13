package com.alibaba.buc.acl.api.input.permission;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 根据权限名查询权限入参
 *
 * @author yicheng.wp
 */
public class GetPermissionParam extends AclParam {

    private static final long serialVersionUID = -2318038530185580860L;

    private String permissionName;

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

}
