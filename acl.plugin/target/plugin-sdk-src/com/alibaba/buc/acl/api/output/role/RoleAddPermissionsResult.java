package com.alibaba.buc.acl.api.output.role;

import com.alibaba.buc.acl.api.common.AclResult;

public class RoleAddPermissionsResult  extends AclResult{

	private static final long serialVersionUID = -575339258054267816L;

	private Integer instanceId; //如果此值为null,可以认为返回结果为null

	public Integer getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(Integer instanceId) {
		this.instanceId = instanceId;
	}

}
