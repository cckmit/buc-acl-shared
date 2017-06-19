package com.alibaba.buc.acl.api.service;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.api.common.AclPageResult;
import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.datapermission.param.AuthProfileParam;
import com.alibaba.buc.api.datapermission.param.DataProfileParam;
import com.alibaba.buc.api.datapermission.param.FindDataDetailParam;
import com.alibaba.buc.api.datapermission.param.GetDataPermissionDatasParam;
import com.alibaba.buc.api.datapermission.param.GetDataPermissionOperationsParam;
import com.alibaba.buc.api.datapermission.param.GetDatasByGrantObjectParam;
import com.alibaba.buc.api.datapermission.param.GetOperationsByGrantObjectParam;
import com.alibaba.buc.api.datapermission.param.NewAuthProfileParam;
import com.alibaba.buc.api.datapermission.param.PageGrantObjectDatasParam;
import com.alibaba.buc.api.datapermission.param.PageGrantObjectOperationsParam;
import com.alibaba.buc.api.datapermission.param.PageUserDataPermissionDatasParam;
import com.alibaba.buc.api.datapermission.param.PageUserOperationsParam;
import com.alibaba.buc.api.datapermission.result.CheckDataPermissionResult;
import com.alibaba.buc.api.datapermission.result.DataResult;
import com.alibaba.buc.api.datapermission.result.OperationResult;
import com.alibaba.buc.api.datapermission.result.ResourceDescriptorResult;
import com.alibaba.buc.api.exception.BucException;


/**
 * 数据权限相关验权接口
 * 类DataAccessControlService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年3月16日 下午4:35:12
 */
public interface DataAccessControlService {

    
    /**
     * 数据权限验权，会校验数据模型等
     * @param dataPermission
     * @return
     * @throws BucException
     */
    AclResult<Map<DataProfileParam, CheckDataPermissionResult>> newCheckDataPermission(NewAuthProfileParam dataPermission) throws BucException;
    
    /**
     * 分页查询用户授权数据的接口，会查询直接授予用户、通过角色、用户组、部门授予用户的数据权限数据
     * 
     * 返回结果是每次授权code列表，数据详情需要调用findDataDetail获取
     * 
     * @param pageDataPermissionDatasParam
     * @param page
     * @return
     * @throws BucException
     */
    AclResult<AclPageResult<String>> pageUserDataPermissionDatas(PageUserDataPermissionDatasParam pageUserDataPermissionDatasParam,AclPagination page) throws BucException;
    
    /**
     * 查询一个授权包含数据详情的接口，一次查询包含的授权code不能超过100个
     * @param findDataDetailParam
     * @return
     * @throws BucException
     */
    AclResult<List<DataResult>> findDataDetail(FindDataDetailParam findDataDetailParam) throws BucException;
    
    /**
     * 分页查询用户可以执行的操作
     * @param pageUserOperationsParam
     * @param page
     * @return
     * @throws BucException
     */
    AclPageResult<OperationResult> pageUserOperations(PageUserOperationsParam pageUserOperationsParam,AclPagination page) throws BucException;
    
    /**
     * 查询角色、用户组等授权对象可执行的操作
     * @param pageGrantObjectOperationsParam
     * @param page
     * @return
     * @throws BucException
     */
    AclPageResult<OperationResult> pageGrantObjectOperations(PageGrantObjectOperationsParam pageGrantObjectOperationsParam,AclPagination page) throws BucException;
    
    /**
     * 分页查询角色、用户组等授权对象拥有的数据
     * @param pageGrantObjectDatasParam
     * @param page
     * @return
     * @throws BucException
     */
    AclPageResult<String> pageGrantObjectDatas(PageGrantObjectDatasParam pageGrantObjectDatasParam,AclPagination page) throws BucException;
    
    /**
     * pageUserDataPermissionDatas的http调用，hsf请勿调用
     * @param jsonParam
     * @return
     * @throws BucException
     */
    AclResult<AclPageResult<String>> pageUserDataPermissionDatasForHttp(String jsonParam) throws BucException;
    
    /**
     * findDataDetail的http调用，hsf请勿调用
     * @param jsonParam
     * @return
     * @throws BucException
     */
    AclResult<List<DataResult>> findDataDetailForHttp(String jsonParam) throws BucException;
    
    /**
     * 获取用户可以执行的所有操作
     * @param getDataPermissionOperationsParam
     * @return
     * @throws BucException
     */
    @Deprecated
    AclResult<List<OperationResult>> getDataPermissionOperations(GetDataPermissionOperationsParam getDataPermissionOperationsParam) throws BucException;
    
    
    /**
     * 获取授权对象可以执行的所有操作，授权对象目前支持角色
     * @param getDataPermissionOperationsParam
     * @return
     * @throws BucException
     */
    @Deprecated
    AclResult<List<OperationResult>> getOperationsByGrantObject(GetOperationsByGrantObjectParam getDataPermissionOperationsParam) throws BucException;
    
    
    /**
     * 获取授予用户的所有数据，推荐使用pageUserDataPermissionDatas
     * @param getDataPermissionDatasParam
     * @return
     * @throws BucException
     */
    @Deprecated
    AclResult<List<ResourceDescriptorResult>> getDataPermissionDatas(GetDataPermissionDatasParam getDataPermissionDatasParam) throws BucException;
    
    
    /**
     * 获取授予对象的所有数据
     * @param getDataPermissionDatasParam
     * @return
     * @throws BucException
     */
    @Deprecated
    AclResult<List<ResourceDescriptorResult>> getDatasByGrantObject(GetDatasByGrantObjectParam getDatasByGrantObjectParam) throws BucException;
    
    /**
     * 获取授予用户的所有数据
     * 
     * 返回结果只包含数据value列表，而不区分value所属属性
     * 
     * 所以只支持业务场景比较简单，数据权限模型仅包含一个属性的应用调用
     * 
     * 推荐使用pageUserDataPermissionDatas
     * 
     * @param getDataPermissionDatasParam
     * @return
     * @throws BucException
     */
    @Deprecated
    AclResult<List<String>> getSimpleDataPermissionDatas(GetDataPermissionDatasParam getDataPermissionDatasParam) throws BucException;
    
    /**
     * 数据权限验权，已废弃，遇到大数据量授权会出现性能问题，请使用newCheckDataPermission
     * @param dataPermission
     * @return
     * @throws BucException
     */
    @Deprecated
    AclResult<Map<DataProfileParam, CheckDataPermissionResult>> checkDataPermission(AuthProfileParam dataPermission) throws BucException;
}
