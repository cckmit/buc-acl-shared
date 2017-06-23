package com.alibaba.buc.api;

import java.util.List;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.api.common.AclPageResult;
import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.condition.PageCondition;
import com.alibaba.buc.api.condition.RoleQueryByPermissionCondition;
import com.alibaba.buc.api.condition.RoleQueryCondition;
import com.alibaba.buc.api.data.DataResult;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.model.Page;
import com.alibaba.buc.api.model.Resource;
import com.alibaba.buc.api.model.Role;
import com.alibaba.buc.api.param.MultiRoleParam;
import com.alibaba.buc.api.param.RoleParam;
import com.alibaba.buc.api.param.RolePermissionParam;
import com.alibaba.buc.api.param.RoleRelationParam;
import com.alibaba.buc.api.permission.PermissionResult;
import com.alibaba.buc.api.result.RoleResultModel;
import com.alibaba.buc.api.result.UserResultModel;
import com.alibaba.buc.api.role.AddDataToRoleParam;
import com.alibaba.buc.api.role.AddPermissionsToRoleParam;
import com.alibaba.buc.api.role.CreateMultiRoleParam;
import com.alibaba.buc.api.role.CreateRoleParam;
import com.alibaba.buc.api.role.DeleteRoleParam;
import com.alibaba.buc.api.role.GetDataFromRoleParam;
import com.alibaba.buc.api.role.GetRoleParam;
import com.alibaba.buc.api.role.PagePermissionByRoleNameParam;
import com.alibaba.buc.api.role.PageRolesByPermissionParam;
import com.alibaba.buc.api.role.PageSubRolesByRoleNameParam;
import com.alibaba.buc.api.role.RemoveDataFromRoleParam;
import com.alibaba.buc.api.role.RemovePermissionsFromRoleParam;
import com.alibaba.buc.api.role.RoleResult;
import com.alibaba.buc.api.role.UpdateMultiRoleParam;
import com.alibaba.buc.api.role.UpdateRoleParam;

public interface RoleService {

    /**
     * @deprecated {@link RoleService#pageRolesByPermission(PageRolesByPermissionParam, AclPagination)}
     * 取得所有包含指定权限的角色
     * 
     * @param condition
     * @return
     * @throws BucException
     */
    Page<Role> pageRolesByPermission(PageCondition<RoleQueryByPermissionCondition> condition) throws BucException;
    
    /**
     * 取得所有包含指定权限的角色，为适配epaas平台提供http服务专用
     * @param param
     * @param page
     * @return
     * @throws BucException
     */
    AclResult<Page<Role>> pageRolesByPermissionForHttp(PageRolesByPermissionParam param, AclPagination page) throws BucException;
    
    /**
     * 取得所有包含指定权限的角色
     * 
     * @throws BucException
     * 
     * <ul>
     * <li>{@link PageRolesByPermissionParam#setName(String)} 权限英文名, 必填, 必须为权限名全称</li>
     * <li>{@link AclPagination#setPageNo(int)} 当前页码, 可选</li>
     * <li>{@link AclPagination#setPageSize(int)} 每页的条数, 可选</li>
     * </ul>
     * 
     * <ul>
     * <li>出参中的RoleResult的说明<li>
     * <li>{@link RoleResult#getName()} String, 角色名, 英文</li>
     * <li>{@link RoleResult#getTitle()} String, 角色名, 中文</li>
     * <li>{@link RoleResult#getIsSystem()} Boolean, 是否系统角色</li>
     * <li>{@link RoleResult#getDescription()} String, 角色描述</li>
     * <ul> 
     */
    AclPageResult<RoleResult> pageRolesByPermission(PageRolesByPermissionParam param, AclPagination page) 
    																					throws BucException;

    /**
     * 创建角色
     * 
     * @since 1.0.2
     * @throws BucException
     */
    @Deprecated
    public void createRole(CreateRoleParam param) throws BucException;

    /**
     * 创建跨应用角色
     * 
     * @since 1.0.2
     * @throws BucException
     */
    
    public void createMultiRole(CreateMultiRoleParam param) throws BucException;
    
