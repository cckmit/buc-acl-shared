package com.alibaba.buc.api.userpermission;

import com.alibaba.buc.api.common.AclParam;

import java.util.List;

/**
 * 从用户权限删除数据规则入参
 * <p/>
 * {@link com.alibaba.buc.api.UserPermissionService#removeDataFromUserPermission(RemoveDataFromUserPermissionParam)}
 *
 * @author yicheng.wp
 */
public class RemoveDataFromUserPermissionParam implements AclParam {

    private static final long serialVersionUID = -1450456133778521804L;

    private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private String appName; // 角色所在的应用

    private Integer userId; // UC中的userId

    private String permissionName; // 权限英文名

    private List<String> dataNames; // 数据规则英文名列表

    private Integer operatorUserId; // 操作人userId

    public Integer getPrincipalUserId() {
        return principalUserId;
    }

    public void setPrincipalUserId(Integer principalUserId) {
        this.principalUserId = principalUserId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<String> getDataNames() {
        return dataNames;
    }

    public void setDataNames(List<String> dataNames) {
        this.dataNames = dataNames;
    }

    public Integer getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }
}
