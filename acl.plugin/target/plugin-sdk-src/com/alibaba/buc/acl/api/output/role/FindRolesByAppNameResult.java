package com.alibaba.buc.acl.api.output.role;

import com.alibaba.buc.acl.api.common.AclResult;

public class FindRolesByAppNameResult extends AclResult {
	
	
	
	public static class FindRolesByAppNameInner{
		
		private Integer roleId;
		
		private Integer parentId;
		
		private String roleName;
		
		private String roleTitle;

		public Integer getRoleId() {
			return roleId;
		}

		public void setRoleId(Integer roleId) {
			this.roleId = roleId;
		}

		public Integer getParentId() {
			return parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
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
