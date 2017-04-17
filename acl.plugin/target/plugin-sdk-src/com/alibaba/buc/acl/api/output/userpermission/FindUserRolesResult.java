package com.alibaba.buc.acl.api.output.userpermission;

import com.alibaba.buc.acl.api.common.AclResult;

public class FindUserRolesResult extends AclResult{
	
	private static final long serialVersionUID = -7916065757329504230L;

	public static class FindUserRoleInner {

		private Integer roleId;

		private String roleName;

		private String roleTitle;

		public Integer getRoleId() {
			return roleId;
		}

		public void setRoleId(Integer roleId) {
			this.roleId = roleId;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getRoleTitle() {
			return roleTitle;
		}

		public void setRoleTitle(String roleTitle) {
			this.roleTitle = roleTitle;
		}
		
		
		
	}

}
