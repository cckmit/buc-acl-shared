package com.alibaba.buc.api.permission;

import com.alibaba.buc.api.common.AclParam;

/**
 * 获取权限原生数据规则入参
 * <p/>
 * {@link com.alibaba.buc.api.PermissionService#getDataFromPermission(GetDataFromPermissionParam)}
 *
 * @author yicheng.wp
 */
public class GetDataFromPermissionParam implements AclParam {

    private static final long serialVersionUID = 3109474501659393393L;
    
    private String permissionName; // 权限英文名

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}
