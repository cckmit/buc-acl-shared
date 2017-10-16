package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.datapermission.GetDataPermissionModelParam;
import com.alibaba.buc.acl.api.input.role.PageDataPermissionModelOperationParam;
import com.alibaba.buc.acl.api.input.role.PageDataPermissionModelPropertyParam;
import com.alibaba.buc.api.common.AclPageResult;
import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.datapermission.result.DataPermissionModelResult;
import com.alibaba.buc.api.datapermission.result.OperationResult;
import com.alibaba.buc.api.datapermission.result.PropertyResult;

/**
 * 封装数据权限模型相关方法,纠正命名问题，以后统一使用DataPermissionReadService
 * 类DataPermissionModelService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年4月28日 下午3:50:58
 */
@Deprecated
public interface DataPermissionModelReadService {

    /**
     * 分页查询数据权限模型包含的操作
     * @param param
     * @param page
     * @return
     */
    AclResult<AclPageResult<OperationResult>> pageDataPermissionModelOperation(PageDataPermissionModelOperationParam param,AclPagination page);
    
    /**
     * 分页查询数据权限模型包含的属性
     * @param param
     * @param page
     * @return
     */
    AclResult<AclPageResult<PropertyResult>> pageDataPermissionModelProperty(PageDataPermissionModelPropertyParam param,AclPagination page);
    
    /**
     * 获取数据权限模型
     * @param param
     * @return
     */
    AclResult<DataPermissionModelResult> getDataPermissionModel(GetDataPermissionModelParam param);
}
