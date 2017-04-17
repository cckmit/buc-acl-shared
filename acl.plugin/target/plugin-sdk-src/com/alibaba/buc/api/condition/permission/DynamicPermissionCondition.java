package com.alibaba.buc.api.condition.permission;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.condition.Condition;
import com.alibaba.buc.api.condition.operation.OperationCondition;
import com.alibaba.buc.api.condition.resource.ResourceCondition;

/**
 * 封装动态权限信息
 * 类DynamicPermissionCondition.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-20 上午9:59:01
 */
public class DynamicPermissionCondition implements Condition{

    /**
     * 动态权限序列化版本号
     */
    private static final long serialVersionUID = 945599514733350725L;

    /**
     * 权限所属应用英文名，必填
     */
    private String appName;
    
    /**
     * 动态权限里的操作信息
     */
    private OperationCondition operation;
    
    /**
     * 动态权限里的资源信息
     */
    private ResourceCondition resource;

    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(this);
    }

   
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
    
    public OperationCondition getOperation() {
        return operation;
    }

    
    public void setOperation(OperationCondition operation) {
        this.operation = operation;
    }

    
    public ResourceCondition getResource() {
        return resource;
    }

    
    public void setResource(ResourceCondition resource) {
        this.resource = resource;
    }
    
    public String getAppName() {
        return appName;
    }
    
    public void setAppName(String appName) {
        this.appName = appName;
    }
    
    
}
