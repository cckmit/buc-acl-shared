package com.alibaba.buc.api;

import com.alibaba.buc.api.exception.BucException;
import com.alibaba.buc.api.param.ResourceParam;

/**
 * 封装资源相关操作
 * 类ResourceService.java的实现描述：TODO 类实现描述 
 * @deprecated
 * @author tongxu.ay 2014-3-5 下午4:24:47
 */
public interface ResourceService {

    /**
     * 创建资源
     * @param principal
     * @param param
     * @throws BucException
     */
    public void createResource(Principal principal, ResourceParam param) throws BucException;
    
    /**
     * 修改资源
     * 修改资源需要传入所有字段, 为空字段会被更新为空
     * @param principal
     * @param param
     * @throws BucException
     */
    public void updateResource(Principal principal, ResourceParam param) throws BucException;
    
    /**
     * 判断资源是否存在
     * param只需填写name属性即可
     * @param param
     * @return
     * @throws BucException
     */
    public boolean isExist(ResourceParam param) throws BucException;

    /**
     * 删除资源，主要需要设置资源name属性
     * @param principal
     * @param param
     * @param deletePermission 是否级联删除资源关联的权限，默认为false，即不删除
     * @throws BucException
     */
    public void deleteResource(Principal principal, ResourceParam param,boolean deletePermission) throws BucException;

}
