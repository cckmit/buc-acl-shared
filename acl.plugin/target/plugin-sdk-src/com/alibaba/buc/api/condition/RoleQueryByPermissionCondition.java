package com.alibaba.buc.api.condition;

public class RoleQueryByPermissionCondition implements Condition {

    /**
     * 
     */
    private static final long serialVersionUID = -928229810032647038L;

    private String            permissionName;

    
    public String getPermissionName() {
        return permissionName;
    }

    
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

}
