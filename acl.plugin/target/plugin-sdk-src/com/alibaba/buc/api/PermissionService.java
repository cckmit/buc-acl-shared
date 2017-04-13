package com.alibaba.buc.api;

import com.alibaba.buc.api.condition.PageCondition;
import com.alibaba.buc.api.condition.PermissionDetailCondition;
import com.alibaba.buc.api.condition.PermissionQueryCondition;
import com.alibaba.buc.api.permission.AddDataToPermissionParam;
import com.alibaba.buc.api.data.DataResult;
import com.alibaba.buc.api.permission.GetDataFromPermissionParam;
import com.alibaba.buc.api.permission.RemoveDataFromPermissionParam;
import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.model.Page;
import com.alibaba.buc.api.param.PermissionParam;
import com.alibaba.buc.api.param.ResourcePermissionParam;
import com.alibaba.buc.api.permission.CreatePermissionParam;
import com.alibaba.buc.api.permission.DeletePermissionParam;
import com.alibaba.buc.api.permission.GetPermissionParam;
import com.alibaba.buc.api.permission.GetPermissionResult;
import com.alibaba.buc.api.permission.PermissionResult;
import com.alibaba.buc.api.permission.UpdatePermissionParam;
import com.alibaba.buc.api.result.PermissionResultModel;
import com.alibaba.buc.api.result.UserResultModel;

import java.util.List;

/**
 * @author shenwujie
 * @author meimei.limm
 * @author duhui.cj
 */
public interface PermissionService {
    
    /**
     * 创建权限
     * 推荐使用
     * @since 1.0.2
     * @throws BucException
     */
	@Deprecated
    public void createPermission(CreatePermissionParam param) throws BucException;
    
    /**
     * 修改权限
     * <p>
     * 修改权限需要传入所有字段, 为空字段会被更新为空
     * 两种更新方式，
     * 1、通过权限Name为唯一标识更新，如果需要更新operationName,resourceName，则需要这两个入参operationName,resourceName不为空。为空则权限去除跟操作、资源的关联关系。
     * 2、通过oldOperationName,oldResourceName为唯一标识更新，更新条件为oldOperationName,oldResourceName.operationName,resourceName为更新后的操作及资源名。
     * </p>
     * 
     * @since 1.0.2
     * @throws BucException
     */
	@Deprecated
    public void updatePermission(UpdatePermissionParam param) throws BucException;
    
    /**
     * 删除权限, 将删除权限相关配置及授权数据
     * <p> 权限不存在时不做处理, 不报异常 </p>
     * <p> 此方法只适用于删除权限名的权限, 需要删除操作的请使用 {@link PermissionService#deletePermission(Principal, PermissionParam)}}接口</p>
     * 
     * <ul>
     * <li>{@link DeletePermissionParam#setPrincipalUserId(String)} principalUserId, 必填</li>
     * <li>{@link DeletePermissionParam#setName(String)} name, 必填</li>
     * <li>{@link DeletePermissionParam#setAppName(String)} appName, 必填</li>
     * </ul>
     * 
     * @since 1.0
     * @throws BucException
     */
	@Deprecated
    public void deletePermission(DeletePermissionParam param) throws BucException;

    /**
     * 根据权限名查询权限
     * 如果查询不到，返回 NULL
     *
     * @since 1.9
     * @param getPermissionParam 根据 permissionName 全匹配查询
     * @return PermissionResult
     * @throws BucException
     */
	@Deprecated
    public PermissionResult getPermissionByName(GetPermissionParam getPermissionParam) throws BucException;

    /**
     * 查询权限
     * <ul>
     * <li>appName全匹配</li>
     * <li>permissionName全模糊</li>
     * <li>permissionTitle全模糊</li>
     * <li>riskLevel全匹配</li>
     * </ul>
     * 
     * @since 1.0
     * @param pageCondition 页码从1开始
     * @throws BucException
     */
	@Deprecated
    public Page<PermissionResultModel> pagePermission(PageCondition<PermissionDetailCondition> condition)
                                                                                                         throws BucException;
    
