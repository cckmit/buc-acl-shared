package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.datapermission.CreateDataPermissionParam;
import com.alibaba.buc.acl.api.input.datapermission.DeleteDataPermissionParam;
import com.alibaba.buc.acl.api.input.datapermission.UpdateDataPermissionParam;

/**
 * 封装数据权限写服务
 * 类DataPermissionWriteService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年4月28日 下午3:51:28
 */
public interface DataPermissionWriteService {
    
    /**
     * 创建数据权限
     * @param param
     * @return
     */
    AclResult<String> createDataPermission(CreateDataPermissionParam param);

    /**
     * 更新数据权限
     * @param param
     * @return
     */
    AclResult<String> updateDataPermission(UpdateDataPermissionParam param);

    /**
     * 删除数据权限
     * @param param
     * @return
     */
    AclResult<String> deleteDataPermission(DeleteDataPermissionParam param);
    
}
