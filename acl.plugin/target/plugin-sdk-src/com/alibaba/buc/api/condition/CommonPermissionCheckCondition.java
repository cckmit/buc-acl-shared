package com.alibaba.buc.api.condition;

import com.alibaba.buc.api.condition.permission.AbstractPermissionCondition;
import com.alibaba.buc.api.principal.Principal;

/**
 * 
 * 类CommonPermissionCheckCondition.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-20 上午9:56:10
 */
public class CommonPermissionCheckCondition implements PermissionCheckCondition{

    /**
     * 验权信息序列化版本号
     */
    private static final long serialVersionUID = 1368448588867360286L;
    
    /**
     * 验权对象
     */
    private Principal principal;
    
    /**
     * 要验的权限
     */
    private AbstractPermissionCondition permission;

    public Principal getPrincipal() {
        return principal;
    }

    public AbstractPermissionCondition getPermission() {
        return permission;
    }

    
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    
    public void setPermission(AbstractPermissionCondition permission) {
        this.permission = permission;
    }
    
    
    
    

}
