package com.alibaba.buc.api;

import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.param.UserReversePermissionsParam;
import com.alibaba.buc.api.param.UserReverseRolesParam;

/**
 * 反向权限服务
 * @author duhui.cj
 *
 */
public interface ReversePermissionService {
	/**
	 * 给人赋予反向权限
	 * @param param
	 * @throws BucException
	 */
	public void addUserReversePermissions(UserReversePermissionsParam param) throws BucException;
	
	/**
	 * 给人赋予反向角色，事实上仍然是落地到人和权限。
	 * 此接口使用范围有很大局限，如下：
	 * 1.当角色里面的权限里面的权限变更时，反向关系不会变更。（不会变更，不会变更，不会变更）
	 * 2.仅仅只有该角色的直接权限会落地反向关系，角色里面的子角色，以及子角色的权限均不会建立反向关系。
	 * 3.人和角色的反向关系并不会记录，记录的是人和角色下的直接包含权限。
	 * @param param
	 * @throws BucException
	 */
	public void addUserReverseRolePermission(UserReverseRolesParam param) throws BucException;
	
	
}
