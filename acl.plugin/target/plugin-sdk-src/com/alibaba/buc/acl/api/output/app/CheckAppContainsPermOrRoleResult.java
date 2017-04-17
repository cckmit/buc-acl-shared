package com.alibaba.buc.acl.api.output.app;

import com.alibaba.buc.acl.api.common.AclResult;

public class CheckAppContainsPermOrRoleResult extends AclResult{
	
	private boolean contains = false;

	public boolean isContains() {
		return contains;
	}

	public void setContains(boolean contains) {
		this.contains = contains;
	}
	
	

}
