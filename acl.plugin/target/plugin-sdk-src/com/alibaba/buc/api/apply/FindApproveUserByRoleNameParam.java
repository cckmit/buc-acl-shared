package com.alibaba.buc.api.apply;

import com.alibaba.buc.api.common.AclParam;

import java.util.List;

/**
 * 查询角色配置的审批人
 *
 * {@link com.alibaba.buc.api.ApplyInstanceService#findApproveUserByRoleName(FindApproveUserByRoleNameParam)}
 *
 * @author yicheng.wp
 */
public class FindApproveUserByRoleNameParam implements AclParam {

    private static final long serialVersionUID = 1537625243996120729L;

    private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private String appName; // 角色所在的应用

    private List<String> roleNames; // 角色英文名列表

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

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }
}
