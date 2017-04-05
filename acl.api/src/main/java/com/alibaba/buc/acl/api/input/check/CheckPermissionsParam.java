package com.alibaba.buc.acl.api.input.check;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 验权的入参
 *
 * @author taigao
 */
public class CheckPermissionsParam extends AclParam {

    private static final long serialVersionUID = -2148468421035987610L;

    /**
     * UC 中的 userId
     */
    private Integer userId;

    /**
     * 权限名列表
     */
    private List<String> permissionNames;

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
