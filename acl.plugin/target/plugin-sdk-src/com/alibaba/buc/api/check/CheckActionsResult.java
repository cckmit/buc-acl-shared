package com.alibaba.buc.api.check;

import com.alibaba.buc.api.common.AclResult;

/**
 * 验权出参
 * <p/>
 * {@link com.alibaba.buc.api.ActionService#checkActions(CheckActionsParam)}
 *
 * @author yicheng.wp
 */
public class CheckActionsResult implements AclResult {

    private static final long serialVersionUID = -8623217808435003631L;

    private String url; // URL

    private String permissionName; // URL对应的权限名

    private boolean accessible; // 是否拥有权限

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

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
