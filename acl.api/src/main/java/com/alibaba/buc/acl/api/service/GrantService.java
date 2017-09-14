package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.grant.GrantPermissionsToUserParam;
import com.alibaba.buc.acl.api.input.grant.GrantPermissionsToUsergroupParam;
import com.alibaba.buc.acl.api.input.grant.GrantRolesToUserParam;
import com.alibaba.buc.acl.api.input.grant.GrantRolesToUsergroupParam;
import com.alibaba.buc.api.grant.ChangePermissionParam;
import com.alibaba.buc.api.grant.CleanDataPermissionParam;
import com.alibaba.buc.api.grant.GrantDataPermissionParam;

public interface GrantService {

    AclResult grantPermissionsToUser(GrantPermissionsToUserParam param);

    AclResult grantRolesToUser(GrantRolesToUserParam param);

    AclResult grantPermissionToUsergroup(GrantPermissionsToUsergroupParam param);

    AclResult grantRolesToUsergroup(GrantRolesToUsergroupParam param);

    /**
     * 数据权限授权
     * 
     * 异步操作，生效有延时，预计10分钟内
     *
     * @param grantDataPermissionParam
     * @return
     */
    AclResult<String> grantDataPermission(GrantDataPermissionParam grantDataPermissionParam);

    /**
     * 清除授权对象数据权限
     *
     * @param param
     * @return
     */
    AclResult<String> cleanDataPermission(CleanDataPermissionParam param);
    
    /**
     * 变更权限，主要是变更用户角色、数据权限
     * 调用后会覆盖现有授权，将授权替换成入参指定的授权
     * @param param
     * @return
     */
    AclResult<String> changePermission(ChangePermissionParam param);

}
