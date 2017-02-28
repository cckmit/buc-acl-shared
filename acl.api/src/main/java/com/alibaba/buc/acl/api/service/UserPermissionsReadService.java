package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.userpermission.FindUserPermissionsParam;
import com.alibaba.buc.acl.api.input.userpermission.FindUserRolesParam;
import com.alibaba.buc.acl.api.output.userpermission.FindUserPermissionsResult;
import com.alibaba.buc.acl.api.output.userpermission.FindUserRolesResult;

public interface UserPermissionsReadService {
	
	/**
	 * 获得某个用户在某个应用下面的直接的权限s.
	 * @param param
	 * @return
	 */
	FindUserPermissionsResult findUserPermissions(FindUserPermissionsParam param);
	
	/**
	 * 获得某个用户在某个应用下面的直接的角色s.
	 * @param param
	 * @return
	 */
	FindUserRolesResult findUserRoles(FindUserRolesParam param);

}
