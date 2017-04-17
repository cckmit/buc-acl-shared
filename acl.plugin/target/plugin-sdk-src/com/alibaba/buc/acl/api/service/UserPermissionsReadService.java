package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.userpermission.FindUserPermissionsParam;
import com.alibaba.buc.acl.api.input.userpermission.FindUserRolesParam;
import com.alibaba.buc.acl.api.output.userpermission.FindUserPermissionsResult;
import com.alibaba.buc.acl.api.output.userpermission.FindUserRolesResult;

public interface UserPermissionsReadService {

	/**
	 * 已废弃，请勿调用
	 */
	@Deprecated
	FindUserPermissionsResult findUserPermissions(FindUserPermissionsParam param);

	/**
	 * 已废弃，请勿调用
	 */
	@Deprecated
	FindUserRolesResult findUserRoles(FindUserRolesParam param);

}
