package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.datapermission.CreateDataModelParam;
import com.alibaba.buc.acl.api.input.datapermission.DeleteDataModelParam;
import com.alibaba.buc.acl.api.input.datapermission.UpdateDataModelParam;

/**
 * 封装数据模型写服务
 * 类DataModelWriteService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年9月1日 下午2:34:35
 */
public interface DataModelWriteService {
    
    /**
     * 创建数据模型
     * @param param
     * @return
     */
    AclResult<String> createDataModel(CreateDataModelParam param);

    /**
     * 更新数据模型
     * @param param
     * @return
     */
    AclResult<String> updateDataModel(UpdateDataModelParam param);

    /**
     * 删除数据模型
     * @param param
     * @return
     */
    AclResult<String> deleteDataModel(DeleteDataModelParam param);
    
}
