package com.alibaba.buc.acl.api.input.app;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 判断某个应用下是否包含权限或者角色的入参
 *
 * @author taigao
 */
public class CheckAppContainsPermOrRoleParam extends AclParam{

	private static final long serialVersionUID = 1300804299501910224L;

	/**
	 * 类型（值为 PERMISSION 或 ROLE）
	 */
	private String  type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
