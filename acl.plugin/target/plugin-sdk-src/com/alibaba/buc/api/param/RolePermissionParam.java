package com.alibaba.buc.api.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class RolePermissionParam implements Serializable {

    private static final long         serialVersionUID          = 1177425641363130442L;
    /**
     * 角色name
     */
    private String                    roleName;
    /**
     * 权限name列表
     */
    private List<String>              permissionNames;

    /**
     * 资源和操作组成权限
     */
    private List<DataPermissionParam> resourceAndOperationNames = new ArrayList<DataPermissionParam>();

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

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public List<DataPermissionParam> getResourceAndOperationNames() {
        return resourceAndOperationNames;
    }

    public void setResourceAndOperationNames(List<DataPermissionParam> resourceAndOperationNames) {
        this.resourceAndOperationNames = resourceAndOperationNames;
    }

}
