package com.alibaba.buc.acl.api.input.userpermission;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 获取某个人在某个应用下面获取的权限
 *
 * @author taigao.wjj
 */
public class FindUserPermissionsParam extends AclParam{
	
	private static final long serialVersionUID = 8469308079589963237L;

	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	


}
