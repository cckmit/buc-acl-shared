package com.alibaba.buc.api;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.api.common.AclPageResult;
import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.condition.PageCondition;
import com.alibaba.buc.api.condition.UserOperationCondition;
import com.alibaba.buc.api.condition.UserPermissionCondition;
import com.alibaba.buc.api.condition.UserPermissionDetailCondition;
import com.alibaba.buc.api.condition.UserRoleCondition;
import com.alibaba.buc.api.condition.UserRoleDetailCondition;
import com.alibaba.buc.api.condition.UserRolePermissionCondition;
import com.alibaba.buc.api.condition.UsersPermissionCondition;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.model.Operation;
import com.alibaba.buc.api.model.Page;
import com.alibaba.buc.api.model.Permission;
import com.alibaba.buc.api.model.Resource;
import com.alibaba.buc.api.model.Role;
import com.alibaba.buc.api.param.UserApplyParam;
import com.alibaba.buc.api.permission.PagePermissionsByUserParam;
import com.alibaba.buc.api.permission.PermissionResult;
import com.alibaba.buc.api.result.PermissionResultModel;
import com.alibaba.buc.api.result.UserApplyResultModel;
import com.alibaba.buc.api.result.UserPermissionCountResultModel;
import com.alibaba.buc.api.result.UserPermissionResultModel;
import com.alibaba.buc.api.result.UserPermissionsResultModel;
import com.alibaba.buc.api.result.UserRoleCountResultModel;
import com.alibaba.buc.api.role.PageRolesByUserParam;
import com.alibaba.buc.api.role.RoleResult;
import com.alibaba.buc.api.userpermission.*;

public interface UserPermissionService {

    /**
     * 获取用户拥有的所有操作, 如果有, 则
     * 
     * @param userOperationCondition
     * @return
     * @throws BucException
     */
    public List<Operation> findOperationByUser(UserOperationCondition userOperationCondition) throws BucException;

    /**
     * 根据用户、操作英文名查询用户通过该操作能操作哪些资源
     * 
     * @param userOperationCondition
     * @return
     * @throws BucException
     */
    public List<Resource> findResourceByUserOperation(UserOperationCondition userOperationCondition)
    																						throws BucException;
    
    /**
     * 分页查询应用下用户直接角色记录
     * 
     * @throws BucException
     * 
     * <ul>
     * <li>入参说明<li>
     * <li>{@link PageRolesByUserParam#setUserId(Integer)} 用户Id, 必填</li>
     * <li>{@link PageRolesByUserParam#setAppName(String)} 应用英文名, 必填, 必须为应用的全称</li>
     * <li>{@link AclPagination#setPageNo(int)} 当前页码, 可选</li>
     * <li>{@link AclPagination#setPageSize(int)} 每页的条数, 可选</li>
     * </ul>
     * 
     * <ul>
     * <li>出参中的RoleResult的说明<li>
     * <li>{@link RoleResult#getName()} String, 角色名称, 英文名</li>
     * <li>{@link RoleResult#getTitle()} String, 角色中文名</li>
     * <li>{@link RoleResult#getIsSystem()} Boolean, 是否系统</li>
     * <li>{@link RoleResult#getDescription()} String, 角色描述</li>
     * </ul>
     */
    public AclPageResult<RoleResult> pageRolesByUser(PageRolesByUserParam req, AclPagination page) 
																						throws BucException;
    
    /**
     * 分页查询应用下用户直接角色记录
     * 
     * @throws BucException
     * 
     * <ul>
     * <li>{@link PagePermissionsByUserParam#setUserId(Integer)} 用户Id, 必填</li>
     * <li>{@link PagePermissionsByUserParam#setAppName(String)} 应用英文名, 必填, 必须为应用的全称</li>
     * <li>{@link AclPagination#setPageNo(int)} 当前页码, 可选</li>
     * <li>{@link AclPagination#setPageSize(int)} 每页的条数, 可选</li>
     * </ul>
     * 
     * <ul>
     * <li>出参中的PermissionResult的说明<li>
     * <li>只有以下四个值返回, 其余都为null<li>
     * <li>{@link PermissionResult#getPermissionName()} String, 权限名称, 英文名</li>
     * <li>{@link PermissionResult#getPermissionTitle()} String, 权限中文名</li>
     * <li>{@link PermissionResult#getMaxExpireDate()} String, 最大过期时间</li>
     * <li>{@link PermissionResult#getRiskLevel()} String, 权限风险等级(L,M,H)</li>
     * </ul>
     */
    public AclPageResult<PermissionResult> pagePermissionsByUser(PagePermissionsByUserParam req, AclPagination page) 
																										throws BucException;
    
