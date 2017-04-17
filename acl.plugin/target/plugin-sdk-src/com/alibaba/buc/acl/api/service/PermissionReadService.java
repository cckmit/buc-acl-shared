package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.input.permission.GetPermissionParam;
import com.alibaba.buc.acl.api.output.permission.PermissionResult;

/**
 * Permission Read Service
 */
public interface PermissionReadService {

    PermissionResult getPermission(GetPermissionParam param);
}
