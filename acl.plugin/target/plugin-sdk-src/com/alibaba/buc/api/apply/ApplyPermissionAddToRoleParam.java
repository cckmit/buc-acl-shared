package com.alibaba.buc.api.apply;

import com.alibaba.buc.api.common.AclParam;

/**
 * 申请将权限加入角色
 *
 * {@link com.alibaba.buc.api.ApplyInstanceService#applyPermissionAddToRole(ApplyPermissionAddToRoleParam)}
 *
 * @author yicheng.wp
 */
public class ApplyPermissionAddToRoleParam implements AclParam {

	private static final long serialVersionUID = -8566260887455325019L;

	private Integer principalUserId; // 接口操作主体，公共账号userId，须先授予公共账号接口操作权限，调用时会校验该公共账号是否拥权限（注意：不是当前登录人的userId）

	private String appName; // 角色所在的应用

	private String roleName; // 角色英文名

	private String permissionName; // 权限英文名

	private Integer applyUserId; // 流程发起人userId

	private Integer approveUserId; // 设置审批人（如果权限审批人规则设置为申请人自助选择）

	private String applyReason; // 流程申请的原因

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

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public Integer getApplyUserId() {
		return applyUserId;
	}

	public void setApplyUserId(Integer applyUserId) {
		this.applyUserId = applyUserId;
	}

	public Integer getApproveUserId() {
		return approveUserId;
	}

	public void setApproveUserId(Integer approveUserId) {
		this.approveUserId = approveUserId;
	}

	public String getApplyReason() {
		return applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}
}
