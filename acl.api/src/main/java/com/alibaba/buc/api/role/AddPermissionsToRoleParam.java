package com.alibaba.buc.api.role;

import com.alibaba.buc.api.common.AclParam;

import java.util.List;

/**
 * 给角色添加权限入参
 * <p/>
 * {@link com.alibaba.buc.api.RoleService#addPermissionsToRole(AddPermissionsToRoleParam)}
 *
 * @author yicheng.wp
 */
public class AddPermissionsToRoleParam implements AclParam {

    private static final long serialVersionUID = 8055356576729153602L;

    private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

    private String appName; // 角色所在的应用

    private String roleName; // 角色名

    private List<String> permissionNames; // 权限名列表
    
    private boolean isFlow = false;//是否走流程，默认不走，如果为true，则会走角色流程：角色归属人--应用/部门权限管理员--角色归属人主管--权限归属人--安全部终审
    
    private Integer applyUserId;//流程发起人userId,当isFlow=true时必填
    
    private String applyReason;//流程申请的原因，当isFlow=true时必填

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

    public boolean isFlow() {
        return isFlow;
    }

    public void setFlow(boolean isFlow) {
        this.isFlow = isFlow;
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

	public String getApplyReason() {
		return applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

}
