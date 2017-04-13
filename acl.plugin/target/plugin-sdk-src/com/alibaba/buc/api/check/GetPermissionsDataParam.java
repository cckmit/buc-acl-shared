package com.alibaba.buc.api.check;

import java.util.List;

import com.alibaba.buc.api.common.AclParam;

/**
 * 批量查找用户拥有权限的数据,入参
 * <p/>
 * {@link com.alibaba.buc.api.AccessControlService#getPermissionsData(GetPermissionsDataParam)}
 * 
 * @author jin.tuj 2015年5月5日 上午10:56:14
 */
public class GetPermissionsDataParam implements AclParam {

    private static final long serialVersionUID = -5029546717287727452L;
    private Integer           userId;                                  // UC中的userId，必填
    private List<String>      permissionNames;                         // 权限名列表，必填

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
