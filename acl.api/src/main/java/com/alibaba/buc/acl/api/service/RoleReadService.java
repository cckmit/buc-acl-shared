package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.role.CheckUserRolesParam;
import com.alibaba.buc.acl.api.input.role.FindRolesByAppNameParam;
import com.alibaba.buc.acl.api.input.role.GetRoleParam;
import com.alibaba.buc.acl.api.input.role.PageRoleDataPermissionModelParam;
import com.alibaba.buc.acl.api.input.role.PageRolesByAppAccessKeyParam;
import com.alibaba.buc.acl.api.output.role.CheckUserRolesResult;
import com.alibaba.buc.acl.api.output.role.FindRolesByAppNameResult;
import com.alibaba.buc.acl.api.output.role.PageRolesByAppAccessKeyResult;
import com.alibaba.buc.acl.api.output.role.RoleResult;
import com.alibaba.buc.api.common.AclPageResult;
import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.datapermission.result.DataPermissionModelResult;

/**
 * Role Read Service
 */
public interface RoleReadService {

	/**
	 * 根据角色名称来获取单个角色
	 * @param param
	 * @return
	 */
    RoleResult getRole(GetRoleParam param);
    
    /**
     * 已废弃，请勿调用
     */
    @Deprecated
    CheckUserRolesResult checkUserRole(CheckUserRolesParam param);
    
    /**
     * 获取角色下数据权限模型列表
     * @param param
     * @return
     */
    AclResult<AclPageResult<DataPermissionModelResult>> pageRoleDataPermissionModel(PageRoleDataPermissionModelParam param,AclPagination page);
    
    /**
     * 获得某个应用下面的所有的角色的列表
     * @param param
     * @return
     */
    FindRolesByAppNameResult  findRolesByAppName(FindRolesByAppNameParam param);
    
    /**
     * 分页查询应用下角色，包含共享给应用的角色也能查出来
     * @param pageRolesByAppAccessKeyParam
     * @return
     */
    AclResult<AclPageResult<PageRolesByAppAccessKeyResult>> pageRolesByAppAccessKey(PageRolesByAppAccessKeyParam pageRolesByAppAccessKeyParam,AclPagination page);
    
}
