package com.alibaba.buc.api.condition;

import java.util.List;

public class ApplyingPermissionCondition implements Condition {

    private static final long serialVersionUID = -5352286937290162658L;

    /**
     * 权限名
     */
    private List<String>      permissionNames;

    private String            userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getPermissionNames() {
        return permissionNames;
    }

    public void setPermissionNames(List<String> permissionNames) {
        this.permissionNames = permissionNames;
    }

}
