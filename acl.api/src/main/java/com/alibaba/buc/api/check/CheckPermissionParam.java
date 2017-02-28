package com.alibaba.buc.api.check;

import com.alibaba.buc.api.common.AclParam;

import java.util.List;

/**
 * 验权入参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#checkPermissions(CheckPermissionParam)}
 *
 * @author yicheng.wp
 */
public class CheckPermissionParam implements AclParam {

    private static final long serialVersionUID = -4371543098790571089L;

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
