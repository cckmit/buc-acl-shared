package com.alibaba.buc.acl.api.service;

import com.alibaba.buc.acl.api.common.AclResult;
import com.alibaba.buc.acl.api.input.datapermission.CreatePropertyEnumParam;
import com.alibaba.buc.acl.api.input.datapermission.DeletePropertyEnumParam;
import com.alibaba.buc.acl.api.input.datapermission.UpdatePropertyEnumParam;

/**
 * 封装属性相关写服务
 * 类PropertyWriteService.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年11月4日 下午2:23:37
 */
public interface PropertyWriteService {
    
    /**
     * 为属性添加枚举，如果属性不是枚举类型的，抛异常
     * @param param
     * @return
     */
    AclResult<String> createPropertyEnum(CreatePropertyEnumParam param);

    /**
     * 更新属性枚举信息，只能更新枚举title，如果属性不是枚举类型的，抛异常
     * @param param
     * @return
     */
    AclResult<String> updatePropertyEnum(UpdatePropertyEnumParam param);

    /**
     * 删除属性枚举信息，如果属性不是枚举类型的，抛异常
     * @param param
     * @return
     */
    AclResult<String> deletePropertyEnum(DeletePropertyEnumParam param);
    
}