    /**
     * @deprecated {@link UserPermissionService#pageUsersByPermission(com.alibaba.buc.api.userpermission.PageUsersByPermissionParam, com.alibaba.buc.api.common.AclPagination)}
     * 
     * 查询有权限用户，只支持查询通过直接授予权限方式拥有权限的用户
     * @param condition
     * @return
     * @throws BucException
     */
    public Page<UserResultModel> pageUsersByPermission(PageCondition<PermissionQueryCondition> condition)
            																			throws BucException;

    /**
     * 给权限增加原生数据规则
     *
     * 一次最多只能设置100个数据规则
     *
     * 总计最大只能给权限设置100个原生数据（包括已经设置的）
     *
     * @param addDataToPermissionParam 入参
     * @throws BucException
     */
    public void addDataToPermission(AddDataToPermissionParam addDataToPermissionParam) throws BucException;

    /**
     * 从权限删除原生数据规则
     *
     * 一次最多只能设置100个数据规则
     *
     * @param removeDataFromPermissionParam 入参
     * @throws BucException
     */
    public void removeDataFromPermission(RemoveDataFromPermissionParam removeDataFromPermissionParam) throws BucException;

    /**
     * 获取权限原生数据规则
     *
     * @param getDataFromPermissionParam 入参
     * @throws BucException
     */
    public List<DataResult> getDataFromPermission(GetDataFromPermissionParam getDataFromPermissionParam) throws BucException;
    
    
    //-----------------------以下为过期接口，后期将不提供支持，切勿使用--------------------------
    /**
     * 检查权限是否存在
     * <p>
     * 以{@link PermissionParam#setName(String)}判断权限是否存在
     * </p>
     * @deprecated {@link PermissionService#getPermission(GetPermissionParam)}
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public boolean isExist(PermissionParam param) throws BucException;
    
    /**
     * 根据权限名查询权限
     * 如果查询不到，返回 NULL
     *
     * @since 1.9
     * @param getPermissionParam 根据 permissionName 全匹配查询
     * @return GetPermissionResult
     * @throws BucException
     *  @deprecated {@link PermissionService#getPermissionByName(GetPermissionParam)}
     */
    @Deprecated
    public GetPermissionResult getPermission(GetPermissionParam getPermissionParam) throws BucException;
    
    /**
     * 创建权限
     * 
     * @deprecated {@link PermissionService#createPermission(CreatePermissionParam)}
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void createPermission(Principal principal, PermissionParam param) throws BucException;
    
    /**
     * 修改权限
     * <p>
     * 修改权限需要传入所有字段, 为空字段会被更新为空
     * 两种更新方式，
     * 1、通过权限Name为唯一标识更新，如果需要更新operationName,resourceName，则需要这两个入参operationName,resourceName不为空。为空则权限去除跟操作、资源的关联关系。
     * 2、通过oldOperationName,oldResourceName为唯一标识更新，更新条件为oldOperationName,oldResourceName.operationName,resourceName为更新后的操作及资源名。
     * </p>
     * @deprecated {@link PermissionService#updatePermission(UpdatePermissionParam)}
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void updatePermission(Principal principal, PermissionParam param) throws BucException;
    
    /**
     * 创建资源权限
     * 
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void createResourcePermission(Principal principal, ResourcePermissionParam param) throws BucException;
    
    
    /**
     * @deprecated {@link PermissionService#deletePermission(DeletePermissionParam)}}
     * 
     * 删除权限
     * <p>
     * 以{@link PermissionParam#setName(String)}及{@link PermissionParam#setAppName(String)}删除权限, 将删除权限相关配置及授权数据
     * </p>
     * <p>
     * 权限不存在时不做处理, 不报异常
     * </p>
     * 
     * @since 1.0
     * @throws BucException
     */
    @Deprecated
    public void deletePermission(Principal principal, PermissionParam param) throws BucException;

}
