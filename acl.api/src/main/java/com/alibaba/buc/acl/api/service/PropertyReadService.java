package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.datapermission.IsPropertyEnumValueExistParam;
import com.alibaba.buc.acl.api.input.datapermission.PagePropertyByAppAccessKeyParam;
import com.alibaba.buc.api.common.AclPageResult;
import com.alibaba.buc.api.common.AclPagination;
import com.alibaba.buc.api.datapermission.result.PropertyResult;

/**
 * 封装属性读服务
 * 类PropertyReadService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年11月4日 下午1:46:08
 */
public interface PropertyReadService {
    
    /**
     * 判断枚举属性值是否存在，存在返回true，不存在返回fale
     * 
     * 如果属性不是枚举类型的，则抛异常
     * 
     * @param param
     * @return
     */
    AclResult<Boolean> isPropertyEnumValueExist(IsPropertyEnumValueExistParam param);
    
    /**
     * 分页查询应用下数据权限，可查询共享数据权限
     * @param pagePropertyByAppAccessKeyParam
     * @return
     */
    AclResult<AclPageResult<PropertyResult>> pagePropertyByAppAccessKey(PagePropertyByAppAccessKeyParam pagePropertyByAppAccessKeyParam,AclPagination page);
    
    
}
