package com.alibaba.buc.api.condition.resource;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.alibaba.buc.api.condition.Condition;
import com.alibaba.buc.api.condition.attribute.AttributeCondition;

/**
 * 封装资源查询条件信息
 * 类ResourceCondition.java的实现描述：TODO 类实现描述 
 * @author tongxu.ay 2014-3-20 上午10:07:06
 */
public class ResourceCondition implements Condition{

    /**
     * 资源查询条件序列化版本号
     */
    private static final long serialVersionUID = 5287080817588247174L;
    
    /**
     * 资源英文名 
     */
    private String resourceName;
    
    /**
     * 资源类型英文名
     */
    private String resourceTypeName;
    
    /**
     * 父资源
     */
    private ResourceCondition parentResource;
    
    /**
     * 资源属性
     */
    private List<AttributeCondition> attributes;

    
    public String getResourceName() {
        return resourceName;
    }

    
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    
    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    
    public ResourceCondition getParentResource() {
        return parentResource;
    }

    
    public void setParentResource(ResourceCondition parentResource) {
        this.parentResource = parentResource;
    }

    
    public List<AttributeCondition> getAttributes() {
        return attributes;
    }

    
    public void setAttributes(List<AttributeCondition> attributes) {
        this.attributes = attributes;
    }

    
    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(17, 37,this);
    }

   
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
    

}