    /**
     * 更新角色
     * 
     * @since 1.0.2
     * @throws BucException
     */
    @Deprecated
    public void updateRole(UpdateRoleParam param) throws BucException;
    

    /**
     * 更新跨应用角色
     * 
     * @since 1.0
     * @throws BucException
     */
    public void updateMultiRole(UpdateMultiRoleParam param) throws BucException;


    /**
     * 获取权限来源列表
     * 
     * @return
     * @throws BucException
     */
    public List<Resource> findAvailableAppsByUserId(Principal principal) throws BucException;

    /**
     * @deprecated {@link RoleService#deleteRole(DeleteRoleParam)}
     * 删除角色
     * <p>
     * 以{@link RoleParam#setName(String)}及{@link RoleParam#setAppName(String)}删除角色, 将删除角色相关配置及授权数据
     * </p>
     * <p>
     * 角色不存在时不做处理, 不报异常
     * </p>
     * 
     * @since 1.0
     * @throws BucException
     */
    public void deleteRole(Principal principal, RoleParam param) throws BucException;
    
    /**
     * 删除角色, 将删除角色相关配置及授权数据
     * <p> 角色不存在时不做处理, 不报异常 </p>
     * 
     * <ul>
     * <li>{@link DeleteRoleParam#setPrincipalUserId(String)} principalUserId, 必填</li>
     * <li>{@link DeleteRoleParam#setName(String)} name, 必填</li>
     * <li>{@link DeleteRoleParam#setAppName(String)} appName, 必填</li>
     * </ul>
     * 
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void deleteRole(DeleteRoleParam param) throws BucException;

    
    /**
     * 给角色添加权限
     * <p/>
     * 一次最多可以给角色添加100个权限
     * 
     * @param addPermissionsToRoleParam 入参
     * @throws BucException
     * @since 1.9
     */
    @Deprecated
    public Integer addPermissionsToRole(AddPermissionsToRoleParam addPermissionsToRoleParam) throws BucException;

    
    /**
     * 从角色中移除权限
     * <p/>
     * 如果角色权限关系不存在，则不做操作，不会报异常
     * <p/>
     * 不可以移除系统角色中的系统权限，不报异常
     * <p/>
     * 一次最多可以从角色中移除100个权限
     * 
     * @param removePermissionsFromRoleParam 入参
     * @throws BucException
     * @since 1.9
     */
    @Deprecated
    public void removePermissionsFromRole(RemovePermissionsFromRoleParam removePermissionsFromRoleParam)
                                                                                                        throws BucException;

    /**
     * @deprecated {@link UserPermissionService#pageUsersByRole(com.alibaba.buc.api.userpermission.PageUsersByRoleParam, AclPagination)}
     * 根据应用名，角色英文名查询用户列表
     * 
     * @param condition
     * @return
     * @throws BucException
     */
    public Page<UserResultModel> pageUsersByRole(PageCondition<RoleQueryCondition> condition) throws BucException;

    /**
     * 根据应用名，角色英文名或角色中文名模糊查询用户列表
     * 
     * @param condition
     * @return
     * @throws BucException
     */
    public Page<RoleResultModel> pageRole(PageCondition<RoleQueryCondition> condition) throws BucException;

    /**
     * 从角色中添加子角色
     * <p>
     * 最多可以一次添加100个子角色
     * </p>
     * 
     * @throws BucException
     */
    @Deprecated
    public void addRolesToRole(Principal principal, RoleRelationParam param) throws BucException;

    /**
     * 从角色中移除子角色
     * 
     * @throws BucException
     */
    @Deprecated
    public void removeRolesFromRole(Principal principal, RoleRelationParam param) throws BucException;

    /**
     * 根据角色名称，精确查找某个角色, 无则为null
     * 
     * @since 1.9
     */
    @Deprecated
    public RoleResult getRole(GetRoleParam req) throws BucException;

    /**
     * 分页查询某个角色下面的权限列表
     */
    public AclPageResult<PermissionResult> pagePermissionsByRoleName(PagePermissionByRoleNameParam req, AclPagination page) throws BucException;
    
    /**
     * 分页查询某个角色下面的权限列表，为适配epaas平台提供http服务专用
     */
    public AclResult<AclPageResult<PermissionResult>> pagePermissionsByRoleNameForHttp(PagePermissionByRoleNameParam req, AclPagination page) throws BucException;
    

