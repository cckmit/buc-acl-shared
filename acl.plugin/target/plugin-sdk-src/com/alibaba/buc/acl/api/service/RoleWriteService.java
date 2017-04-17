package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.role.AddDataPermissionsToRoleParam;
import com.alibaba.buc.acl.api.input.role.AddPermissionsToRoleParam;
import com.alibaba.buc.acl.api.input.role.CreateRoleParam;
import com.alibaba.buc.acl.api.input.role.DeleteRoleParam;
import com.alibaba.buc.acl.api.input.role.RemoveDataPermissionsFromRoleParam;
import com.alibaba.buc.acl.api.input.role.RemovePermissionsFromRoleParam;
import com.alibaba.buc.acl.api.input.role.UpdateRoleParam;
import com.alibaba.buc.acl.api.output.role.RoleAddPermissionsResult;

/**
 * Role Write Service
 */
public interface RoleWriteService {

    AclResult createRole(CreateRoleParam param);

    AclResult updateRole(UpdateRoleParam param);

    AclResult deleteRole(DeleteRoleParam param);

    RoleAddPermissionsResult addPermissionsToRole(AddPermissionsToRoleParam param);

    AclResult removePermissionsFromRole(RemovePermissionsFromRoleParam param);
    
    /**
     * 给角色添加数据权限
     * @param param
     * @return
     */
    public AclResult<String> addDataPermissionToRole(AddDataPermissionsToRoleParam param);
    
    /**
     * 从角色中移除数据权限
     * @param param
     * @return
     */
    public AclResult<String> removeDataPermissionFromRole(RemoveDataPermissionsFromRoleParam param);
}
