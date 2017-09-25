package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.datapermission.GetDataPermissionParam;
import com.alibaba.buc.acl.api.input.role.PageDataPermissionOperationParam;
import com.alibaba.buc.acl.api.input.role.PageDataPermissionPropertyParam;
import com.alibaba.buc.acl.api.input.role.PageDataPermissionsByAppAccessKeyParam;
import com.alibaba.buc.api.common.AclPageResult;
import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.datapermission.result.DataPermissionResult;
import com.alibaba.buc.api.datapermission.result.OperationResult;
import com.alibaba.buc.api.datapermission.result.PropertyResult;

/**
 * 封装数据权限相关读方法
 * 类DataPermissionReadService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年4月28日 下午3:50:58
 */
public interface DataPermissionReadService {

    /**
     * 分页查询数据权限包含的操作
     * @param param
     * @param page
     * @return
     */
    AclResult<AclPageResult<OperationResult>> pageDataPermissionOperation(PageDataPermissionOperationParam param,AclPagination page);
    
    /**
     * 分页查询数据权限包含的属性
     * @param param
     * @param page
     * @return
     */
    AclResult<AclPageResult<PropertyResult>> pageDataPermissionProperty(PageDataPermissionPropertyParam param,AclPagination page);
    
    /**
     * 获取数据权限
     * @param param
     * @return
     */
    AclResult<DataPermissionResult> getDataPermission(GetDataPermissionParam param);
    
    /**
     * 分页查询应用下数据权限，可查询共享数据权限
     * @param pageDataPermissionsByAppAccessKeyParam
     * @return
     */
    AclResult<AclPageResult<DataPermissionResult>> pageDataPermissionsByAppAccessKey(PageDataPermissionsByAppAccessKeyParam pageDataPermissionsByAppAccessKeyParam,AclPagination page);
    
}
