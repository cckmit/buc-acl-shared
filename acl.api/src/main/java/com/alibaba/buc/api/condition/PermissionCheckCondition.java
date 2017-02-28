package com.alibaba.buc.api.condition;

import com.alibaba.buc.api.condition.permission.AbstractPermissionCondition;
import com.alibaba.buc.api.principal.Principal;

/**
 * 封装验权接口中要验权限信息
 * 类PermissionCheckCondition.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-20 上午9:54:18
 */
public interface PermissionCheckCondition extends Condition{
    
    /**
     *  获取验权对象身份信息
     */
    public Principal getPrincipal();
    
    /**
     * 获取验权要验的权限信息
     * @return
     */
    public AbstractPermissionCondition getPermission();

}
