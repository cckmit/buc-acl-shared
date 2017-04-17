package com.alibaba.buc.api.datapermission.result;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 封装数据信息
 * 类DataResult.java的实现描述：TODO 类实现描述 
 * @author tongxu 2016年10月12日 下午2:57:52
 */
public class DataResult implements Serializable {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -7924933177189043781L;

    /**
     * 对应的资源描述符name，
     */
    private String            resourceDescriptorName;

    /**
     * 数据每个属性的信息
     */
    private List<PropertyValueResult> propertyValueList;
    
    
    public String getResourceDescriptorName() {
        return resourceDescriptorName;
    }
    
    public void setResourceDescriptorName(String resourceDescriptorName) {
        this.resourceDescriptorName = resourceDescriptorName;
    }


    
    public List<PropertyValueResult> getPropertyValueList() {
        return propertyValueList;
    }


    
    public void setPropertyValueList(List<PropertyValueResult> propertyValueList) {
        this.propertyValueList = propertyValueList;
    }


    @Override
    public int hashCode() {
        return  HashCodeBuilder.reflectionHashCode(this);
    }

   
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
	
}
