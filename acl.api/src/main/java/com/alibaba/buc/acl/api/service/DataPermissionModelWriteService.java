package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.datapermission.CreateDataPermissionModelParam;
import com.alibaba.buc.acl.api.input.datapermission.DeleteDataPermissionModelParam;
import com.alibaba.buc.acl.api.input.datapermission.UpdateDataPermissionModelParam;

/**
 * 封装数据权限模型写服务,纠正命名问题，以后统一使用DataPermissionWriteService
 * 类DataPermissionModelWriteService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年4月28日 下午3:51:28
 */
@Deprecated
public interface DataPermissionModelWriteService {
    
    /**
     * 创建数据权限模型
     * @param param
     * @return
     */
    AclResult<String> createDataPermissionModel(CreateDataPermissionModelParam param);

    /**
     * 更新数据权限模型
     * @param param
     * @return
     */
    AclResult<String> updateDataPermissionModel(UpdateDataPermissionModelParam param);

    /**
     * 删除数据权限模型
     * @param param
     * @return
     */
    AclResult<String> deleteDataPermissionModel(DeleteDataPermissionModelParam param);
    
}
