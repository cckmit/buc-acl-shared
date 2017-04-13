package com.alibaba.buc.api.check;

import com.alibaba.buc.api.common.AclResult;

/**
 * 验权出参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#checkPermissions(CheckPermissionParam)}
 *
 * @author yicheng.wp
 */
public class CheckPermissionResult implements AclResult {

    private static final long serialVersionUID = -5446786844627999289L;

    private String permissionName; // 权限名

    private boolean accessible; // 是否拥有权限

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }
}
