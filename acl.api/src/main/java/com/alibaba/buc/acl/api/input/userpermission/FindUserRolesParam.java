package com.alibaba.buc.acl.api.input.userpermission;

import com.alibaba.buc.acl.api.common.AclParam;

public class FindUserRolesParam extends AclParam{
	
	private static final long serialVersionUID = 1672338967927057928L;

	private Integer userId;

	public Integer getUserId() {
			return userId;
	}

	public void setUserId(Integer userId) {
			this.userId = userId;
	}
}
