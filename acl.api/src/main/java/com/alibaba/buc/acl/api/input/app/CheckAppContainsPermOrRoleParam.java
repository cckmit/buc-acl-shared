package com.alibaba.buc.acl.api.input.app;

import com.alibaba.buc.acl.api.common.AclParam;

public class CheckAppContainsPermOrRoleParam extends AclParam{

	private static final long serialVersionUID = 1300804299501910224L;

	private String  type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
