package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.grant.GrantPermissionsToUserParam;
import com.alibaba.buc.acl.api.input.grant.GrantPermissionsToUsergroupParam;
import com.alibaba.buc.acl.api.input.grant.GrantRolesToUserParam;
import com.alibaba.buc.acl.api.input.grant.GrantRolesToUsergroupParam;
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

}
