package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.datapermission.GetDataModelParam;
import com.alibaba.buc.api.datapermission.result.DataModelResult;

/**
 * 封装数据模型读服务
 * 类DataPermissionModelWriteService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年4月28日 下午3:51:28
 */
public interface DataModelReadService {
    
    /**
     * 获取数据模型
     * @param param
     * @return
     */
    AclResult<DataModelResult> getDataModel(GetDataModelParam param);
    
}
