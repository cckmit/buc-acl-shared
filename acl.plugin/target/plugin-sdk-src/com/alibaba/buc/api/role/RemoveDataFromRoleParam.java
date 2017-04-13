package com.alibaba.buc.api.role;

import com.alibaba.buc.api.common.AclParam;

import java.util.List;

/**
 * 从角色删除原生数据规则的入参
 * <p/>
 * {@link com.alibaba.buc.api.RoleService#removeDataFromRole(RemoveDataFromRoleParam)}
 *
 * @author yicheng.wp
 */
public class RemoveDataFromRoleParam implements AclParam {

    private static final long serialVersionUID = -60746904180719272L;

    private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private Integer operatorUserId; // 操作人userId

    private String appName; // 应用英文名

    private String roleName; // 角色英文名

    private List<String> dataNames; // 数据规则英文名列表

    public Integer getPrincipalUserId() {
        return principalUserId;
    }

    public void setPrincipalUserId(Integer principalUserId) {
        this.principalUserId = principalUserId;
    }

    public Integer getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getDataNames() {
        return dataNames;
    }

    public void setDataNames(List<String> dataNames) {
        this.dataNames = dataNames;
    }
}
