/**
 * Project: buc.api
 * 
 * File Created at 2011-10-8
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.buc.api;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.api.check.CheckPermissionDataParam;
import com.alibaba.buc.api.check.CheckPermissionDataResult;
import com.alibaba.buc.api.check.CheckPermissionParam;
import com.alibaba.buc.api.check.CheckPermissionResult;
import com.alibaba.buc.api.check.CheckRoleDataParam;
import com.alibaba.buc.api.check.CheckRoleDataResult;
import com.alibaba.buc.api.check.CheckRolesParam;
import com.alibaba.buc.api.check.CheckRolesResult;
import com.alibaba.buc.api.check.GetPermissionsDataParam;
import com.alibaba.buc.api.check.GetPermissionsDataResult;
import com.alibaba.buc.api.check.GetRolesDataParam;
import com.alibaba.buc.api.check.GetRolesDataResult;
import com.alibaba.buc.api.condition.CheckPermissionCondition;
import com.alibaba.buc.api.condition.PermissionCondition;
import com.alibaba.buc.api.condition.RoleCondition;
import com.alibaba.buc.api.condition.UserCondition;
import com.alibaba.buc.api.condition.permission.CheckDynamcPermissionCondition;
import com.alibaba.buc.api.condition.permission.DynamicPermissionCondition;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.model.PermissionResult;
import com.alibaba.buc.api.permission.check.CheckCriteria;
import com.alibaba.buc.api.result.CheckPermissionResultModel;
import com.alibaba.buc.api.result.PermissionResultModel;

/**
 * AccessControlService
 * 
 * @author howard
 * @author shenwujie
 */
public interface AccessControlService {

    
    /**
     * 验权
     *
     * @param checkPermissionParam 入参
     * @return List<CheckPermissionResult>
     * @throws BucException
     * @since 1.9
     */
	@Deprecated
    List<CheckPermissionResult> checkPermissions(CheckPermissionParam checkPermissionParam) throws BucException;

    

    /**
     * 动态权限验权接口,支持批量查询
     * 
     * @param checkDynamcPermissionCondition 动态权限查询条件。
     * @throws BucException
     */
	@Deprecated
    Map<DynamicPermissionCondition, CheckPermissionResultModel> checkPermissions(CheckDynamcPermissionCondition checkDynamcPermissionCondition)
                                                                                                                                               throws BucException;

    /**
     * 验角色,一次最多支持100个角色
     *
     * @param checkRolesParam 入参
     * @return List<CheckRoleResult>
     * @throws BucException
     * @since 1.1.0
     */
	@Deprecated
    List<CheckRolesResult> checkRoles(CheckRolesParam checkRolesParam) throws BucException;

    /**
     * 验数据权限，一次最多支持100个数据
     * 
     * @param checkPermissionDataParam 入参
     * @return List<CheckPermissionDataResult>
     * @throws BucException
     * @since 1.1.0
     */
    List<CheckPermissionDataResult> checkPermissionData(CheckPermissionDataParam checkPermissionDataParam)
                                                                                                          throws BucException;

    /**
     * 验数据角色，一次最多支持100个数据
     * 
     * @param checkRoleDataParam 入参
     * @return List<CheckRoleDataResult>
     * @throws BucException
     * @since 1.1.0
     */
    List<CheckRoleDataResult> checkRoleData(CheckRoleDataParam checkRoleDataParam) throws BucException;

    /**
     * 批量查找用户拥有权限的数据,一次最多支持100个权限
     * 
     * @param getPermissionsDataParam
     * @return List<GetPermissionsDataResult>
     * @throws BucException
     * @since 1.1.0
     */
    List<GetPermissionsDataResult> getPermissionsData(GetPermissionsDataParam getPermissionsDataParam)
                                                                                                      throws BucException;

    /**
     * 批量查找用户拥有角色的数据，一次最多支持100个角色
     * 
     * @param getRolesDataParam
     * @return List<GetRolesDataResult>
     * @throws BucException
     * @since 1.1.0
     */
    List<GetRolesDataResult> getRolesData(GetRolesDataParam getRolesDataParam) throws BucException;
    
    
    //-----------------------以下为过期接口，后期将不提供支持，切勿使用--------------------------
    /**
     * 验权
     *
     * @deprecated {@link AccessControlService#checkPermissions(CheckPermissionParam)}
     * @since 0.3 {@link PermissionCondition} @deprecated
     * @since 1.0 {@link CheckPermissionCondition}
     * @throws BucException
     */
    @Deprecated
    Map<String, CheckPermissionResultModel> checkPermissions(PermissionCondition permissionCondition)
                                                                                                     throws BucException;
    
    /**
     * 验权
     * 
     * @deprecated {@link AccessControlService#checkPermissions(PermissionCondition)}
     * @since 0.2
     * @throws BucException
     */
    @Deprecated
    List<PermissionResult> checkPermissions(CheckCriteria checkCriteria) throws BucException;
    
    /**
     * 获取用户拥有的权限
     * 
     * @deprecated
     * {@link UserPermissionService#findPermissionByUser(com.alibaba.buc.api.condition.UserPermissionCondition)}
     * @since 0.2
     * @throws BucException
     */
    @Deprecated
    Map<String, PermissionResultModel> listPermissionsByUser(UserCondition userCondition) throws BucException;

    /**
     * 获取角色的权限
     * 
     * @deprecated
     * @since 0.2
     * @throws BucException
     */
    @Deprecated
    Map<String, PermissionResultModel> listPermissionByRole(RoleCondition roleCondtion) throws BucException;

}
