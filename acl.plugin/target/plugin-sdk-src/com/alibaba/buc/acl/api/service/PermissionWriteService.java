package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.permission.CreatePermissionParam;
import com.alibaba.buc.acl.api.input.permission.DeletePermissionParam;
import com.alibaba.buc.acl.api.input.permission.UpdatePermissionParam;

/**
 * Permission Write Service
 */
public interface PermissionWriteService {

    AclResult createPermission(CreatePermissionParam param);

    AclResult updatePermission(UpdatePermissionParam param);

    AclResult deletePermission(DeletePermissionParam param);
}