    /**
     * 分页查询某个角色下面的子角色列表
     */
    public AclPageResult<RoleResult> pageSubRolesByRoleName(PageSubRolesByRoleNameParam req, AclPagination page) throws BucException;

    /**
     * 给角色增加原生数据规则
     *
     * 一次最多只能设置100个数据规则
     * 总计最大只能给角色设置100个原生数据（包括已经设置的）
     *
     * @param addDataToRoleParam 入参
     * @throws BucException
     */
    public void addDataToRole (AddDataToRoleParam addDataToRoleParam) throws BucException;

    /**
     * 从角色删除原生数据规则
     *
     * 一次最多只能设置100个数据规则
     *
     * @param removeDataFromRoleParam 入参
     * @throws BucException
     */
    public void removeDataFromRole (RemoveDataFromRoleParam removeDataFromRoleParam) throws BucException;

    /**
     * 获取角色原生数据规则列表
     *
     * @param getDataFromRoleParam 入参
     * @throws BucException
     */
    public List<DataResult> getDataFromRole (GetDataFromRoleParam getDataFromRoleParam) throws BucException;

    
    //-----------------------以下为过期接口，后期将不提供支持，切勿使用--------------------------
    /**
     * 根据应用与帐号查询所有的角色(只查询出直接授予的角色), 兼容0.3提供的接口, 请勿使用
     * 
     * @deprecated {@link UserPermissionService#findRoleByUser(com.alibaba.buc.api.condition.UserRoleCondition)}
     * @since 0.3
     * @param account:BUC userProfile中的account字段,或邮箱全称，或域帐号
     * @param appName：权限域
     * @return：角色列表 name,desc
     * @throws BucException
     */
    @Deprecated
    List<Role> findAccountRoles(String account, String appName) throws BucException;
    
    /**
     * 检查角色是否存在
     * <p>
     * 以{@link RoleParam#setName(String)}判断权限是否存在
     * </p>
    *  @deprecated {@link RoleService#getRole(GetRoleParam)}
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public boolean isExist(RoleParam param) throws BucException;

    /**
     * 创建角色
     * 
     * @deprecated {@link RoleService#createRole(CreateRoleParam)}
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void createRole(Principal principal, RoleParam param) throws BucException;
    
    /**
     * 创建跨应用角色
     * @deprecated {@link RoleService#createMultiRole(CreateMultiRoleParam)}
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void createMultiRole(Principal principal, MultiRoleParam param) throws BucException;
    
    /**
     * 更新角色
     * 
     * @deprecated {@link RoleService#updateRole(UpdateRoleParam)}
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void updateRole(Principal principal, RoleParam param) throws BucException;
    
    /**
     * 更新跨应用角色
     * 
     * @deprecated {@link RoleService#updateMultiRole(UpdateMultiRoleParam)}
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void updateMultiRole(Principal principal, MultiRoleParam param) throws BucException;
    
    /**
     * @deprecated {@link RoleService#addPermissionsToRole(AddPermissionsToRoleParam)} 给角色添加权限
     * <p>
     * 最多可以插入100条，例如给1个角色添加100个权限、或给100个角色均添加1个权限，可以随机组合，总数不能超过100
     * </p>
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void addPermissionsToRoles(Principal principal, String appName, List<RolePermissionParam> rolePermissions)
                                                                                                                     throws BucException;

    /**
     * @deprecated {@link RoleService#removePermissionsFromRole(RemovePermissionsFromRoleParam)} 从角色中移除权限
     * <p>
     * 如果角色权限关系不存在，则不做操作，不会报异常
     * </p>
     * <p>
     * 不可以移除系统角色中的系统权限，不报异常
     * </p>
     * <p>
     * 最多可以移除100条，例如从1个角色移除100个权限、或给100个角色均移除1个权限，可以随机组合，总数不能超过100
     * </p>
     * @throws BucException
     */
    @Deprecated
    public void removePermissionsFromRoles(Principal principal, String appName,
                                           List<RolePermissionParam> rolePermissions) throws BucException;

}
