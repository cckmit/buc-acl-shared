package com.alibaba.buc.acl.api.output.userpermission;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclResult;

public class FindUserPermissionsResult extends AclResult {



	public static class FindUserPermissionInner {

		private Integer permissionId;

		private String permissionName;

		private String permissionTitle;

		public Integer getPermissionId() {
			return permissionId;
		}

		public void setPermissionId(Integer permissionId) {
			this.permissionId = permissionId;
		}

		public String getPermissionName() {
			return permissionName;
		}

		public void setPermissionName(String permissionName) {
			this.permissionName = permissionName;
		}

		public String getPermissionTitle() {
			return permissionTitle;
		}

		public void setPermissionTitle(String permissionTitle) {
			this.permissionTitle = permissionTitle;
		}

	}


}
