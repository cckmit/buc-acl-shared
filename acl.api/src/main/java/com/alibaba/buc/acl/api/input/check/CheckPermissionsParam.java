package com.alibaba.buc.acl.api.input.check;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

public class CheckPermissionsParam extends AclParam {

    private static final long serialVersionUID = -2148468421035987610L;

    private Integer userId; // UC中的userId

    private List<String> permissionNames; // 权限名列表

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
}
