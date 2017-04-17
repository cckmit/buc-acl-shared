package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.grant.GrantPermissionsToUserParam;
import com.alibaba.buc.acl.api.input.grant.GrantPermissionsToUsergroupParam;
import com.alibaba.buc.acl.api.input.grant.GrantRolesToUserParam;
import com.alibaba.buc.acl.api.input.grant.GrantRolesToUsergroupParam;
import com.alibaba.buc.api.grant.CleanDataPermissionParam;
import com.alibaba.buc.api.grant.GrantDataPermissionParam;

public interface GrantService {
	
    public AclResult grantPermissionsToUser(GrantPermissionsToUserParam param) ;
	 	 
	 public AclResult grantRolesToUser(GrantRolesToUserParam param);
	 
	 public AclResult grantPermissionToUsergroup(GrantPermissionsToUsergroupParam param);
	 
	 public AclResult grantRolesToUsergroup(GrantRolesToUsergroupParam param);
	 
	 /**
	  * 数据权限授权
	  * @param grantDataPermissionParam
	  * @return
	  */
	 public AclResult<String> grantDataPermission(GrantDataPermissionParam grantDataPermissionParam);
	 
	 /**
	  * 清除授权对象数据权限
	  * @param param
	  * @return
	  */
	 public AclResult<String> cleanDataPermission(CleanDataPermissionParam param);

}
