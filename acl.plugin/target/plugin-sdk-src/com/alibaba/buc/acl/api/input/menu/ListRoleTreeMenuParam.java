package com.alibaba.buc.acl.api.input.menu;

import com.alibaba.buc.acl.api.common.AclParam;

public class ListRoleTreeMenuParam extends AclParam{

	private static final long serialVersionUID = 2321867874797744342L;

	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	

}
