package com.alibaba.buc.api.param;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 封装资源权限参数对象
 * 类ResourcePermissionParam.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-3 上午10:11:37
 */
public class ResourcePermissionParam extends PermissionParam implements Serializable {
    
    /**
     * 资源权限对应的操作英文名
     */
    private String operationName;
    
    /**
     * 资源权限对应资源英文名
     */
    private String resourceName;
    
    
    public String getOperationName() {
        return operationName;
    }

    
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    
    public String getResourceName() {
        return resourceName;
    }

    
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 8173305619941259409L;

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