    /**
     * 分页查询有权限用户, 只支持查询通过直接授予权限方式拥有权限的用户
     * 
     * @throws BucException
     * 
     * <ul>
     * <li>{@link PageUsersByPermissionParam#setName(String)} 权限英文名, 必填</li>
     * <li>{@link PageUsersByPermissionParam#setAppName(String)} 应用英文名, 必填, 必须为应用的全称</li>
     * <li>{@link AclPagination#setPageNo(int)} 当前页码, 可选</li>
     * <li>{@link AclPagination#setPageSize(int)} 每页的条数, 可选</li>
     * </ul>
     * 
     * <ul>
     * <li>出参中的UserResult的说明<li>
     * <li>{@link UserResult#getId()} int, id</li>
     * <li>{@link UserResult#getEmpId()} String, 工号</li>
     * <li>{@link UserResult#getName()} String, 真名</li>
     * <li>{@link UserResult#getNickName()} String, 花名</li> 
     */
    public AclPageResult<UserResult> pageUsersByPermission(PageUsersByPermissionParam param, AclPagination page)
            																						throws BucException;
    
    /**
     * 根据应用名, 角色英文名查询用户列表
     * 
     * @throws BucException
     * 
     * <ul>
     * <li>{@link PageUsersByRoleParam#setName(String)} 角色英文名, 必填</li>
     * <li>{@link PageUsersByRoleParam#setAppName(String)} 应用英文名, 必填, 必须为应用的全称</li>
     * <li>{@link AclPagination#setPageNo(int)} 当前页码, 可选</li>
     * <li>{@link AclPagination#setPageSize(int)} 每页的条数, 可选</li>
     * </ul>
     * 
     * <ul>
     * <li>出参中的UserResult的说明<li>
     * <li>{@link UserResult#getId()} int, id</li>
     * <li>{@link UserResult#getEmpId()} String, 工号</li>
     * <li>{@link UserResult#getName()} String, 真名</li>
     * <li>{@link UserResult#getNickName()} String, 花名</li>
     */
    public AclPageResult<UserResult> pageUsersByRole(PageUsersByRoleParam param, AclPagination page)
    																						throws BucException;

    /**
     * 给用户权限增加数据规则
     *
     * 一次最多只能设置100个数据规则
     * 总计最大只能给用户权限设置1000个数据规则（包括用户已经被设置的）
     *
     * @param addDataToUserPermissionParam 入参
     * @throws BucException
     */
    public void addDataToUserPermission(AddDataToUserPermissionParam addDataToUserPermissionParam) throws BucException;

    /**
     * 从用户权限删除数据规则
     *
     * 一次最多只能设置100个数据规则
     *
     * @param removeDataFromUserPermissionParam 入参
     * @throws BucException
     */
    public void removeDataFromUserPermission(RemoveDataFromUserPermissionParam removeDataFromUserPermissionParam) throws BucException;

    /**
     * 给用户角色增加数据规则
     *
     * 一次最多只能设置100个数据规则
     * 总计最大只能给用户角色设置1000个数据规则（包括用户已经被设置的）
     *
     * @param addDataToUserRoleParam 入参
     * @throws BucException
     */
    public void addDataToUserRole (AddDataToUserRoleParam addDataToUserRoleParam) throws BucException;

    /**
     * 从用户角色删除数据规则
     *
     * 一次最多只能设置100个数据规则
     *
     * @param removeDataFromUserRoleParam 入参
     * @throws BucException
     */
    public void removeDataFromUserRole (RemoveDataFromUserRoleParam removeDataFromUserRoleParam) throws BucException;

    //-----------------------以下为过期接口，后期将不提供支持，切勿使用--------------------------
    /**
     * @deprecated
     *
     * 查找用户的权限, 权限结果包含：
     * <ol>
     * <li>直接授予的权限</li>
     * <li>直接授予角色包含的权限</li>
     * <li>所在用户组的权限</li>
     * <li>所在用户组的角色包含的权限</li>
     * <li>所在部门的权限</li>
     * <li>所在部门的角色包含的权限</li>
     * </ol>
     * 其中部门权限、角色包含部门从父组织继承来的权限、角色, 角色包含所有子角色权限
     *
     * @since 1.0
     */
    @Deprecated
    public List<Permission> findPermissionByUser(UserPermissionCondition userPermissionCondition) throws BucException;

    /**
     * @deprecated
     *
     * 查询用户是否拥有指定角色, 如果有, 则返回角色下所有权限,  condition里只支持userId、roleName
     *
     * @param condition
     * @return List
     * @throws BucException
     */
    @Deprecated
    public List<Permission> findPermissionByUserRole(UserRolePermissionCondition condition) throws BucException;

    /**
     * @deprecated
     *
     * 查找指定用户对应权限, 此接口支持 UserId(不能为空) AppName(可为空) PermissionName支持全模糊(可为空) PermissionTitle支持全模糊(可为空) RiskLevel(可为空) 查询
     *
     * @param condition
     * @return Page
     * @throws BucException
     */
    @Deprecated
    public Page<PermissionResultModel> pagePermissionByUser(PageCondition<UserPermissionDetailCondition> condition) throws BucException;

    /**
     * @deprecated
     *
     * 查找用户的角色, 角色结果包含：
     * <ol>
     * <li>直接授予的角色</li>
     * <li>所在用户组角色</li>
     * <li>部门及部门继承来的角色</li>
     * </ol>
     * 不包括已冻结的角色
     *
     * @param userRoleCondition
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public List<Role> findRoleByUser(UserRoleCondition userRoleCondition) throws BucException;

    /**
     * @deprecated
     *
     * 支持多个用户查询, 返回每个用户对应所拥有的权限
     *
     * @since 1.0
     */
    @Deprecated
    public List<UserPermissionResultModel> findPermissionByUsers(UsersPermissionCondition usersPermissionCondition) throws BucException;

    /**
     * @deprecated
     *
     * 分页查询应用下直接授予权限的用户
     * <ul>
     * <li>{@link UserPermissionDetailCondition#setAppName(String)} 应用名, 必填</li>
     * <li>{@link UserPermissionDetailCondition#setPermissionName(String)} 权限英文名, 可选, 支持右模糊, 需设置{@link UserPermissionDetailCondition#setRightLike(boolean)} 长度必须大于1</li>
     * <li>{@link UserPermissionDetailCondition#setPermissionTitle(String)} 权限中文名, 可选, 支持右模糊, 需设置{@link UserPermissionDetailCondition#setRightLike(boolean)} 长度必须大于1</li>
     * <li>{@link UserPermissionDetailCondition#setUserId(String)} 用户ID, 可选, 填写后限定用户</li>
     * <li>{@link UserPermissionDetailCondition#setIsActive(Boolean)} 用户权限关系是否冻结, 可选, 填写后限定用户权限状态</li>
     * </ul>
     *
     * @since 1.0
     * @return 用户及权限数目
     * @throws BucException
     */
    @Deprecated
    public Page<UserPermissionCountResultModel> pageUserPermissionCount(PageCondition<UserPermissionDetailCondition> condition) throws BucException;

    /**
     * @deprecated
     *
     * 分页查询应用下直接授予的用户权限记录
     * <p>
     * 走数据库查询, 限定用户情况下请使用{@link UserPermissionService#findPermissionByUsers(UsersPermissionCondition)}
     * </p>
     * <ul>
     * <li>{@link UserPermissionDetailCondition#setAppName(String)} 应用名, 必填</li>
     * <li>{@link UserPermissionDetailCondition#setPermissionName(String)} 权限英文名, 可选, 支持右模糊, 需设置{@link UserPermissionDetailCondition#setRightLike(boolean)} 长度必须大于1</li>
     * <li>{@link UserPermissionDetailCondition#setPermissionTitle(String)} 权限中文名, 可选, 支持右模糊, 需设置{@link UserPermissionDetailCondition#setRightLike(boolean)} 长度必须大于1</li>
     * <li>{@link UserPermissionDetailCondition#setUserId(String)} 用户ID, 可选, 填写后限定用户 , 用户ID为空或者NULL不限定用户</li>
     * <li>{@link UserPermissionDetailCondition#setIsActive(Boolean)} 用户权限关系是否冻结, 可选, 填写后限定用户权限状态</li>
     * </ul>
     *
     * @since 1.0
     * @return 用户权限记录
     * @throws BucException
     */
    @Deprecated
    public Page<UserPermissionsResultModel> pageUserPermission(PageCondition<UserPermissionDetailCondition> condition) throws BucException;

    /**
     * @deprecated
     *
     * 分页查询应用下直接授予角色的用户
     * <ul>
     * <li>{@link UserRoleDetailCondition#setAppName(String)} 应用名, 必填</li>
     * <li>{@link UserRoleDetailCondition#setRoleName(String)} 角色英文名, 可选, 支持右模糊, 需设置{@link UserRoleDetailCondition#setRightLike(boolean)} 长度必须大于1</li>
     * <li>{@link UserRoleDetailCondition#setRoleTitle(String)} 角色中文名, 可选, 支持右模糊, 需设置{@link UserRoleDetailCondition#setRightLike(boolean)} 长度必须大于1</li>
     * <li>{@link UserRoleDetailCondition#setUserId(String)} 用户ID, 可选, 填写后限定用户 , 用户ID为空或者NULL不限定用户</li>
     * <li>{@link UserRoleDetailCondition#setIsActive(Boolean)} 用户权限关系是否冻结, 可选, 填写后限定用户权限状态</li>
     * </ul>
     *
     * @since 1.0
     * @return 用户及角色数目
     * @throws BucException
     */
    @Deprecated
    public Page<UserRoleCountResultModel> pageUserRoleCount(PageCondition<UserRoleDetailCondition> condition) throws BucException;

    /**
     * @deprecated
     *
     * 判断用戶的角色下是否包含指定权限
     * @param rolePermissionConditionList
     * @return Map
     * @throws BucException
     */
    @Deprecated
    public Map<UserRolePermissionCondition, Boolean> hasRolePermission(List<UserRolePermissionCondition> rolePermissionConditionList) throws BucException;

    /**
     * @deprecated
     * {@link com.alibaba.buc.api.ApplyInstanceService#applyPermission(ApplyPermissionParam)}
     *
     * 申请acl权限、角色等方法
     * @param userApplyParam
     * @return
     * @throws BucException
     */
    @Deprecated
    public UserApplyResultModel applyPermission(UserApplyParam userApplyParam) throws BucException;
}
